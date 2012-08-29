/**
 * Copyright (C) 2011 Jason Fry
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Jason Fry - jasonfry.co.uk
 * @author Habeeb Hooshmand - Add On to Original
 * @version 1.1.8 - base
 * @version 1.0
 * 
 */

package hmh.android.widget.swipeview;

import hmh.android.widget.swipeview.SwipeViewIndicator.OnSwipeViewIndicatorClickListener;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/**
 * Horizontal paging with subviews. Each view has its own page. There is some
 * trouble with ListViews as Children.
 * 
 * 
 * @author Jason Fry - Base SwipeView Class
 * @author Habeeb Hooshmand - JavaDoc & Alterations
 * 
 */
public class SwipeView extends HorizontalScrollView {
    private static int DEFAULT_SWIPE_THRESHOLD = 60;

    private LinearLayout childContainer;
    private Context viewContext;
    private int SCREEN_WIDTH;
    private int motionStartX;
    private int motionStartY;
    private boolean isMostlyScrollingInX = false;
    private boolean isMostlyScrollingInY = false;
    private boolean misMotionIgnored = false;
    protected boolean canCallScrollToPageInOnLayout = false;
    private int currentPage = 0;
    private int itemWidth = 0;
    private OnSwipeListener swipeListener = null;
    private SwipeOnTouchListener swipeOnTouchListener;
    private View.OnTouchListener onTouchListener;
    private SwipeViewIndicator pageIndicator = null;
    private InputMethodManager imeManager;

    /**
     * Starts the SwipeView (for programatic instantiation)
     */
    public SwipeView(Context context) {
	super(context);
	viewContext = context;
	setUp();
    }

    /**
     * Starts the SwipeView (for xml inflation)
     */
    public SwipeView(Context context, AttributeSet attrs) {
	super(context, attrs);
	viewContext = context;
	setUp();
    }

    /**
     * Starts the SwipeView (for xml inflation)
     */
    public SwipeView(Context context, AttributeSet attrs, int defStyle) {
	super(context, attrs, defStyle);
	viewContext = context;
	setUp();
    }

    @SuppressLint("NewApi")
    private void setUp() {
	childContainer = new LinearLayout(viewContext);
	Display display = ((WindowManager) viewContext
		.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
	imeManager = (InputMethodManager) viewContext
		.getSystemService(Context.INPUT_METHOD_SERVICE);
	SCREEN_WIDTH = (int) (display.getWidth());
	itemWidth = SCREEN_WIDTH;
	currentPage = 0;

	childContainer.setOrientation(LinearLayout.HORIZONTAL);
	super.addView(childContainer, -1, new LayoutParams(
		LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
	setSmoothScrollingEnabled(true);
	setHorizontalFadingEdgeEnabled(false);
	setHorizontalScrollBarEnabled(false);

	/* Disables Overscroll animation Gingerbread+ */
	if (Build.VERSION.SDK_INT >= 9) {
	    setOverScrollMode(View.OVER_SCROLL_NEVER);
	}

	swipeOnTouchListener = new SwipeOnTouchListener();
	super.setOnTouchListener(swipeOnTouchListener);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean onTrackballEvent(MotionEvent event) {
	return true;
    }

    @Override
    protected boolean onRequestFocusInDescendants(int direction,
	    Rect previouslyFocusedRect) {
	// this will now pass trackball events down to onTrackballEvent
	return false;
    }

    @Override
    public void requestChildFocus(View child, View focused) {
	// this will now pass trackball events down to
	// onRequestFocusInDescendants
	requestFocus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addView(View child) {
	this.addView(child, -1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addView(View child, int index) {
	ViewGroup.LayoutParams params;
	if (child.getLayoutParams() == null) {
	    params = new LayoutParams(itemWidth, LayoutParams.FILL_PARENT);
	} else {
	    params = child.getLayoutParams();
	    params.width = itemWidth;
	}
	this.addView(child, index, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addView(View child, ViewGroup.LayoutParams params) {
	params.width = itemWidth;
	this.addView(child, -1, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
	requestLayout();
	invalidate();
	childContainer.addView(child, index, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
	super.onLayout(changed, l, t, r, b);
	if (canCallScrollToPageInOnLayout) {
	    setCurrentPage(currentPage, false);
	    canCallScrollToPageInOnLayout = false;
	}
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setOnTouchListener(View.OnTouchListener newOnTouchListener) {
	onTouchListener = newOnTouchListener;
    }

    /**
     * Get the View object that contains all the children of this SwipeView. The
     * same as calling getChildAt(0) A SwipeView behaves slightly differently
     * from a normal ViewGroup, all the children of a SwipeView sit within a
     * LinearLayout, which then sits within the SwipeView object.
     * 
     * @return linearLayout The View object that contains all the children of
     *         this view
     */
    public LinearLayout getChildContainer() {
	return childContainer;
    }

    /**
     * Get the swiping threshold distance to make the screens change
     * 
     * @return swipeThreshold The minimum distance the finger should move to
     *         allow the screens to change
     */
    public int getSwipeThreshold() {
	return DEFAULT_SWIPE_THRESHOLD;
    }

    /**
     * Set the swiping threshold distance to make the screens change
     * 
     * @param swipeThreshold
     *            The minimum distance the finger should move to allow the
     *            screens to change
     */
    public void setSwipeThreshold(int swipeThreshold) {
	DEFAULT_SWIPE_THRESHOLD = swipeThreshold;
    }

    /**
     * Get the current page the SwipeView is on
     * 
     * @return The current page the SwipeView is on
     */
    public int getCurrentPage() {
	return currentPage;
    }

    /**
     * Return the number of pages in this SwipeView
     * 
     * @return Returns the number of pages in this SwipeView
     */
    public int getPageCount() {
	return childContainer.getChildCount();
    }

    /**
     * Scroll to a page and choose whether or not to animate
     * 
     * @param page
     *            The page to scroll to
     */
    public void setCurrentPage(int page, boolean animate) {
	int oldPage = currentPage;
	if (page >= getPageCount() && getPageCount() > 0) {
	    page--;

	} else if (page < 0) {
	    page = 0;
	}

	if (animate) {
	    smoothScrollTo(page * itemWidth, 0);
	} else {
	    scrollTo(page * itemWidth, 0);
	}

	currentPage = page;

	if (swipeListener != null && oldPage != page) {
	    swipeListener.onSwipe(oldPage, page);
	}

	if (pageIndicator != null && oldPage != page) {
	    updateIndicator();
	}

	canCallScrollToPageInOnLayout = !canCallScrollToPageInOnLayout;
    }

    /**
     * Puts you immediatley on the requeted page.
     * 
     * @param page
     */
    public void setCurrentPage(int page) {
	this.setCurrentPage(page, false);
    }

    /**
     * @deprecated use setCurrentPage(page, true) instead
     * @param page
     */
    @Deprecated
    public void smoothScrollToPage(int page) {
	setCurrentPage(page, true);
    }

    /**
     * @deprecated use setCurrentPage(page) instead
     * @param page
     */
    @Deprecated
    public void scrollToPage(int page) {
	setCurrentPage(page);
    }

    /**
     * Set the width of each page. This function returns an integer that should
     * be added to the left margin of the first child and the right margin of
     * the last child. This enables all the children to appear to be central
     * 
     * @param pageWidth
     *            The width you wish to assign for each page
     * @return An integer to add to the left margin of the first child and the
     *         right margin of the last child
     */
    public int setChildWidth(int pageWidth) {
	itemWidth = pageWidth;
	return (SCREEN_WIDTH - itemWidth) / 2;
    }

    /**
     * Set the width of each page by using the layout parameters of a child.
     * Call this function before you add the child to the SwipeView to maintain
     * the child's size. This function returns an integer that should be added
     * to the left margin of the first child and the right margin of the last
     * child. This enables all the children to appear to be central
     * 
     * @param childLayoutParams
     *            A child view that you have added / will add to the SwipeView
     * @return An integer to add to the left margin of the first child and the
     *         right margin of the last child
     */
    public int calculateChildViewSize(MarginLayoutParams childLayoutParams) {
	return setChildWidth(childLayoutParams.leftMargin
		+ childLayoutParams.width + childLayoutParams.rightMargin);
    }

    /**
     * Return the current width of each page
     * 
     * @return Returns the width of each page
     */
    public int getPageWidth() {
	return itemWidth;
    }

    /**
     * Assign a PageControl object to this SwipeView. Call after adding all the
     * children
     * 
     * @param swipeViewIndicator
     *            The PageControl object to assign
     */
    public void setIndicator(SwipeViewIndicator swipeViewIndicator) {
	pageIndicator = swipeViewIndicator;

	swipeViewIndicator.setPageCount(getPageCount());
	swipeViewIndicator.setCurrentPage(currentPage);
	swipeViewIndicator
		.setOnSwipeViewIndicatorClickListener(new OnSwipeViewIndicatorClickListener() {
		    public void goForwards() {
			setCurrentPage(currentPage + 1);
		    }

		    public void goBackwards() {
			setCurrentPage(currentPage - 1);
		    }
		});
    }

    /**
     * Return the current PageControl object
     * 
     * @return Returns the current PageControl object
     */
    public SwipeViewIndicator getIndicator() {
	return pageIndicator;
    }

    /**
     * Implement this listener to listen for page change events
     * 
     * @author Jason Fry - jasonfry.co.uk
     * 
     */
    public interface OnSwipeListener {
	/**
	 * Event for when a page changes
	 * 
	 * @param oldPage
	 *            The page the view was on previously
	 * @param newPage
	 *            The page the view has moved to
	 */
	public abstract void onSwipe(int oldPage, int newPage);
    }

    /**
     * Set the current OnPageChangedListsner
     * 
     * @param onPageChangedListener
     *            The OnSwipeListener object
     */
    public void setOnSwipeListener(OnSwipeListener onPageChangedListener) {
	swipeListener = onPageChangedListener;
    }

    /**
     * Get the current OnPageChangeListsner
     * 
     * @return The current OnSwipeListener
     */
    public OnSwipeListener getOnSwipeListener() {
	return swipeListener;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
	boolean result = super.onInterceptTouchEvent(ev);

	if (ev.getAction() == MotionEvent.ACTION_DOWN) {
	    motionStartX = (int) ev.getX();
	    motionStartY = (int) ev.getY();
	    if (!misMotionIgnored) {
		isMostlyScrollingInX = false;
		isMostlyScrollingInY = false;
	    }
	} else if (ev.getAction() == MotionEvent.ACTION_MOVE) {
	    detectMostlyScrollingDirection(ev);
	}

	if (isMostlyScrollingInY) {
	    return false;
	}
	if (isMostlyScrollingInX) {
	    misMotionIgnored = true;
	    return true;
	}

	return result;
    }

    /**
     * Detects the direction of the scroll
     * 
     * @param ev
     */
    private void detectMostlyScrollingDirection(MotionEvent ev) {
	/*
	 * If we don't know which direction we're going yet.
	 */
	if (!isMostlyScrollingInX && !isMostlyScrollingInY) {
	    float xDistance = Math.abs(motionStartX - ev.getX());
	    float yDistance = Math.abs(motionStartY - ev.getY());

	    if (yDistance > xDistance + 5) {
		isMostlyScrollingInY = true;
	    } else if (xDistance > yDistance + 5) {
		isMostlyScrollingInX = true;
	    }
	}
    }

    /**
     * Hides keyboard
     * 
     * @author Habeeb Hooshmand
     */
    private void hideKeyboard() {
	imeManager.hideSoftInputFromInputMethod(getWindowToken(),
		InputMethodManager.HIDE_NOT_ALWAYS);
    }

    /**
     * Clears the SwipeView from all children (pages)
     * 
     * @author Habeeb Hooshmand
     */
    public void removeAllViews() {
	childContainer.removeAllViews();
    }

    /**
     * Remove child (page) at index.
     */
    public void removeViewAt(int index) {
	childContainer.removeViewAt(index);
    }

    /**
     * Removes child (page) view object
     */
    public void removeView(View child) {
	childContainer.removeView(child);
    }

    /**
     * Use to update the SwipeViewIndicator manually
     */
    public void updateIndicator() {
	this.pageIndicator.setPageCount(getPageCount());
	this.pageIndicator.setCurrentPage(currentPage);
    }

    /**
     * Listens to touches and responds accordingly
     * 
     * @author Habeeb Hooshmand - JavaDoc and Alterations
     * @author Jason Fry
     */
    private class SwipeOnTouchListener implements View.OnTouchListener {
	private boolean isSendingDummyMotionEvent = false;
	private int distanceX;
	private int previousDirection;
	private boolean isFirstMotionEvent = true;

	public boolean onTouch(View v, MotionEvent event) {

	    /*
	     * send on touch event to onTouchListener set by an application
	     * implementing a SwipeView and setting their own onTouchListener
	     */
	    if (onTouchListener != null && !misMotionIgnored
		    || onTouchListener != null && isSendingDummyMotionEvent) {
		if (onTouchListener.onTouch(v, event)) {
		    /*
		     * this comes back if a very quick movement event has
		     * happened over a view with an onClick
		     */
		    if (event.getAction() == MotionEvent.ACTION_UP) {
			/*
			 * need to call the actionUp directly so the view is not
			 * left between pages.
			 */
			actionUp(event);
		    }
		    return true;
		}
	    }

	    /*
	     * if sending the fake action down event (to do with vertical
	     * scrolling within this horizontalscrollview) then just ignore it
	     */
	    if (isSendingDummyMotionEvent) {
		isSendingDummyMotionEvent = false;
		return false;
	    }

	    switch (event.getAction()) {
	    case MotionEvent.ACTION_DOWN:
		return actionDown(event);

	    case MotionEvent.ACTION_MOVE:
		return actionMove(event);

	    case MotionEvent.ACTION_UP:
		return actionUp(event);
	    }
	    return false;
	}

	private boolean actionDown(MotionEvent event) {
	    motionStartX = (int) event.getX();
	    motionStartY = (int) event.getY();
	    isFirstMotionEvent = false;
	    return false;
	}

	private boolean actionMove(MotionEvent event) {
	    int newDistance = motionStartX - (int) event.getX();
	    int newDirection;

	    /* backwards */
	    if (newDistance < 0) {
		/*
		 * the distance +4 is to allow for jitter
		 */
		newDirection = (distanceX + 4 <= newDistance) ? 1 : -1;
	    } else
	    /* forwards */
	    {
		/*
		 * the distance -4 is to allow for jitter
		 */
		newDirection = (distanceX - 4 <= newDistance) ? 1 : -1;
	    }

	    /*
	     * changed direction, so reset start point
	     */
	    if (newDirection != previousDirection && !isFirstMotionEvent) {
		motionStartX = (int) event.getX();
		distanceX = motionStartX - (int) event.getX();
	    } else {
		distanceX = newDistance;
	    }

	    /*
	     * backwards -1, forwards is 1,
	     */
	    previousDirection = newDirection;

	    /*
	     * if the intercept picked it up first, we need to give the
	     * horizontalscrollview ontouch an action down to enable it to
	     * scroll and follow your finger
	     */
	    if (misMotionIgnored) {
		isSendingDummyMotionEvent = true;
		dispatchTouchEvent(MotionEvent.obtain(event.getDownTime(),
			event.getEventTime(), MotionEvent.ACTION_DOWN,
			motionStartX, motionStartY, event.getPressure(),
			event.getSize(), event.getMetaState(),
			event.getXPrecision(), event.getYPrecision(),
			event.getDeviceId(), event.getEdgeFlags()));
		misMotionIgnored = false;

		return true;
	    }
	    return false;
	}

	private boolean actionUp(MotionEvent event) {
	    float fingerUpPosition = getScrollX();
	    float numberOfPages = childContainer.getMeasuredWidth() / itemWidth;
	    float fingerUpPage = fingerUpPosition / itemWidth;
	    float edgePosition = 0;

	    /* forwards */
	    if (previousDirection == 1) {
		/*
		 * if over then go forwards
		 */
		if (distanceX > DEFAULT_SWIPE_THRESHOLD) {
		    /*
		     * if not at the end of the pages, you don't want to try and
		     * advance into nothing!
		     */
		    if (currentPage < (numberOfPages - 1)) {
			edgePosition = (int) (fingerUpPage + 1) * itemWidth;
		    } else {
			edgePosition = (int) (currentPage) * itemWidth;
		    }
		} else
		// return to start position
		{
		    /*
		     * if at the end
		     */
		    if (Math.round(fingerUpPage) == numberOfPages - 1) {
			/*
			 * need to correct for when user starts to scroll into
			 * nothing then pulls it back a bit, this becomes a kind
			 * of forwards scroll instead
			 */
			edgePosition = (int) (fingerUpPage + 1) * itemWidth;
		    } else
		    /* carry on as normal */
		    {
			edgePosition = currentPage * itemWidth;
		    }
		}

	    } else
	    /* backwards */
	    {
		if (distanceX < -DEFAULT_SWIPE_THRESHOLD)// go backwards
		{
		    edgePosition = (int) (fingerUpPage) * itemWidth;
		} else
		/* return to start position */
		{
		    /*
		     * if at beginning, correct
		     */
		    if (Math.round(fingerUpPage) == 0) {
			/*
			 * need to correct for when user starts to scroll into
			 * nothing then pulls it back a bit, this becomes a kind
			 * of backwards scroll instead
			 */
			edgePosition = (int) (fingerUpPage) * itemWidth;
		    } else
		    /* carry on as normal */
		    {
			edgePosition = currentPage * itemWidth;
		    }

		}
	    }

	    setCurrentPage((int) edgePosition / itemWidth, true);
	    hideKeyboard();
	    if (pageIndicator != null) {
		updateIndicator();
	    }
	    isFirstMotionEvent = true;
	    distanceX = 0;
	    isMostlyScrollingInX = false;
	    isMostlyScrollingInY = false;

	    return true;
	}
    }
}
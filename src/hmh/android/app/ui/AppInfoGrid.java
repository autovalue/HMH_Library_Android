/**
 * 
 */
package hmh.android.app.ui;

import hmh.android.R;
import hmh.android.app.AppInfo;
import hmh.android.app.AppInfo.OpenOnClickListener;
import hmh.android.app.adapter.AppInfoAdapter;
import hmh.android.app.util.AppManager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * @author Habeeb Hooshmand
 * 
 */
public class AppInfoGrid extends GridView {

    private List<AppInfo> list;
    private AppInfoAdapter adapter;
    private AppManager appman;
    private boolean uninstallOnLongClick = true;
    private boolean autoLoad = false;

    /**
     * @param context
     */
    public AppInfoGrid(Context context) {
	super(context);
	setUp(context);
    }

    /**
     * @param context
     * @param attrs
     */
    public AppInfoGrid(Context context, AttributeSet attrs) {
	super(context, attrs);
	setUp(context);
    }

    /**
     * @param context
     * @param attrs
     * @param defStyle
     */
    public AppInfoGrid(Context context, AttributeSet attrs, int defStyle) {
	super(context, attrs, defStyle);
	setUp(context);
    }

    private void setUp(Context context) {
	appman = new AppManager(getContext());

	if (autoLoad) {
	    this.list = appman.loadApps();
	} else {
	    this.list = new ArrayList<AppInfo>();
	}
	this.adapter = new AppInfoAdapter(context, R.layout.app_grid_item, list);

	this.setAdapter(adapter);
	this.setOnItemClickListener(new OpenOnClickListener(context, list));
	/*
	 * this.setOnItemLongClickListener(new AppInfo.OnAppLongClickListener(
	 * context, list));
	 */
	this.setNumColumns(GridView.AUTO_FIT);
    }

    public void add(AppInfo info) {
	this.list.add(info);
	this.adapter.notifyDataSetChanged();
    }

    public void addAll(Collection<AppInfo> collection) {
	list.addAll(collection);
	this.adapter.notifyDataSetChanged();
    }

    public AppInfo get(int index) {
	return list.get(index);
    }

    public void remove(int index) {
	list.remove(index);
	adapter.notifyDataSetChanged();
    }

    public boolean doesUninstallOnLongClick() {
	return uninstallOnLongClick;
    }

    public void setUninstallOnLongClick(boolean uninstallOnLongClick) {
	this.uninstallOnLongClick = uninstallOnLongClick;

	if (this.uninstallOnLongClick) {
	    this.setOnItemLongClickListener(new AppInfo.UninstallOnLongClickListener(
		    getContext(), list));
	}
    }

    public boolean shouldAutoLoadApps() {
	return autoLoad;
    }

    public void autoLoadApps(boolean autoLoad) {
	this.autoLoad = autoLoad;

	if (autoLoad) {
	    this.list.clear();
	    list.addAll(appman.loadApps());
	}
    }
}

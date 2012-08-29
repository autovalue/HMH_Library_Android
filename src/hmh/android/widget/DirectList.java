/**
 *
 *@author Habeeb Hooshmand
 */
package hmh.android.widget;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Combines ListView and ArrayAdapter
 * 
 * @author Habeeb Hooshmand
 */
public final class DirectList<Type extends Object> extends ListView {

    private Context superCtxt = null;
    private ArrayList<Type> itms = new ArrayList<Type>();
    private ArrayAdapter<Type> adapt;
    private int type = android.R.layout.simple_list_item_1;

    /**
     * Sets the Context
     * 
     * @author Habeeb Hooshmand
     * @param context
     */
    public DirectList(Context context) {
	super(context);
	superCtxt = context;
	adapt = new ArrayAdapter<Type>(superCtxt, type, itms);
	init();
    }

    /**
     * For XML Instantiation
     * 
     * @author Habeeb Hooshmand
     * @param context
     * @param attrs
     */
    public DirectList(Context context, AttributeSet attrs) {
	super(context, attrs);
	superCtxt = context;
	adapt = new ArrayAdapter<Type>(superCtxt, type, itms);
	init();
    }

    /**
     * Sets up the View
     * 
     * @author Habeeb Hooshmand
     */
    private void init() {
	this.setAdapter(adapt);
	this.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
		LayoutParams.MATCH_PARENT));
	adapt.notifyDataSetChanged();
    }

    /**
     * Adds an item to the List
     * 
     * @author Habeeb Hooshmand
     * @param s
     */
    public void add(Type s) {
	adapt.add(s);
	adapt.notifyDataSetChanged();
    }

    /**
     * Adds a collection to the View
     * 
     * @author Habeeb Hooshmand
     * @param c
     */
    public void addAll(Collection<Type> c) {
	adapt.addAll(c);
	adapt.notifyDataSetChanged();
    }

    /**
     * Gets item
     * 
     * @author Habeeb Hooshmand
     * @param index
     */
    public Type get(Integer index) {
	return this.adapt.getItem(index);
    }

    /**
     * Clears the view
     * 
     * @author Habeeb Hooshmand
     */
    public void clear() {
	this.itms.clear();
	this.adapt.clear();
	this.adapt.notifyDataSetChanged();
    }

    /**
     * Removes item at specified Index
     * 
     * @author Habeeb Hooshmand
     * @param index
     */
    public void remove(Integer index) {
	this.itms.remove(index);
	this.adapt.notifyDataSetChanged();
    }

    /**
     * Checks if the List is Empty or not
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    public boolean isEmpty() {
	if (itms.isEmpty() == true) {
	    return true;
	} else {
	    return false;
	}
    }

    public List<Type> getAsList() {
	return itms;
    }

    @Override
    public final void setAdapter(ListAdapter adapter) {
	super.setAdapter(adapter);
    }

    public void setItemType(int resId) {
	this.type = resId;
	adapt = new ArrayAdapter<Type>(superCtxt, type, itms);
	this.setAdapter(adapt);
    }

    /**
     * 
     * @author Habeeb Hooshmand
     * 
     */
    public static class itemClickListener implements OnItemClickListener {
	@Override
	public void onItemClick(AdapterView<?> adapterVeie, View v,
		int position, long id) {
	    // TODO Make Stuff Happen
	}
    }

}

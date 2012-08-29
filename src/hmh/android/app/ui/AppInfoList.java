/**
 * 
 */
package hmh.android.app.ui;

import java.util.ArrayList;
import java.util.Collection;

import hmh.android.R;
import hmh.android.app.AppInfo;
import hmh.android.app.AppInfo.OpenOnClickListener;
import hmh.android.app.adapter.AppInfoAdapter;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * @author Habeeb Hooshmand
 * 
 */
public class AppInfoList extends ListView {
    private ArrayList<AppInfo> list;
    // private List<HashMap<String, Object>> displist;
    // private SimpleAdapter adapter;
    private AppInfoAdapter adapter;

    public AppInfoList(Context context) {
	super(context);
	setUp(context);
    }

    public AppInfoList(Context context, AttributeSet attrs) {
	super(context, attrs);
	setUp(context);
    }

    public AppInfoList(Context context, AttributeSet attrs, int defStyle) {
	super(context, attrs, defStyle);
	setUp(context);
    }

    private void setUp(Context context) {
	list = new ArrayList<AppInfo>();
	// displist = new ArrayList<HashMap<String, Object>>();
	adapter = new AppInfoAdapter(context, R.layout.app_list_item, list);
	/*
	 * adapter = new SimpleAdapter(context, displist,
	 * R.layout.image_list_item, new String[] { "Text", "Icon" }, new int[]
	 * { R.id.name, R.id.icon });
	 */

	this.setOnItemClickListener(new OpenOnClickListener(context, list));
	/*
	 * this.setOnItemLongClickListener(new
	 * AppInfo.OnAppLongClickListener(context, list));
	 */
	this.setAdapter(adapter);

    }

    public void add(AppInfo info) {
	list.add(info);
	// buildList(list);
	adapter.notifyDataSetChanged();
    }

    public void addAll(Collection<AppInfo> collection) {
	list.addAll(collection);
	// buildList(list);
	adapter.notifyDataSetChanged();
    }

    public AppInfo get(int index) {
	return list.get(index);
    }

    public void clear() {
	this.list.clear();
	// buildList(list);
	adapter.notifyDataSetChanged();
    }

}

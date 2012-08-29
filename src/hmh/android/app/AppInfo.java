/**
 * 
 */
package hmh.android.app;

import java.util.List;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;

/**
 * @author Habeeb Hooshmand
 * 
 */
public class AppInfo {
    private Intent intent;
    public Drawable icon;
    private CharSequence name;
    private String pack;

    public CharSequence getName() {
	return name;
    }

    public void setName(CharSequence charSequence) {
	this.name = charSequence;
    }

    public Intent getIntent() {
	return intent;
    }

    public void setActivity(ComponentName cn, Integer flags) {
	intent = new Intent(Intent.ACTION_MAIN);
	intent.addCategory(Intent.CATEGORY_LAUNCHER);
	intent.setComponent(cn);
	intent.setFlags(flags);
    }

    public void setActivity(Intent i) {
	intent = i;
    }

    public String getPackage() {
	return pack;
    }

    public void setPackage(String pack) {
	this.pack = pack;
    }

    public Intent getUninstallIntent() {
	Intent i = new Intent(Intent.ACTION_DELETE, Uri.parse("package:"
		+ getPackage()));

	return i;
    }

    public static class OpenOnClickListener implements OnItemClickListener {
	private final Context classContext;
	private final List<AppInfo> list;

	public OpenOnClickListener(Context context, List<AppInfo> items) {
	    this.classContext = context;
	    this.list = items;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.widget.AdapterView.OnItemClickListener#onItemClick(android
	 * .widget.AdapterView, android.view.View, int, long)
	 */
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position,
		long id) {
	    this.classContext.startActivity(list.get(position).getIntent());

	}

    }

    public static class UninstallOnLongClickListener implements
	    OnItemLongClickListener {

	private final Context classContext;
	private final List<AppInfo> list;

	public UninstallOnLongClickListener(Context context, List<AppInfo> items) {
	    this.classContext = context;
	    this.list = items;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.widget.AdapterView.OnItemLongClickListener#onItemLongClick
	 * (android.widget.AdapterView, android.view.View, int, long)
	 */
	@Override
	public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
		int position, long id) {
	    this.classContext.startActivity(list.get(position)
		    .getUninstallIntent());
	    return true;
	}

    }

}

/**
 * 
 */
package hmh.android.app.adapter;

import hmh.android.R;
import hmh.android.app.AppInfo;

import java.util.List;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TableLayout.LayoutParams;
import android.widget.TextView;

/**
 * @author Habeeb Hooshmand
 * 
 */
public class AppInfoAdapter extends ArrayAdapter<AppInfo> {
    private Context context;
    private List<AppInfo> applist;
    private int type;

    /**
     * @param context
     * @param textViewResourceId
     * @param objects
     */
    public AppInfoAdapter(Context context, int resId, List<AppInfo> objects) {
	super(context, resId, objects);
	this.context = context;
	this.applist = objects;
	this.type = resId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
	final AppInfo info = applist.get(position);
	Resources resources = context.getResources();

	if (convertView == null) {
	    convertView = LayoutInflater.from(context).inflate(this.type,
		    parent, false);
	}

	ImageView image = (ImageView) convertView.findViewById(R.id.icon);
	TextView title = (TextView) convertView.findViewById(R.id.name);

	Drawable icon = info.getIcon();
	String name = info.getName().toString();

	title.setText(name);

	int width = (int) resources.getDimension(android.R.dimen.app_icon_size);
	int height = (int) resources
		.getDimension(android.R.dimen.app_icon_size);

	if (icon instanceof PaintDrawable) {
	    PaintDrawable painter = (PaintDrawable) icon;
	    painter.setIntrinsicWidth(width);
	    painter.setIntrinsicHeight(height);
	} else {
	    image.setLayoutParams(new LayoutParams(width, height));
	}

	image.setImageDrawable(icon);

	return convertView;
    }
}
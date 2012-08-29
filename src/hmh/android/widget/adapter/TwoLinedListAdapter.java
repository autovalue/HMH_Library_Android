/**
 * 
 */
package hmh.android.widget.adapter;

import java.util.List;

import hmh.util.LinkedMap;

import hmh.android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author Habeeb Hooshmand
 * 
 */
public class TwoLinedListAdapter extends
	ArrayAdapter<LinkedMap<String, String>> {

    private Context context;
    private int resource;
    private float textSize = 20;
    private Typeface typeface;

    /**
     * @param context
     * @param resource
     * @param textViewResourceId
     * @param objects
     */
    public TwoLinedListAdapter(Context context, int resource,
	    List<LinkedMap<String, String>> objects) {
	super(context, resource, 0, objects);

	this.context = context;
	this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
	LinearLayout view = (LinearLayout) LayoutInflater.from(context)
		.inflate(resource, null);

	TextView text1 = (TextView) view.findViewById(R.id.text1);
	TextView text2 = (TextView) view.findViewById(R.id.text2);

	text1.setTextSize(textSize);
	text1.setTypeface(typeface);
	text1.setText(getItem(position).get("Title"));

	text2.setTextSize(textSize);
	text2.setTypeface(typeface);
	text2.setText(getItem(position).get("Subtitle"));

	convertView = view;

	return view;
    }

    public void setTextSize(float size) {
	this.textSize = size;
    }

    public void setTypeFace(Typeface tf) {
	this.typeface = tf;
    }

}

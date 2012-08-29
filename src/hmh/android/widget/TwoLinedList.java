package hmh.android.widget;

import hmh.android.R;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import android.widget.SimpleAdapter;

@Deprecated
public class TwoLinedList extends ListView {

    private List<HashMap<String, String>> itms = new ArrayList<HashMap<String, String>>();
    private SimpleAdapter adapt;
    private int type = R.layout.two_lined_list_item_default;
    static InputStream example;

    public TwoLinedList(Context context) {
	super(context);
	initLayout();
    }

    /**
     * 
     * 
     * @author Habeeb Hooshmand
     * @param context
     * @param attrs
     */
    public TwoLinedList(Context context, AttributeSet attrs) {
	super(context, attrs);
	initLayout();
    }

    private void initLayout() {
	this.adapt = new SimpleAdapter(getContext(), itms, type, new String[] {
		"Title", "Subtitle" }, new int[] { R.id.text1, R.id.text2 });

	this.setAdapter(adapt);
	this.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
		LayoutParams.MATCH_PARENT));
	this.adapt.notifyDataSetChanged();

    }

    public void add(String title, String subtitle) {
	HashMap<String, String> item = new HashMap<String, String>();
	item.put("Title", title);
	item.put("Subtitle", subtitle);
	this.itms.add(item);
	this.adapt.notifyDataSetChanged();
    }

    public void remove(int index) {
	this.itms.remove(index);
	this.adapt.notifyDataSetChanged();
    }

    public String getTitle(int index) {
	return this.itms.get(index).get("Title");
    }

    public String getSubtitle(int index) {
	return this.itms.get(index).get("Subtitle");
    }

    public void clear() {
	this.itms.clear();
	this.adapt.notifyDataSetChanged();
    }

    public boolean isEmpty() {
	return itms.isEmpty();
    }

    /**
     * Use only layouts based on the default one in res/raw
     * 
     * @author Habeeb Hooshmand
     * @param id
     */
    public void setTwoLinedListType(int id) {
	type = id;
	initLayout();
    }

}
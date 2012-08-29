/**
 * 
 */
package hmh.deprecated.android.util;

import java.util.ArrayList;
import java.util.Collection;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * @author Habeeb Hooshmand
 * 
 */
@Deprecated
public class SPList extends ArrayList<String> {
    private static final long serialVersionUID = -5507163145196965369L;

    private SharedPreferences sharedPrefs;
    private Context context;

    public SPList(Context context) {
	this.context = context;
	this.sharedPrefs = context.getSharedPreferences("SPList",
		Context.MODE_PRIVATE);
    }

    @Override
    public boolean add(String s) {
	super.add(s);

	syncToSharedPrefs();

	return true;
    }

    @Override
    public boolean addAll(Collection<? extends String> collection) {
	super.addAll(collection);

	syncToSharedPrefs();

	return true;
    }

    @Override
    public String get(int index) {
	syncFromSharedPrefs();

	return super.get(index);
    }

    @Override
    public String remove(int index) {
	super.remove(index);

	syncToSharedPrefs();

	return "";
    }

    public final void syncToSharedPrefs() {
	Editor editor = sharedPrefs.edit();

	editor.putInt("size", size());

	for (int i = 0; i < size(); i++) {
	    editor.putString(Integer.toString(i), getItem(i)).commit();
	}
    }

    public final void syncFromSharedPrefs() {
	int size = sharedPrefs.getInt("size", 0);

	for (int i = 0; i < size; i++) {
	    String next = sharedPrefs.getString(Integer.toString(i), "");

	    addItem(next);
	}
    }

    /**
     * @param index
     * @return
     */
    private String getItem(int index) {
	return super.get(index);
    }

    /**
     * @param index
     * @return
     */
    private void addItem(String object) {
	super.add(object);
    }

    public Context getContext() {
	return context;
    }
}

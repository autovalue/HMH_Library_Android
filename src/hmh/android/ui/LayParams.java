/**
 *
 *@author Habeeb Hooshmand
 */
package hmh.android.ui;

import android.app.Activity;
import android.view.ViewGroup.LayoutParams;

/**
 * 
 * @author Habeeb Hooshmand
 */
public class LayParams extends Activity {
    /**
     * width = Match Parent. height = Match Parent.
     * 
     * @author Habeeb Hooshmand
     */
    public static LayoutParams mm = new LayoutParams(LayoutParams.MATCH_PARENT,
	    LayoutParams.MATCH_PARENT);
    /**
     * width = Wrap Content. height = Match Parent.
     * 
     * @author Habeeb Hooshmand
     */
    public static LayoutParams wm = new LayoutParams(LayoutParams.WRAP_CONTENT,
	    LayoutParams.MATCH_PARENT);
    /**
     * width = Match Parent. height = Wrap Content.
     * 
     * @author Habeeb Hooshmand
     */
    public static LayoutParams mw = new LayoutParams(LayoutParams.MATCH_PARENT,
	    LayoutParams.WRAP_CONTENT);
    /**
     * width = Wrap Content. height = Wrap Content.
     * 
     * @author Habeeb Hooshmand
     */
    public static LayoutParams ww = new LayoutParams(LayoutParams.WRAP_CONTENT,
	    LayoutParams.WRAP_CONTENT);

}

/**
 * 
 */
package hmh.android;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author Habeeb Hooshmand
 * 
 */
@Deprecated
public abstract class BaseActivity extends Activity {
    /**
     * Called on the start of the activity
     * 
     * @author Habeeb Hooshmand
     */
    @Deprecated
    @Override
    public void onCreate(Bundle bundle) {
	super.onCreate(bundle);
    }

    /**
     * Called Automatically at the end of the
     * 
     * @author Habeeb Hooshmand
     */
    @Deprecated
    public abstract void setUp();

}

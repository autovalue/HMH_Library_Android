/**
 *
 *@author Habeeb Hooshmand
 */
package hmh.deprecated;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.io.PrintStream;

/**
 * LEGACY CLASS. DEPRECIATED. DO NOT USE. Original package: hmh.system ALL ITEMS
 * IN THIS PACKAGE ARE DEPRECIATED DO NOT USE THEM. BETTER THINGS HAVE BEEN
 * MADE. Moved on 3/10/12.
 * 
 * @author Habeeb Hooshmand
 */
@Deprecated
@DevStage(stage = Stage.RETIRED, working = Working.YES)
public class Error extends PrintStream {

    /**
     * 
     * @author Habeeb Hooshmand
     * @param out
     */
    @Deprecated
    public Error(PrintStream err) {
	super(err);
	// TODO Auto-generated constructor stub
    }

}

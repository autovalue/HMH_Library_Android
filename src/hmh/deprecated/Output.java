/**
 *@author Habeeb Hooshmand
 */
package hmh.deprecated;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.io.OutputStream;
import java.io.PrintStream;

/**
 * 
 * LEGACY CLASS. DEPRECIATED. DO NOT USE. Shorter System.out References.
 * Original package: hmh.system ALL ITEMS IN THIS PACKAGE ARE DEPRECIATED DO NOT
 * USE THEM. BETTER THINGS HAVE BEEN MADE. Moved on 3/10/12.
 * 
 * @author Habeeb Hooshmand
 * 
 */
@Deprecated
@DevStage(stage = Stage.RETIRED, working = Working.YES)
public class Output extends PrintStream {

    /**
     * @param out
     */
    @Deprecated
    public Output(OutputStream out) {
	super(out);
	// TODO Auto-generated constructor stub
    }

}

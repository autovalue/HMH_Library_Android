/**
 *@author Habeeb Hooshmand
 */
package hmh.deprecated;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.io.IOException;
import java.io.InputStream;

/**
 * LEGACY CLASS. DEPRECIATED. DO NOT USE. Shorter System.in Reference. Original
 * package: hmh.system ALL ITEMS IN THIS PACKAGE ARE DEPRECIATED DO NOT USE
 * THEM. BETTER THINGS HAVE BEEN MADE. Moved on 3/10/12.
 * 
 * 
 * 
 * @author Habeeb Hooshmand
 * 
 */
@Deprecated
@DevStage(stage = Stage.RETIRED, working = Working.YES)
public class Input extends InputStream {

    /*
     * (non-Javadoc)
     * 
     * @see java.io.InputStream#read()
     */
    @Override
    public int read() throws IOException {
	// TODO Auto-generated method stub
	return 0;
    }

}

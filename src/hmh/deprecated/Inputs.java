/**
 *
 *@author Habeeb Hooshmand
 */
package hmh.deprecated;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Habeeb Hooshmand
 */
@Deprecated
@DevStage(stage = Stage.RETIRED, working = Working.UNTESTED)
public class Inputs {
    private InputStream in = null;

    public Inputs(InputStream in) {
	this.in = in;
    }

    /**
     * Returns the Result of Countinuous inputs
     * 
     * @author Habeeb Hooshmand
     * @param repitions
     * @param inputContainsSpaces
     * @return
     */
    @SuppressWarnings("resource")
    public ArrayList<String> getCountinuousInput(int repitions,
	    boolean containsSpaces) {
	Scanner sc = new Scanner(in);
	ArrayList<String> a = new ArrayList<String>();

	for (int i = 0; i < repitions; i++) {
	    String x = null;

	    if (containsSpaces == true) {
		x = sc.nextLine();

	    } else {
		x = sc.next();
	    }
	    a.add(x);
	}
	return a;

    }

}

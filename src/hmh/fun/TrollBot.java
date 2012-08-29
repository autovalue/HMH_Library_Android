/**
 *@author Habeeb Hooshmand
 */
package hmh.fun;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

/**
 * Self Explanatory Class Name ;-)
 * 
 * @author Habeeb Hooshmand
 * 
 */
@DevStage(stage = Stage.FINAL_RELEASE, working = Working.YES)
public class TrollBot {

    private int duration = 0;

    // private String stringToRepeat = null;

    /**
     * 
     * @author Habeeb Hooshmand
     * @param repitions
     */
    public TrollBot(int repitions) {
	// this.stringToRepeat = string;
	this.duration = repitions;
    }

    /**
     * Prints out a String for an X ammout of times
     * 
     * @author Habeeb Hooshmand
     */
    public void init() {
	System.out.print("\nTroll");
	for (int i = 0; i < duration; i++) {
	    System.out.print("olol");

	    int x = i * 15;
	    if (x % 15 == 0 && x % 3 != 0) {
		System.out.print("\n");
	    }
	}
    }
}

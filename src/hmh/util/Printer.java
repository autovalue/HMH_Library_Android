/**
 *@author Habeeb Hooshmand
 */
package hmh.util;

import hmh.deprecated.Printing;
import hmh.util.annotation.*;

import java.io.PrintStream;

/**
 * @author Habeeb Hooshmand
 *
 */
/**
 * This Class Prints out only one type value for it's entire "Life". Can save
 * and print only one: String, Integer, Double, Boolean, Long, Float, Binary.
 * Only good for printing the same Value multiple times. Contains some of the
 * Printing Styles seen in PrintTools
 * 
 * @author Habeeb Hooshmand
 * 
 */
@DevStage(stage = Stage.RELEASE, working = Working.YES)
public class Printer<Type extends Object> {
    private PrintStream output = System.out;
    private Printing pt = new Printing();

    private Type O = null;

    /**
     * Prints An Object Type (Use Objects.parseObjects();)
     * 
     * @author Habeeb Hooshmand
     * @param o
     */
    public Printer(Type o) {
	O = o;

    }

    /**
     * Prints the Item and Terminates the Line.
     * 
     * @author Habeeb Hooshmand
     */
    public void println() {
	output.println(O);
    }

    /**
     * Prints the Item.
     * 
     * @author Habeeb Hooshmand
     */
    public void print() {
	output.print(O);
    }

    /**
     * Prints Each Letter separatly like it is Being typed
     * 
     * @author Habeeb Hooshmand
     * @param delayTime
     */
    public void TypeWrite(Double delayTime) {
	pt.TypeWrite(Objects.toString(O), delayTime);
    }

    /**
     * Prints Each Letter separatly like it is Being typed and Terminates the
     * Line.
     * 
     * @author Habeeb Hooshmand
     * @param delayTime
     */
    public void TypeWritel(Double delayTime) {
	pt.TypeWritel(Objects.toString(O), (delayTime));
    }

    /**
     * Reprints the item on the same line
     * 
     * @author Habeeb Hooshmand
     * @param times
     */
    public void reprint(int times) {
	pt.reprint(Objects.toString(O), times);
    }

    /**
     * Reprints and Terminates the Line.
     * 
     * @author Habeeb Hooshmand
     * @param times
     */
    public void reprintl(int times) {
	pt.reprint(Objects.toString(O), times);
    }

}

/**
 *
 *@author Habeeb Hooshmand
 */
package hmh.util;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

/**
 * Different tools for Objects not provided by Java
 * 
 * @author Habeeb Hooshmand
 */
@DevStage(stage = Stage.FINAL_RELEASE, working = Working.YES)
public final class Objects {

    /**
     * Returns the Object value of a String
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @return
     */
    public static Object parseObject(String s) {
	return s;
    }

    /**
     * Returns the Object value of an Integer
     * 
     * @author Habeeb Hooshmand
     * @param i
     * @return
     */
    public static Object parseObject(Integer i) {
	return i;
    }

    /**
     * Returns the Object value of a Double
     * 
     * @author Habeeb Hooshmand
     * @param d
     * @return
     */
    public static Object parseObject(Double d) {
	return d;
    }

    /**
     * Returns the Object value of a Long
     * 
     * @author Habeeb Hooshmand
     * @param l
     * @return
     */
    public static Object parseObject(Long l) {
	return l;
    }

    /**
     * Returns the Object value of a Boolean
     * 
     * @author Habeeb Hooshmand
     * @param b
     * @return
     */
    public static Object parseObject(Boolean b) {
	return b;
    }

    /**
     * Returns the Object value of a Short
     * 
     * @author Habeeb Hooshmand
     * @param b
     * @return
     */
    public static Object parseObject(Short s) {
	return s;
    }

    /**
     * Turns Object to String
     * 
     * @author Habeeb Hooshmand
     * @param o
     * @return
     */
    public static String toString(Object o) {
	return o.toString();
    }

}

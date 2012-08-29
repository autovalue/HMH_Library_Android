/**
 *@author Habeeb Hooshmand
 */
package hmh.util;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

/**
 * @author Habeeb Hooshmand
 * 
 */
@DevStage(stage = Stage.RELEASE, working = Working.UNTESTED)
public final class Binaries {

    /**
     * Returns the Integer value of the Binary String
     * 
     * @param binary
     * @return
     */
    public static Integer toInt(String binary) {
	return Integer.parseInt(binary, 2);

    }

    /**
     * Returns the Long value of the Binary String
     * 
     * @param binary
     * @return
     */
    public static Long toLong(String binary) {
	return Long.parseLong(binary, 2);

    }

    /**
     * Turns a non-binary string into a BinaryString
     * 
     * @author Habeeb Hooshmand
     * @param intString
     * @return
     */
    public static String parseBinary(String intString) {
	Integer i = Integer.parseInt(intString);
	return Integer.toBinaryString(i);
    }

    /**
     * Turns a Double into Binary String
     * 
     * @param integer
     * @return
     */
    public static String parseBinary(Long l) {
	return Long.toBinaryString(l);
    }

    /**
     * Turns Integer into Binary String
     * 
     * @param integer
     * @return
     */
    public static String parseBinary(Integer integer) {
	return Integer.toBinaryString(integer);
    }

    /**
     * Turns Short into Binary String
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @return
     */
    public static String parseBinary(Short s) {
	return Integer.toBinaryString(s);
    }
}

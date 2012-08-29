/**
 *@author Habeeb Hooshmand
 */
package hmh.deprecated;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Methods that act upon Strings. Must initialize as static or in staitc method
 * to use in static context.
 * 
 * @author Habeeb Hooshmand
 */
@Deprecated
@DevStage(stage = Stage.RETIRED, working = Working.YES)
public final class Strings {

    /**
     * Finds if one String matches another
     * 
     * @author Habeeb Hooshmand
     * @param pattern
     * @param itemToSearch
     * @return True or False (Depending on if item matches)
     */
    @Deprecated
    public static Matcher match(java.lang.String pattern,
	    java.lang.String itemToSearch) {
	Pattern p = java.util.regex.Pattern.compile(pattern);
	Matcher m = p.matcher(itemToSearch);
	return m;
    }

    /**
     * Removes all instances of a Character from a String
     * 
     * @author Habeeb Hooshmand
     * @param stringToChange
     * @param charToRemove
     * @return
     */
    @Deprecated
    public static String removeChar(String stringToChange,
	    Character charToRemove) {
	Character n = charToRemove;
	String retVal = null;
	String retValL = stringToChange.replaceAll(n.toString().toLowerCase(),
		"");
	String retValU = retValL.replaceAll(n.toString().toUpperCase(), "");
	retVal = retValU;

	return retVal;
    }

    /**
     * Removes all instances of a String form a String.
     * 
     * @param stringToChange
     * @param stringToRemove
     * @return
     */
    @Deprecated
    public static String removeString(String stringToChange,
	    String stringToRemove) {
	String n = stringToRemove;
	String retVal = null;
	String retValL = stringToChange.replaceAll(n.toString().toLowerCase(),
		"");
	String retValU = retValL.replaceAll(n.toString().toUpperCase(), "");
	retVal = retValU;

	return retVal;
    }

    /**
     * Turns Double into String
     * 
     * @param d
     *            Double d
     * @return
     */
    @Deprecated
    public static String toString(Double d) {
	return d.toString();
    }

    /**
     * Turns Double into String
     * 
     * @param i
     *            Integer i
     * @return
     */
    @Deprecated
    public static String toString(Integer i) {
	return i.toString();
    }

    /**
     * Turns Double into String
     * 
     * @param l
     *            Long l
     * @return
     */
    @Deprecated
    public static String toString(Long l) {
	return l.toString();
    }

    /**
     * Turns Double into String
     * 
     * @param f
     *            Float f
     * @return
     */
    @Deprecated
    public static String toString(Float f) {
	return f.toString();
    }

    /**
     * Finds Length of String
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @return
     */
    @Deprecated
    public static Integer length(String s) {
	return s.length();
    }

    /**
     * Finds how many times a Character occurs in a String.
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param c
     * @return
     */
    @Deprecated
    public static Integer occurs(String s, Character c) {
	return s.lastIndexOf(c) + 1;
    }
}

/**
 *
 *@author Habeeb Hooshmand
 */
package hmh.util;

import hmh.deprecated.util.Lists;
import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Habeeb Hooshmand
 */
@DevStage(stage = Stage.RELEASE, working = Working.YES)
public class Strings {

    /**
     * Turns String into String LOL
     * 
     * @param string
     * @return
     */
    public static String parseString(String string) {
	return string;
    }

    /**
     * turns Integer to String
     * 
     * @author Habeeb Hooshmand
     * @param i
     * @return
     */
    public static String parseString(Integer i) {
	return i.toString();
    }

    /**
     * Turns Double into String
     * 
     * @author Habeeb Hooshmand
     * @param d
     * @return
     */
    public static String parseString(Double d) {
	return d.toString();
    }

    /**
     * Turns Float into String
     * 
     * @author Habeeb Hooshmand
     * @param d
     * @return
     */
    public static String parseString(Float f) {
	return f.toString();
    }

    /**
     * Turns Long into String
     * 
     * @author Habeeb Hooshmand
     * @param d
     * @return
     */
    public static String parseString(Long l) {
	return l.toString();
    }

    /**
     * Finds if one String matches another
     * 
     * @author Habeeb Hooshmand
     * @param pattern
     * @param itemToSearch
     * @return True or False (Depending on if item matches)
     */
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
    public static String remove(String stringToChange, Character charToRemove) {
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
    public static String remove(String stringToChange, String stringToRemove) {
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
    public static Integer occurs(String s, Character c) {
	return s.lastIndexOf(c) + 1;
    }

    public static Boolean consistsOf(String tested, String Letters) {
	String[] s = new String[Letters.length()];

	for (int i = 0; i < Letters.length(); i++) {
	    Character c = Letters.charAt(i);
	    s[i] = tested.toLowerCase().replaceAll(c.toString().toLowerCase(),
		    "");
	}

	if (s[s.length - 1].contentEquals("")) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * Returns an ArrayList containing all of the characters of the String
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @return
     */
    public static ArrayList<Character> toChars(String s) {
	ArrayList<Character> n = new ArrayList<Character>();

	for (int i = 0; i < s.length(); i++) {
	    n.add(s.charAt(i));
	}

	return n;
    }

    public static Integer indexOfCharBefore(String part, String full, char c) {
	int i = 0;

	char x = full.charAt(full.indexOf(part) - i);

	while (x != c) {
	    i++;
	    x = full.charAt(full.indexOf(part) - i);
	}

	return i + 1;

    }

    @Deprecated
    public static class Scrambler {
	@Deprecated
	private String str = null;
	private ArrayList<Character> c;

	/**
	 * Constructor
	 * 
	 * @author Habeeb Hooshmand
	 * @param s
	 * 
	 */
	@Deprecated
	public Scrambler(String s) {
	    str = s;
	    load();
	}

	/**
	 * Scrambles string
	 * 
	 * @author Habeeb Hooshmand
	 * @return
	 */
	@Deprecated
	@SuppressWarnings("unchecked")
	public String scramble() {
	    String retVal = "";
	    ArrayList<Character> n = Lists.shuffle(c);

	    for (int i = 0; i < n.size(); i++) {
		retVal += n.get(i);
	    }

	    return retVal;
	}

	/**
	 * Reverses String
	 * 
	 * @author Habeeb Hooshmand
	 * @return
	 */
	@Deprecated
	public String reverse() {
	    String n = str;
	    StringBuffer sb = new StringBuffer(n);

	    return sb.reverse().toString();
	}

	/**
	 * Gets Original String
	 * 
	 * @author Habeeb Hooshmand
	 * @return
	 */
	@Deprecated
	public String getString() {
	    return str;
	}

	/**
	 * Removes Character at Index
	 * 
	 * @author Habeeb Hooshmand
	 * @param index
	 * @return
	 */
	@Deprecated
	public String removeCharAt(Integer index) {
	    String n = str;
	    StringBuffer sb = new StringBuffer(n);

	    return sb.deleteCharAt(index).toString();
	}

	/**
	 * loads it all up
	 * 
	 * @author Habeeb Hooshmand
	 */
	@Deprecated
	private void load() {
	    c = new ArrayList<Character>();

	    for (int i = 0; i < str.length(); i++) {
		c.add(str.charAt(i));
	    }

	}
    }

}

/**
 *
 *@author Habeeb Hooshmand
 */
package hmh.util;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.text.DecimalFormat;

/**
 * Number Options not included in standard jdk
 * 
 * @author Habeeb Hooshmand
 */
@DevStage(stage = Stage.RELEASE, working = Working.YES)
public class Numbers {

    /**
     * Turns Integer to long
     * 
     * @author Habeeb Hooshmand
     * @param i
     * @return
     */
    public static Long parseLong(Integer i) {
	return (long) (i);
    }

    /**
     * Turns Short into Long
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @return
     */
    public static Long parseLong(Short s) {
	return (long) (s);
    }

    /**
     * Turns String into Long
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @return
     */
    public static Long parseLong(String s) {
	return Long.parseLong(s);
    }

    /**
     * Turns Double into Long
     * 
     * @author Habeeb Hooshmand
     * @param d
     * @return
     */
    public static Long parseLong(Double d) {
	DecimalFormat df = new DecimalFormat("####");
	String s = df.format(d);
	return Long.parseLong(s);
    }

    /**
     * Turns Double into Long
     * 
     * @author Habeeb Hooshmand
     * @param d
     * @return
     */
    public static Long parseLong(Float f) {
	DecimalFormat df = new DecimalFormat("####");
	String s = df.format(f);
	return Long.parseLong(s);
    }

    /**
     * Turns Integer into Double
     * 
     * @author Habeeb Hooshmand
     * @param i
     * @return
     */
    public static Double parseDouble(Integer i) {
	return i * 1.0;
    }

    /**
     * Turns Long into Double
     * 
     * @author Habeeb Hooshmand
     * @param i
     * @return
     */
    public static Double parseDouble(Long l) {
	return l * 1.0;
    }

    /**
     * Turns Short into Double
     * 
     * @author Habeeb Hooshmand
     * @param i
     * @return
     */
    public static Double parseDouble(Short s) {
	return s * 1.0;
    }

    /**
     * Turns String into Double
     * 
     * @author Habeeb Hooshmand
     * @param i
     * @return
     */
    public static Double parseDouble(String s) {
	return Double.parseDouble(s);
    }

    /**
     * Turns Float into Double
     * 
     * @author Habeeb Hooshmand
     * @param i
     * @return
     */
    public static Double parseDouble(Float f) {
	return Double.parseDouble(f.toString());
    }

    /**
     * Turns Integer into Float
     * 
     * @author Habeeb Hooshmand
     * @param i
     * @return
     */
    public static Float parseFloat(Integer i) {
	return (float) (i * 1.0);
    }

    /**
     * Turns Long into Float
     * 
     * @author Habeeb Hooshmand
     * @param i
     * @return
     */
    public static Float parseFloat(Long l) {
	return (float) (l * 1.0);
    }

    /**
     * Turns Short into Float
     * 
     * @author Habeeb Hooshmand
     * @param i
     * @return
     */
    public static Float parseFloat(Short s) {
	return (float) (s * 1.0);
    }

    /**
     * Turns String into Float
     * 
     * @author Habeeb Hooshmand
     * @param i
     * @return
     */
    public static Float parseFloat(String s) {
	return Float.parseFloat(s);
    }

    /**
     * Turns Float into Float
     * 
     * @author Habeeb Hooshmand
     * @param i
     * @return
     */
    public static Float parseFloat(Double d) {
	return Float.parseFloat(d.toString());
    }

    /**
     * Turns Short into an Integer
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @return
     */
    public static Integer parseInt(Short s) {
	return (int) (s);
    }

    /**
     * Turns Double into an Integer
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @return
     */
    public static Integer parseInt(Double d) {
	DecimalFormat df = new DecimalFormat("####");
	String s = df.format(d);
	return Integer.parseInt(s);
    }

    /**
     * Turns Long into an Integer
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @return
     */
    public static Integer parseInt(Long l) {
	return Integer.parseInt(l.toString());

    }

    /**
     * Turns Float into an Integer
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @return
     */
    public static Integer parseInt(Float f) {
	DecimalFormat df = new DecimalFormat("####");
	String s = df.format(f);
	return Integer.parseInt(s);
    }

    /**
     * Turns String into an Integer
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @return
     */
    public static Integer parseInt(String s) {
	return parseInt(Double.parseDouble(s));
    }

    /**
     * Checks if a String can be a valid Number
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @return
     */
    public static Boolean isValidNumberString(String s) {
	String[] ch = { " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
		"k", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
		"x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I",
		"J", "K", "L", "M", "O", "P", "Q", "R", "S", "T", "U", "V",
		"W", "X", "Y", "Z", "!", "@", "#", "$", "%", "^", "&", "*",
		"(", ")", "_", "+", "-", "=", "{", "}", "\\", "|", ":", ";",
		"\'", ".", ",", "<", ">", "?", "'", "/", "`", "~", ",", "[",
		"]", "{", "}", "\n" };

	for (int x = ch.length - 1; x > 0; x--) {

	    if (s.contains(ch[x])) {
		return false;
	    }

	}

	return true;
    }

    /**
     * Makes A string a valid Number
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @return
     */
    public static Float toValidNumber(String s) {
	String n = s
		.replaceAll(
			"[a-zA-Z,!,@,#,$,%,^,&,*,(,),_,+,-,=,{,},\\,|,:,;,',., ,<,>,?,',/,`,~,[,],{,},\n]",
			"");
	return parseFloat(n);
    }

    /**
     * Returns a String of the Number with given formatting
     * 
     * @author Habeeb Hooshmand
     * @param d
     * @param pattern
     * @return
     */
    public static String format(Double d, String pattern) {
	DecimalFormat df = new DecimalFormat(pattern);
	return df.format(d);

    }

}

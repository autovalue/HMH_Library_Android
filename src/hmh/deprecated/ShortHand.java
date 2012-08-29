/**
 * Original package : hmh.utilities

 * ALL ITEMS IN THIS PACKAGE ARE DEPRECIATED DO NOT USE THEM. BETTER THINGS HAVE BEEN MADE.
 * 
 */
package hmh.deprecated;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * LEGACY CLASS. DEPRECIATED. DO NOT USE. A Short Hand Version of many types of
 * Commands Includes: Printing, Equality Comparison, Random Number Generating,
 * and Calcuations. Original package : hmh.utilities ALL ITEMS IN THIS PACKAGE
 * ARE DEPRECIATED DO NOT USE THEM. BETTER THINGS HAVE BEEN MADE. Moved on
 * 2/25/12.
 * 
 * 
 * @author Habeeb Hooshmand
 */
@Deprecated
@DevStage(stage = Stage.RETIRED, working = Working.YES)
public class ShortHand {
    /** Details of Class */
    @Deprecated
    private String details = "LEGACY CLASS. DEPRECIATED. DO NOT USE.\nA ShortHand Version of many types of Commands \nIncludes: \nPrinting, Equality"
	    + "Comparison, and Calcuations";

    /** Gets Details of Class */
    @Deprecated
    public String getDetails() {
	return details;
    }

    /**
     * Compares String Values
     * 
     * @author Habeeb Hooshmand
     * @param stringOne
     * @param stringTwo
     * @return
     */
    @Deprecated
    public boolean isStringEqual(String stringOne, String stringTwo) {
	if (stringOne.contentEquals(stringTwo)) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * Compares two Integer Values
     * 
     * @author Habeeb Hooshmand
     * @param intOne
     * @param intTwo
     * @return
     */
    @Deprecated
    public boolean isIntegerEqual(Integer intOne, Integer intTwo) {
	if (intOne == intTwo) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * Compares two double values
     * 
     * @author Habeeb Hooshmand
     * @param doubleOne
     * @param doubleTwo
     * @return
     */
    @Deprecated
    public boolean isDoubleEqual(Double doubleOne, Double doubleTwo) {
	if (doubleOne == doubleTwo) {
	    return true;

	} else {
	    return false;
	}
    }

    /**
     * Compares two Float Values
     * 
     * @author Habeeb Hooshmand
     * @param floatOne
     * @param floatTwo
     * @return
     */
    @Deprecated
    public boolean isFloatEqual(Float floatOne, Float floatTwo) {
	if (floatOne == floatTwo) {
	    return true;

	} else {
	    return false;
	}
    }

    /**
     * Compares Long Values
     * 
     * @author Habeeb Hooshmand
     * @param longOne
     * @param longTwo
     * @return
     */
    @Deprecated
    public boolean isLongEqual(Long longOne, Long longTwo) {
	if (longOne == longTwo) {
	    return true;

	} else {
	    return false;
	}
    }

    /**
     * Compares Characters
     * 
     * @author Habeeb Hooshmand
     * @param charOne
     * @param charTwo
     * @return
     */
    @Deprecated
    public boolean isCharEqual(Character charOne, Character charTwo) {
	if (charOne.equals(charTwo)) {
	    return true;

	} else {
	    return false;
	}
    }

    /**
     * Prints String
     * 
     * @param string
     * @param character
     */
    @Deprecated
    public void printString(String string)

    {

	System.out.println(string);

    }

    /**
     * Prints an Integer Value
     * 
     * @author Habeeb Hooshmand
     * @param integer
     */
    @Deprecated
    public void printInt(Integer integer) {

	System.out.println(integer.toString());

    }

    /**
     * Prints a Character
     * 
     * @author Habeeb Hooshmand
     * @param character
     */
    @Deprecated
    public void printChar(Character character) {
	System.out.println(character.toString());
    }

    /**
     * Prints a Double value
     * 
     * @author Habeeb Hooshmand
     * @param doubleToPrint
     */
    @Deprecated
    public void printDouble(Double doubleToPrint) {
	System.out.println(doubleToPrint.toString());
    }

    /**
     * Finds if one String matches another
     * 
     * @author Habeeb Hooshmand
     * @param pattern
     * @param itemToSearch
     * @return
     */
    @Deprecated
    public Matcher match(String pattern, String itemToSearch) {
	Pattern p = java.util.regex.Pattern.compile(pattern);
	Matcher m = p.matcher(itemToSearch);
	return m;
    }

    /**
     * Calculates the given two Doubles with a charater function
     * 
     * @author Habeeb Hooshmand
     * @param firstNumber
     * @param function
     * @param secondNumber
     * @return (Calculated String)
     */
    @Deprecated
    public String calculate(Double firstNumber, Character function,
	    Double secondNumber) {
	DecimalFormat df = new DecimalFormat();
	df.applyPattern("###,###,###.####");

	Double retVal = null;
	switch (function) {
	case '+':
	    retVal = firstNumber + secondNumber;
	    break;
	case '-':
	    retVal = firstNumber - secondNumber;
	    break;
	case '*':
	    retVal = firstNumber * secondNumber;
	    break;
	case '/':
	    retVal = firstNumber / secondNumber;
	    break;
	case ':':
	    retVal = firstNumber / secondNumber;
	    break;

	default:
	    return "Invalid Input";
	}
	return (df.format(retVal));
    }

    /**
     * Generates a Random Integer Value
     * 
     * @author Habeeb Hooshmand
     * @param maximumValue
     * @return
     */
    @Deprecated
    public Integer randomInt(int maximumValue) {
	Random r = new Random();
	return r.nextInt(maximumValue);
    }

    public Double randomDouble(Double maximumValue) {
	Random r = new Random();
	return r.nextDouble();
    }
}

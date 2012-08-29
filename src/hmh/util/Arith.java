/**
 *@author Habeeb Hooshmand
 */
package hmh.util;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.text.DecimalFormat;

/**
 * Mathimatical and Number commands
 * 
 * @author Habeeb Hooshmand
 */
@DevStage(stage = Stage.RELEASE, working = Working.YES)
public final class Arith {

    /**
     * The Class Description
     * 
     * @author Habeeb Hooshmand
     */
    private static String description = "Mathimatical commands";

    /**
     * Gets The Class Description
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    public static String getDescription() {
	return description;
    }

    /**
     * Calculates the given two Doubles with a charater function
     * 
     * @author Habeeb Hooshmand
     * @param firstNumber
     * @param function
     * @param secondNumber
     * @return Calculated String
     */
    public static String calculate(Double firstNumber, Character function,
	    Double secondNumber) {
	DecimalFormat df = new DecimalFormat(
		"#,###,###,###.####################");

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
	case '%':
	    retVal = firstNumber % secondNumber;
	    break;
	default:
	    return "Invalid Function";
	}
	return (df.format(retVal));
    }

    /**
     * Gives retunt he character of the relationship between the numbers.
     * Either: > < or =.
     * 
     * @param numberOne
     * @param numberTwo
     * @return
     */
    public static Character relationship(Double numberOne, Double numberTwo) {
	if (numberOne > numberTwo) {
	    return '>';
	} else if (numberOne < numberTwo) {
	    return '<';
	} else if (numberOne == numberTwo) {
	    return '=';
	} else {
	    return '?';
	}

    }

    /**
     * Checks if number One is a multiple of number Two
     * 
     * @author Habeeb Hooshmand
     * @param one
     * @param two
     * @return
     */
    public static boolean isMultiple(Double one, Double two) {
	if (one % two == 0) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * Shortest Value of Pi (3.14)
     * 
     * @author Habeeb Hooshmand
     */
    public static Double shortPi = 3.14;

    /**
     * medium value of Pi
     * 
     * 
     * @author Habeeb Hooshmand
     */
    public static Double pi = java.lang.Math.PI;

    /**
     * Cosine
     * 
     * @author Habeeb Hooshmand
     * @param d
     * @return
     */
    public static Double cosine(Double d) {
	return Math.cos(d);
    }

    /**
     * Sine
     * 
     * @author Habeeb Hooshmand
     * @param d
     * @return
     */
    public static Double sine(Double d) {
	return Math.sin(d);
    }

    /**
     * Tangent
     * 
     * @author Habeeb Hooshmand
     * @param d
     * @return
     */
    public static Double tangent(Double d) {
	return Math.tan(d);
    }
}

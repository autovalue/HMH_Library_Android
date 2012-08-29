/**
 *@author Habeeb Hooshmand
 */
package hmh.deprecated.util;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

/**
 * Many different Object tests for equality
 * 
 * @author Habeeb Hooshmand
 * 
 */
@DevStage(stage = Stage.RELEASE, working = Working.YES)
public class Equality {

    /**
     * Compares String Values
     * 
     * @author Habeeb Hooshmand
     * @param stringOne
     * @param stringTwo
     * @return true or false
     */
    public boolean isEqual(String stringOne, String stringTwo) {
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
     * @return true or false
     */
    public boolean isEqual(Integer intOne, Integer intTwo) {
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
     * @return true or false
     */
    public boolean isEqual(Double doubleOne, Double doubleTwo) {
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
     * @return true or false
     */
    public boolean isEqual(Float floatOne, Float floatTwo) {
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
     * @return true or false
     */
    public boolean isEqual(Long longOne, Long longTwo) {
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
     * @return true or false
     */
    public boolean isEqual(Character charOne, Character charTwo) {
	if (charOne.equals(charTwo)) {
	    return true;

	} else {
	    return false;
	}
    }

    /**
     * Compares Booleans for Equality
     * 
     * @author Habeeb Hooshmand
     * @param booleanOne
     * @param booleanTwo
     * @return true or false
     */
    public boolean isEqual(boolean booleanOne, boolean booleanTwo) {
	if (booleanOne == booleanTwo) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * Checks if Integer one is Greater Than Integer Two
     * 
     * @author Habeeb Hooshmand
     * @param one
     * @param two
     * @return
     */
    public boolean isGreater(Integer one, Integer two) {
	if (one > two) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * Checks if Double one is Greater Than Double Two
     * 
     * @author Habeeb Hooshmand
     * @param one
     * @param two
     * @return
     */
    public boolean isGreater(Double one, Double two) {
	if (one > two) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * Checks if Integer one is Less Than Integer Two
     * 
     * @author Habeeb Hooshmand
     * @param one
     * @param two
     * @return
     */
    public boolean isLess(Double one, Double two) {
	if (one < two) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * Checks if Double one is Greater Than Double two
     * 
     * @author Habeeb Hooshmand
     * @param one
     * @param two
     * @return
     */
    public boolean isLess(Integer one, Integer two) {
	if (one < two) {
	    return true;
	} else {
	    return false;
	}
    }

}

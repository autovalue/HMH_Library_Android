/**
 *@author Habeeb Hooshmand
 */
package hmh.deprecated;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.util.Random;

/**
 * LEGACY CLASS. DEPRECIATED. DO NOT USE. No Decription :(. Original package:
 * hmh.utilities ALL ITEMS IN THIS PACKAGE ARE DEPRECIATED DO NOT USE THEM.
 * BETTER THINGS HAVE BEEN MADE. Moved on 2/27/12.
 * 
 * @author Habeeb Hooshmand
 * 
 */
@Deprecated
@DevStage(stage = Stage.RETIRED, working = Working.YES)
public class Numbers {
    /**
     * Generates a Random Long Value
     * 
     * @param maxValue
     * @return Random Long between 0 and maxValue
     */
    @Deprecated
    public Long randomLong(int maxValue) {
	Random r = new Random();
	Integer x = r.nextInt(maxValue);
	return x.longValue();

    }

    /**
     * Generates a random Float
     * 
     * @author Habeeb Hooshmand
     * @param maxValue
     * @param maxDecimal
     * @return
     */
    @Deprecated
    public Float randomFloat(int maxValue, Double maxDecimal) {
	Random r = new Random();
	Integer x = r.nextInt(maxValue);
	Double d = r.nextDouble();
	while (d > maxDecimal) {
	    d = r.nextDouble();
	}
	return x.floatValue() + d.floatValue();
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

    /**
     * Generates a Random Double Value between 0 and maxValue.
     * 
     * @author Habeeb Hooshmand
     * 
     * @param maxValue
     *            Maximum Value
     * @param maxDecimal
     *            Maximum Decimal Value
     * @return Random Double Between 0 and maxVaue + maxDecimalValue
     */
    @Deprecated
    public Double randomDouble(int maxValue, Double maxDecimal) {
	Random r = new Random();
	Integer x = r.nextInt(maxValue);
	Double d = r.nextDouble();
	while (d > maxDecimal) {
	    d = r.nextDouble();
	}

	return x.doubleValue() + d.doubleValue();
    }

    /**
     * Turns Double into String
     * 
     * @param d
     *            Double d
     * @return
     */
    @Deprecated
    public String toString(Double d) {
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
    public String toString(Integer i) {
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
    public String toString(Long l) {
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
    public String toString(Float f) {
	return f.toString();
    }

}

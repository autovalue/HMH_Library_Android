/**
 *@author Habeeb Hooshmand
 */
package hmh.util;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Contains Randonm Generators for all types of Numbers and String Sets in
 * Addition to the java.util.Random Commands.
 * 
 * @author Oracle (Java APIs)
 * @author Habeeb Hooshmand
 */
@DevStage(stage = Stage.RELEASE, working = Working.YES)
public class Random {
    private static java.util.Random r = new java.util.Random();

    /**
     * Generates a Random Long Value
     * 
     * @param maxValue
     * @return Random Long between 0 and maxValue
     */
    public static Long randomLong(int maxValue) {

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
    public static Float randomFloat(Double maxValue) {
	return Numbers.parseFloat(Random.randomDouble(maxValue));

    }

    /**
     * Generates a Random Integer Value
     * 
     * @author Habeeb Hooshmand
     * @param maximumValue
     * @return
     */
    public static Integer randomInt(int maximumValue) {

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
    public static Double randomDouble(Double maxValue) {

	Integer x = r.nextInt(Numbers.parseInt(maxValue));
	int y = Integer.parseInt(maxValue.toString().split("\\.")[1]);
	Integer d = r.nextInt(y);

	return Double.parseDouble(x.toString() + "." + d.toString());
    }

    /**
     * Generates a random String from an Array
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @return
     */
    public static String randomString(String[] s) {
	int x = randomInt(s.length);
	return s[x];

    }

    /**
     * Generates a random String from an ArrayList
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @return
     */
    public static String randomString(Collection<String> s) {
	ArrayList<String> al = new ArrayList<String>();
	al.addAll(s);
	int x = randomInt(al.size());
	return al.get(x);

    }

}

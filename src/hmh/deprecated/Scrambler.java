/**
 *
 *@author Habeeb Hooshmand
 */
package hmh.deprecated;

import hmh.deprecated.util.Lists;
import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.util.ArrayList;

/**
 * 
 * @author Habeeb Hooshmand
 */
@Deprecated
@DevStage(stage = Stage.RETIRED, working = Working.YES)
public class Scrambler {

    private String str = null;
    private ArrayList<Character> c;

    /**
     * Constructor
     * 
     * @author Habeeb Hooshmand
     * @param s
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

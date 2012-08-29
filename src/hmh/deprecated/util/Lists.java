/**
 *
 *@author Habeeb Hooshmand
 */
package hmh.deprecated.util;

import hmh.deprecated.Printing;
import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * 
 * @author Habeeb Hooshmand
 */
@DevStage(stage = Stage.RELEASE, working = Working.UNTESTED)
@SuppressWarnings({ "rawtypes", "unchecked" })
public class Lists {
    /**
     * Shuffles the List
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @return
     */
    public static ArrayList shuffle(List c) {
	ArrayList s = new ArrayList();
	if (c == null) {
	    s.clear();
	    s.add("Every");
	    s.add("Day");
	    s.add("I'm");
	    s.add("Shuffling");
	    s.add("Null Collection :(");
	    Printing pt = new Printing();
	    pt.printArrayl(s);
	    return s;
	} else {
	    s.addAll(c);
	    Collections.shuffle(s);
	    return s;
	}
    }

    /**
     * 
     * 
     * @author Habeeb Hooshmand
     * @param l
     * @return
     */
    public static ArrayList removeRepeats(List c) {
	LinkedHashSet lhs = new LinkedHashSet();
	lhs.addAll(c);
	ArrayList l = new ArrayList();
	l.addAll(lhs);
	return l;
    }

    /**
     * Turns the contents of a Collection into a String
     * 
     * @author Habeeb Hooshmand
     * @param c
     * @return
     */
    public static String toSingleString(List c, boolean spaces) {
	ArrayList t = new ArrayList();
	t.addAll(c);
	String s = new String();
	for (int i = 0; i < t.size(); i++) {
	    if (spaces) {
		s += t.get(i) + "\n";
	    } else {
		s += t.get(i);
	    }
	}
	return s;

    }

    /**
     * Turns the contents of a Collection into a String with next line sequences
     * 
     * @author Habeeb Hooshmand
     * @param c
     * @return
     */
    public static String toMultipleString(List c) {
	ArrayList t = new ArrayList();
	t.addAll(c);
	String s = new String();
	for (int i = 0; i < t.size(); i++) {
	    s += t.get(i) + "\n";
	}
	return s;

    }

}

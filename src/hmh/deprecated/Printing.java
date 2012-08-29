/**
 *@author Habeeb Hooshmand
 */
package hmh.deprecated;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

/**
 * A collection of shorter Custom Commands for printing.
 * 
 * @author Habeeb Hooshmand
 * @author Java APIs
 */
@DevStage(stage = Stage.RELEASE, working = Working.YES)
public class Printing {
    /**
     * @author Java APIs
     * 
     */
    PrintStream output = null;

    public Printing() {
	output = System.out;
    }

    public Printing(PrintStream p) {
	output = p;
    }

    /**
     * Prints String
     * 
     * @author Habeeb Hooshmand
     * 
     * @param Strings
     *            to print
     * @param character
     */
    public void print(String string) {
	output.print(string);
    }

    /**
     * Prints an Integer Value
     * 
     * @author Habeeb Hooshmand
     * @param Integer
     */
    public void print(Integer integer) {

	output.print(integer.toString());

    }

    /**
     * Prints a Character
     * 
     * @author Habeeb Hooshmand
     * @param Character
     *            to print
     */
    public void print(Character character) {
	output.print(character.toString());
    }

    /**
     * Prints a Double value
     * 
     * @author Habeeb Hooshmand
     * @param Double
     *            To Print
     */
    public void print(Double doubleToPrint) {
	output.print(doubleToPrint.toString());
    }

    /**
     * Prints A Long Value
     * 
     * @author Habeeb Hooshmand
     * @param longToPrint
     */
    public void print(Long longToPrint) {
	output.print(longToPrint.toString());
    }

    /**
     * Prints a Float Value
     * 
     * @author Habeeb Hooshmand
     * @param floatToPrint
     */
    public void print(Float floatToPrint) {
	output.print(floatToPrint.toString());
    }

    /**
     * Prints a Boolean Value
     * 
     * @author Habeeb Hooshmand
     * @param floatToPrint
     */
    public void print(Boolean booleanToPrint) {
	output.print(booleanToPrint.toString());
    }

    /**
     * Prints an Object and then terminates the line.
     * 
     * @author Habeeb Hooshmand
     * @param s
     */
    public void printl() {
	output.println();
    }

    /**
     * Prints an Object and then terminates the line.
     * 
     * @author Habeeb Hooshmand
     * @param s
     */
    public void printl(String s) {
	output.println(s);
    }

    /**
     * Prints an Object and then terminates the line.
     * 
     * @author Habeeb Hooshmand
     * @param i
     */
    public void printl(Integer i) {
	output.println(i);
    }

    /**
     * Prints an Object and then terminates the line.
     * 
     * @author Habeeb Hooshmand
     * @param b
     */
    public void printl(Boolean b) {
	output.println(b);
    }

    /**
     * Prints an Object and then terminates the line.
     * 
     * @author Habeeb Hooshmand
     * @param d
     */
    public void printl(Double d) {
	output.println(d);
    }

    /**
     * Prints an Object and then terminates the line.
     * 
     * @author Habeeb Hooshmand
     * @param c
     */
    public void printl(Character c) {
	output.println(c);

    }

    /**
     * Prints an Object then terminates the line
     * 
     * @author Habeeb Hooshmand
     * @param obj
     */
    public void printl(Object obj) {
	output.println(obj);
    }

    /**
     * Delays Printing a line for seconds
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param timeInSeconds
     */
    public void delayPrint(String s, Double timeInSeconds) {
	int tme = (int) (timeInSeconds * 1000);
	try {
	    Thread.sleep(tme);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	output.print(s);

    }

    /**
     * Delays Printing a line for seconds
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param timeInSeconds
     */
    public void delayPrint(Integer s, Double timeInSeconds) {
	int tme = (int) (timeInSeconds * 1000);
	try {
	    Thread.sleep(tme);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	output.print(s);

    }

    /**
     * Delays Printing a line for seconds
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param timeInSeconds
     */
    public void delayPrint(Double s, Double timeInSeconds) {
	int tme = (int) (timeInSeconds * 1000);
	try {
	    Thread.sleep(tme);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	output.print(s);

    }

    /**
     * Delays Printing a line for seconds then trerminates line.
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param timeInSeconds
     */
    public void delayPrintl(String s, Double timeInSeconds) {
	int tme = (int) (timeInSeconds * 1000);
	try {
	    Thread.sleep(tme);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	output.println(s);

    }

    /**
     * Delays Printing a line for seconds then trerminates line.
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param timeInSeconds
     */
    public void delayPrintl(Integer s, Double timeInSeconds) {
	int tme = (int) (timeInSeconds * 1000);
	try {
	    Thread.sleep(tme);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	output.println(s);

    }

    /**
     * Delays Printing a line for seconds then trerminates line.
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param timeInSeconds
     */
    public void delayPrintl(Double s, Double timeInSeconds) {
	int tme = (int) (timeInSeconds * 1000);
	try {
	    Thread.sleep(tme);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	output.println(s);

    }

    /**
     * Prints a Line for the given ammount of times
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param times
     */
    public void reprint(String s, int times) {
	for (int i = times; i > 0; i--) {
	    output.print(s);
	}
    }

    /**
     * Prints a Line for the given ammount of times
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param times
     */
    public void reprint(Integer integer, int times) {
	for (int i = times; i > 0; i--) {
	    output.print(integer);
	}
    }

    /**
     * Prints a Line for the given ammount of times
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param times
     */
    public void reprint(Double d, int times) {
	for (int i = times; i > 0; i--) {
	    output.print(d);
	}
    }

    /**
     * Prints a Line for the given ammount of times
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param times
     */
    public void reprintl(String s, int times) {
	for (int i = times; i > 0; i--) {
	    output.println(s);
	}
    }

    /**
     * Prints a Line for the given ammount of times
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param times
     */
    public void reprintl(Integer integer, int times) {
	for (int i = times; i > 0; i--) {
	    output.println(integer);
	}
    }

    /**
     * Prints a Line for the given ammount of times
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param times
     */
    public void reprintl(Double d, int times) {
	for (int i = times; i > 0; i--) {
	    output.println(d);
	}
    }

    /**
     * Prints a line Character by Character
     * 
     * @author Habeeb Hooshmand
     * @param s
     */
    public void TypeWrite(String s) {
	for (int i = 0; i < s.toString().length(); i++) {
	    try {
		Thread.sleep(200);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }

	    System.out.print(s.toString().charAt(i));

	}

    }

    /**
     * Prints a line Character by Character
     * 
     * @author Habeeb Hooshmand
     * @param s
     */
    public void TypeWrite(String s, Double delayInSeconds) {
	long l = (long) (delayInSeconds * 1000);

	for (int i = 0; i < s.toString().length(); i++) {
	    try {
		Thread.sleep(l);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }

	    System.out.print(s.toString().charAt(i));

	}

    }

    /**
     * Prints a line Character by Character
     * 
     * @author Habeeb Hooshmand
     * @param s
     */
    public void TypeWrite(Integer s) {
	for (int i = 0; i < s.toString().length(); i++) {
	    try {
		Thread.sleep(200);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }

	    System.out.print(s.toString().charAt(i));

	}

    }

    /**
     * Prints a line Character by Character
     * 
     * @author Habeeb Hooshmand
     * @param s
     */
    public void TypeWrite(Double s) {
	for (int i = 0; i < s.toString().length(); i++) {
	    try {
		Thread.sleep(200);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }

	    System.out.print(s.toString().charAt(i));

	}

    }

    /**
     * Prints a line Character by Character
     * 
     * @author Habeeb Hooshmand
     * @param s
     */
    public void TypeWritel(String s) {
	for (int i = 0; i < s.toString().length(); i++) {
	    try {
		Thread.sleep(200);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }

	    System.out.print(s.toString().charAt(i));

	}
	System.out.println("");

    }

    /**
     * Prints a line Character by Character
     * 
     * @author Habeeb Hooshmand
     * @param s
     */
    public void TypeWritel(String s, Double delayInSeconds) {
	long l = (long) (delayInSeconds * 1000);

	for (int i = 0; i < s.toString().length(); i++) {
	    try {
		Thread.sleep(l);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }

	    System.out.print(s.toString().charAt(i));

	}
	System.out.println("");

    }

    /**
     * Prints a line Character by Character
     * 
     * @author Habeeb Hooshmand
     * @param s
     */
    public void TypeWritel(Integer s) {
	for (int i = 0; i < s.toString().length(); i++) {
	    try {
		Thread.sleep(200);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }

	    System.out.print(s.toString().charAt(i));

	}
	System.out.println("");

    }

    /**
     * Prints a line Character by Character
     * 
     * @author Habeeb Hooshmand
     * @param s
     */
    public void TypeWritel(Double s) {
	for (int i = 0; i < s.toString().length(); i++) {
	    try {
		Thread.sleep(200);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }

	    System.out.print(s.toString().charAt(i));

	}
	System.out.println("");

    }

    /**
     * Prints a line Word by Word
     * 
     * @author Habeeb Hooshmand
     * @param s
     */
    public void TypeWriteWords(String s) {
	String[] spl = s.split("[ ,\n]");

	for (int i = 0; i < s.toString().length() - 1; i++) {
	    try {
		Thread.sleep(200);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }

	    System.out.print(spl[i]);

	}
	System.out.println("");

    }

    /**
     * Prints out array making new lines for each item.
     * 
     * @author Habeeb Hooshmand
     * @param s
     */
    public void printArrayl(String[] s) {
	for (int i = 0; i < s.length; i++) {
	    output.println(s[i]);
	}
    }

    /**
     * Prints out array on One Line.
     * 
     * @author Habeeb Hooshmand
     * @param s
     */
    public void printArray(String[] s) {
	for (int i = 0; i < s.length; i++) {
	    output.print(s[i]);
	}
    }

    /**
     * Prints out array making new lines for each item
     * 
     * @author Habeeb Hooshmand
     * @param s
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void printArrayl(Collection a) {
	ArrayList s = new ArrayList();
	s.addAll(a);
	for (int i = 0; i < s.size(); i++) {
	    output.println(s.get(i));
	}
    }

    /**
     * Prints out Collection on One Line.
     * 
     * @author Habeeb Hooshmand
     * @param s
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void printArray(Collection a) {
	ArrayList s = new ArrayList();
	s.addAll(a);
	for (int i = 0; i < s.size(); i++) {
	    output.print(s.get(i));
	}
    }
}

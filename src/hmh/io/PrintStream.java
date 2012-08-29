/**
 * 
 */
package hmh.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Habeeb Hooshmand
 * 
 */
public class PrintStream extends java.io.PrintStream {

    

    /**
     * Make new Printstream equvalent to System.out    
     */
    public PrintStream() {
	super(System.out);
    }
    
    /**
     * 
     * @param printStream
     */
    public PrintStream(java.io.PrintStream printStream){
	super(printStream);
    }
    
    /**
     * @param file
     * @throws FileNotFoundException
     */
    public PrintStream(File file) throws FileNotFoundException {
	super(file);
    }

    /**
     * @param file
     * @param csn
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     */
    public PrintStream(File file, String csn) throws FileNotFoundException,
	    UnsupportedEncodingException {
	super(file, csn);
	
    }

    /**
     * @param out
     * @param autoFlush
     * @param enc
     * @throws UnsupportedEncodingException
     */
    public PrintStream(OutputStream out, boolean autoFlush, String enc)
	    throws UnsupportedEncodingException {
	super(out, autoFlush, enc);
	
    }

    /**
     * @param out
     * @param autoFlush
     */
    public PrintStream(OutputStream out, boolean autoFlush) {
	super(out, autoFlush);
	
    }

    /**
     * @param out
     */
    public PrintStream(OutputStream out) {
	super(out);
	
    }

    /**
     * @param fileName
     * @param csn
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     */
    public PrintStream(String fileName, String csn)
	    throws FileNotFoundException, UnsupportedEncodingException {
	super(fileName, csn);
	
    }

    /**
     * @param fileName
     * @throws FileNotFoundException
     */
    public PrintStream(String fileName) throws FileNotFoundException {
	super(fileName);
	
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
	print(s);

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
	print(s);

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
	print(s);

    }

    /**
     * Delays Printing a line for seconds then trerminates line.
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param timeInSeconds
     */
    public void delayPrintln(String s, Double timeInSeconds) {
	int tme = (int) (timeInSeconds * 1000);
	try {
	    Thread.sleep(tme);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	println(s);

    }

    /**
     * Delays Printing a line for seconds then trerminates line.
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param timeInSeconds
     */
    public void delayPrintln(Integer s, Double timeInSeconds) {
	int tme = (int) (timeInSeconds * 1000);
	try {
	    Thread.sleep(tme);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	println(s);

    }

    /**
     * Delays Printing a line for seconds then trerminates line.
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param timeInSeconds
     */
    public void delayPrintln(Double s, Double timeInSeconds) {
	int tme = (int) (timeInSeconds * 1000);
	try {
	    Thread.sleep(tme);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	println(s);

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
	    print(s);
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
	    print(integer);
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
	    print(d);
	}
    }

    /**
     * Prints a Line for the given ammount of times
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param times
     */
    public void reprintln(String s, int times) {
	for (int i = times; i > 0; i--) {
	    println(s);
	}
    }

    /**
     * Prints a Line for the given ammount of times
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param times
     */
    public void reprintln(Integer integer, int times) {
	for (int i = times; i > 0; i--) {
	    println(integer);
	}
    }

    /**
     * Prints a Line for the given ammount of times
     * 
     * @author Habeeb Hooshmand
     * @param s
     * @param times
     */
    public void reprintln(Double d, int times) {
	for (int i = times; i > 0; i--) {
	    println(d);
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
    public void TypeWriteln(String s) {
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
    public void TypeWriteln(String s, Double delayInSeconds) {
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
    public void TypeWriteln(Integer s) {
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
    public void TypeWriteln(Double s) {
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
    public void printArrayln(String[] s) {
	for (int i = 0; i < s.length; i++) {
	    println(s[i]);
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
	    print(s[i]);
	}
    }

    /**
     * Prints out array making new lines for each item
     * 
     * @author Habeeb Hooshmand
     * @param s
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void printArrayln(Collection a) {
	ArrayList s = new ArrayList();
	s.addAll(a);
	for (int i = 0; i < s.size(); i++) {
	    println(s.get(i));
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
	    print(s.get(i));
	}
    }
}

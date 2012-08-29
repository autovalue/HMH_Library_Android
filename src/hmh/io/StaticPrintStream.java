/**
 * 
 */
package hmh.io;

/**
 * @author Habeeb Hooshmand
 * 
 */
public class StaticPrintStream {
    static PrintStream p = new PrintStream();

    public static void print(String pr) {
	p.print(pr);
    }

    public static void print(Long pr) {
	p.print(pr);
    }

    public static void print(Integer pr) {
	p.print(pr);
    }

    public static void print(Double pr) {
	p.print(pr);
    }

    public static void print(Float pr) {
	p.print(pr);
    }

    public static void print(Character pr) {
	p.print(pr);
    }

    public static void println(String pr) {
	p.println(pr);
    }

    public static void println(Long pr) {
	p.println(pr);
    }

    public static void println(Short pr) {
	p.println(pr);
    }

    public static void println(Integer pr) {
	p.println(pr);
    }

    public static void println(Double pr) {
	p.println(pr);
    }

    public static void println(Float pr) {
	p.println(pr);
    }

    public static void println(Character pr) {
	p.println(pr);
    }

    public static void println() {
	p.println();
    }

    public static void printf(String format, Object... arg1) {
	System.out.printf(format, arg1);
    }
}

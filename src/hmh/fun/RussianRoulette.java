/**
 *@author Habeeb Hooshmand
 */
package hmh.fun;

import hmh.deprecated.Printing;
import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Russian Roullette game. 'Nuff said.
 * 
 * @author Habeeb Hooshmand
 * 
 */
@DevStage(stage = Stage.RELEASE, working = Working.YES)
public class RussianRoulette {

    private Printing pt = new Printing();
    private Random rg = new Random();
    private static Scanner sc = new Scanner(System.in);
    private Integer v = null;
    private ArrayList<String> s;
    private ArrayList<String> names;

    public RussianRoulette(int numOfPeople) {
	v = numOfPeople;
    }

    /**
     * Regular Setup
     * 
     * @author Habeeb Hooshmand
     */
    private void setUp() {
	s = new ArrayList<String>();
	names = new ArrayList<String>();

	int d = rg.nextInt(v);

	for (int i = 0; i < v; i++) {
	    if (i == d) {
		s.add("DEAD :(");
	    } else {
		s.add("SAFE :)");
	    }
	}

    }

    /**
     * Begins Program
     * 
     * @author Habeeb Hooshmand
     */
    public void init() {
	setUp();

	pt.TypeWritel("Russian Roulette ", 0.09);

	for (int i = 0; i < v; i++) {

	    pt.TypeWritel("Enter Name " + (i + 1), 0.07);

	    String n = sc.nextLine();

	    names.add(n);

	    pt.TypeWritel("Welcome " + n, 0.09);

	}

	pt.delayPrintl("\nGood Luck To You All\n", 0.5);

	for (int x = 0; x < v; x++) {
	    int i = rg.nextInt(v);

	    pt.delayPrint("Round " + (x + 1), 0.6);
	    pt.print(" " + names.get(i) + " is");
	    pt.TypeWrite(" .... ", 0.7);
	    pt.delayPrintl(s.get(i) + "\n", 0.5);

	    if (s.get(i).contains("DEAD")) {
		pt.printl("Play Again? (Y/n");
		String s = sc.next();

		if (s.toUpperCase().contentEquals("Y")) {
		    init();
		} else if (s.toUpperCase().contentEquals("N")) {
		    return;
		} else {
		    pt.print("Invalid Input");
		}
	    }

	    names.remove(i);
	    s.remove(i);
	}

    }

    public static class standAlone {
	public static void main(String[] args) {
	    RussianRoulette rr = new RussianRoulette(sc.nextInt());
	    rr.init();
	}
    }
}

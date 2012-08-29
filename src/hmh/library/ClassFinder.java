package hmh.library;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 *
 *@author Habeeb Hooshmand
 */

/**
 * Searches For Classes and Methods In Library
 * 
 * @author Habeeb Hooshmand
 */
@Deprecated
@DevStage(stage = Stage.RELEASE, working = Working.YES)
@SuppressWarnings({ "rawtypes" })
public class ClassFinder {
    private static hmh.deprecated.Printing pt = new hmh.deprecated.Printing();

    private static ArrayList<String> packages = new ArrayList<String>();
    private static ArrayList<Class> classes = new ArrayList<Class>();
    private static ArrayList<Method> methods = new ArrayList<Method>();
    private static ArrayList<Field> fields = new ArrayList<Field>();

    /**
     * Searches for Classes using input and prints out the findings
     * 
     * @author Habeeb Hooshmand
     */
    public static void search() {
	update();
	@SuppressWarnings("resource")
	java.util.Scanner sc = new java.util.Scanner(System.in);

	pt.print("Enter Keyword: ");
	String s = sc.next();

	searchPackages(s);
	searchClasses(s);
	searchMethods(s);
	searchFields(s);

    }

    /**
     * Searches for Classes using string parameter and prints out the finings
     * 
     * @author Habeeb Hooshmand
     */
    public static void search(String search) {
	update();

	String s = search;
	searchPackages(s);
	searchClasses(s);
	searchMethods(s);
	searchFields(s);

    }

    /**
     * Updates the Classes
     * 
     * @author Habeeb Hooshmand
     */
    private static void update() {
	/*
	 * classes.add(hmh.android.locationListener.class);
	 * classes.add(hmh.android.tools.LocationInfo.class);
	 * classes.add(hmh.android.ui.ActionBar.ActionBarHelper.class);
	 * classes.add(hmh.android.ui.ActionBar.ActionBarHelperBase.class);
	 * classes.add(hmh.android.ui.ActionBar.ActionBarHelperHoneycomb.class);
	 * classes.add(hmh.android.ui.ActionBar.ActionBarHelperICS.class);
	 * classes.add(hmh.android.ui.ActionBar.HMHActivity.class);
	 * classes.add(hmh.android.ui.ActionBar.SimpleMenu.class);
	 * classes.add(hmh.android.ui.ActionBar.SimpleMenuItem.class);
	 * classes.add(hmh.android.ui.LayParams.class);
	 * classes.add(hmh.android.ui.ListView.DirectList.class);
	 * classes.add(hmh.android.ui.ListView.TwoLinedList.class);
	 */
	classes.add(hmh.fun.Art.class);
	classes.add(hmh.fun.RussianRoulette.class);
	classes.add(hmh.fun.ShadeSystem.class);
	classes.add(hmh.fun.TrollBot.class);
	classes.add(hmh.library.ClassFinder.class);
	// classes.add(hmh.util.Math.class);
	classes.add(hmh.util.Binaries.class);
	classes.add(hmh.deprecated.util.Equality.class);
	classes.add(hmh.deprecated.util.Lists.class);
	classes.add(hmh.util.Numbers.class);
	classes.add(hmh.util.Objects.class);
	classes.add(hmh.util.Printer.class);
	classes.add(hmh.deprecated.Printing.class);
	classes.add(hmh.util.Random.class);
	classes.add(hmh.util.Strings.class);

	for (int i = 0; i < classes.size(); i++) {
	    Class c = classes.get(i);

	    for (int x = 0; x < c.getDeclaredMethods().length; x++) {
		Method m = c.getDeclaredMethods()[x];
		if (Modifier.isPublic(m.getModifiers())) {
		    methods.add(m);
		}
	    }

	    for (int x = 0; x < c.getDeclaredFields().length; x++) {
		Field f = c.getDeclaredFields()[x];

		if (Modifier.isPublic(f.getModifiers())) {
		    fields.add(f);
		}

	    }

	    packages.add(c.getPackage().toString());

	}
    }

    private static void searchClasses(String s) {
	ArrayList<String> a = new ArrayList<String>();

	for (int i = 0; i < classes.size(); i++) {

	    Class next = classes.get(i);

	    if (next.getSimpleName().toLowerCase().contains(s.toLowerCase())) {
		a.add("Class "
			+ next.getSimpleName()
			+ " in Package "
			+ next.getPackage().toString()
				.replaceAll("package ", ""));
	    }
	}

	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	lhs.addAll(a);
	a.clear();
	a.addAll(lhs);

	pt.printl("\nFound " + a.size() + " Classes containing '" + s + "':");

	for (int i = 0; i < a.size(); i++) {
	    pt.printl(a.get(i));
	}

    }

    private static void searchPackages(String s) {
	ArrayList<String> a = new ArrayList<String>();

	for (int i = 0; i < packages.size(); i++) {

	    String next = packages.get(i);

	    if (next.toLowerCase().contains(s.toLowerCase())) {
		a.add("Package " + next);
	    }
	}

	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	lhs.addAll(a);
	a.clear();
	a.addAll(lhs);

	pt.printl("\nFound " + a.size() + " Packages containing '" + s + "':");

	for (int i = 0; i < a.size(); i++) {
	    pt.printl(a.get(i));
	}

    }

    private static void searchMethods(String s) {
	ArrayList<String> a = new ArrayList<String>();

	for (int i = 0; i < methods.size(); i++) {

	    Method next = methods.get(i);

	    if (next.getName().toLowerCase().contains(s.toLowerCase())) {

		a.add("Method "
			+ next.getName()
			+ " in Class "
			+ next.getDeclaringClass().getSimpleName()
			+ " in Package "
			+ next.getDeclaringClass().getPackage().toString()
				.replaceAll("package ", ""));
	    }
	}

	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	lhs.addAll(a);
	a.clear();
	a.addAll(lhs);

	pt.printl("\nFound " + a.size() + " Methods containing '" + s + "':");

	for (int i = 0; i < a.size(); i++) {
	    pt.printl(a.get(i));
	}

    }

    private static void searchFields(String s) {
	ArrayList<String> a = new ArrayList<String>();

	for (int i = 0; i < fields.size(); i++) {

	    Field next = fields.get(i);

	    if (next.getName().toLowerCase().contains(s.toLowerCase())) {

		a.add("Field "
			+ next.getName()
			+ " in Class "
			+ next.getDeclaringClass().getSimpleName()
			+ " in Package "
			+ next.getDeclaringClass().getPackage().toString()
				.replaceAll("package ", ""));
	    }
	}

	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	lhs.addAll(a);
	a.clear();
	a.addAll(lhs);

	pt.printl("\nFound " + a.size() + " Fields containing '" + s + "':");

	for (int i = 0; i < a.size(); i++) {
	    pt.printl(a.get(i));
	}

    }

}

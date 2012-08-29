/**
 * 
 */
package hmh.lang;

import hmh.util.Print;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Habeeb Hooshmand
 * 
 */
public class ExpandoObject<Type extends Object> {
    private Map<String, Type> properties = null;

    public void newEntry(String key, Type value) {
	this.getProperties().put(key, value);
    }

    public void n(String k, Type v) {
	this.newEntry(k, v);
    }

    public Type getEntry(String key) {
	return this.getProperties().get(key);
    }

    public Type g(String k) {
	return this.getEntry(k);
    }

    public void exportToFile(File file) throws IOException {
	file.getParentFile().mkdirs();

	PrintWriter fileOutput = new PrintWriter(new FileWriter(file));

	Object[] keys = getProperties().keySet().toArray();
	List<Type> values = new ArrayList<Type>(getProperties().values());

	/*
	 * if (this.canPort(values.get(0)) == false) { throw new IOException(
	 * "You can only export Integer, String, or Character values."); }
	 */

	for (int i = 0; i < values.size(); i++) {
	    fileOutput.println(keys[i].toString() + ":+)-(+:" + values.get(i));

	    Print.print(i);
	}

	fileOutput.close();
    }

    @SuppressWarnings({ "unchecked" })
    public void importFromFile(File file) throws FileNotFoundException {
	Scanner sc = new Scanner(new BufferedReader(new FileReader(file)));

	this.getProperties().clear();

	int i = 0;
	while (sc.hasNextLine()) {
	    String[] line = sc.nextLine().split(":+)-(+:");

	    this.getProperties().put(line[0], (Type) line[1]);

	    i += 1;

	}

	sc.close();

	Print.print(i);
    }

    private Map<String, Type> getProperties() {

	if (this.properties == null) {
	    this.properties = new HashMap<String, Type>();
	}

	return properties;
    }

    @SuppressWarnings("unused")
    private boolean canPort(Type t) {
	{
	    Class<? extends Object> type = t.getClass();

	    if (type.getClass().equals(String.class)
		    || type.getClass().equals(Integer.class)
		    || type.getClass().equals(Character.class)) {
		return true;
	    } else {
		return false;
	    }
	}
    }
}

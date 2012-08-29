package hmh.deprecated.util;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

@DevStage(stage = Stage.FINAL_RELEASE, working = Working.UNTESTED)
public final class FileTools {
    public static String toString(String path) throws FileNotFoundException,
	    IOException {

	String ret = "";
	File f = new File(path);

	BufferedReader bfr = new BufferedReader(new FileReader(f));

	Scanner scanner = new Scanner(bfr);

	while (scanner.hasNextLine()) {
	    String line = scanner.nextLine();
	    ret += line + "\n";
	}
	scanner.close();

	return ret;
    }

    public static String toString(File file) throws FileNotFoundException,
	    IOException {

	String ret = "";

	BufferedReader bfr = new BufferedReader(new FileReader(file));

	Scanner scanner = new Scanner(bfr);

	while (scanner.hasNextLine()) {
	    String line = scanner.nextLine();
	    ret += line + "\n";
	}
	scanner.close();

	return ret;
    }

    public static void witeToFile(Collection<? extends Object> items,
	    String file, boolean oneLine) throws IOException,
	    FileNotFoundException {
	PrintWriter pw = new PrintWriter(new FileWriter(file));
	List<?> l = (List<?>) items;

	for (int i = 0; i < items.size(); i++) {

	    if (oneLine) {
		pw.print(l.get(i));
	    } else {
		pw.println(l.get(i));
	    }
	}

	pw.close();

    }

    public static void witeToFile(String item, String file, boolean termLine)
	    throws IOException, FileNotFoundException {
	PrintWriter pw = new PrintWriter(new FileWriter(file));

	if (termLine) {
	    pw.println(item);
	} else {
	    pw.print(item);
	}

	pw.close();

    }
}

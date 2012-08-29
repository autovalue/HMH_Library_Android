package hmh.util.test;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * 
 * @author Habeeb Hooshmand
 * 
 * @param <Type>
 */
@DevStage(stage = Stage.RELEASE_CANDIDATE, working = Working.UNTESTED)
public class SavedList<Type> extends ArrayList<Type> {

    private static final long serialVersionUID = 2109489378697862330L;
    private PrintWriter printWriter = null;
    private Scanner sc = null;
    private String outputPath = null;

    public SavedList(String pathToFile) {
	this.outputPath = pathToFile;
	try {
	    printWriter = new PrintWriter(new FileWriter(pathToFile));
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

    @Override
    public boolean add(Type object) {
	retrieve();
	super.add(object);
	this.onListChanged();

	return true;
    }

    @Override
    public void add(int index, Type object) {
	retrieve();
	super.add(index, object);
	this.onListChanged();
    }

    @Override
    public boolean addAll(Collection<? extends Type> collection) {
	retrieve();
	super.addAll(collection);
	this.onListChanged();

	return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Type> collection) {
	retrieve();
	super.addAll(index, collection);
	this.onListChanged();

	return true;
    }

    @Override
    public Type remove(int index) {
	retrieve();
	super.remove(index);
	this.onListChanged();

	return null;
    }

    @Override
    public boolean remove(Object object) {
	retrieve();
	super.remove(object);
	this.onListChanged();

	return true;
    }

    public void retrieve() {
	try {
	    restoreFile(new File(this.outputPath));
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    public void retrieve(File file) {
	try {
	    restoreFile(file);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    public void retrieve(String file) {
	try {
	    restoreFile(new File(file));
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    public void retrieve(InputStream file) {
	try {
	    restoreInputStream(file);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    @SuppressWarnings("unchecked")
    private void restoreFile(File f) throws Exception {
	try {
	    sc = new Scanner(new BufferedReader(new FileReader(f)));
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	}

	if (!sc.nextLine().contentEquals(
		Long.toString(SavedList.serialVersionUID))) {
	    throw (new Exception("Not A Valid Restore File!"));
	}

	int ammt = Integer.parseInt(sc.nextLine());

	for (int i = 0; i < ammt; i++) {
	    super.add((Type) sc.nextLine());
	}
    }

    @SuppressWarnings("unchecked")
    private void restoreInputStream(InputStream ins) throws Exception {
	sc = new Scanner(new BufferedReader(new InputStreamReader(ins)));

	if (!sc.nextLine().contentEquals(
		Long.toString(SavedList.serialVersionUID))) {
	    throw (new Exception("Not A Valid Restore File!"));
	}

	int ammt = Integer.parseInt(sc.nextLine());

	for (int i = 0; i < ammt; i++) {
	    super.add((Type) sc.nextLine());
	}
    }

    private void onListChanged() {
	this.printWriter.println(SavedList.serialVersionUID);
	this.printWriter.println(this.size());
	for (Type obj : this) {
	    this.printWriter.println(obj.toString());
	}
	this.printWriter.close();
    }

}

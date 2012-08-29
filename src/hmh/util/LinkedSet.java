/**
 * 
 */
package hmh.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author Habeeb Hooshmand
 * 
 */
public class LinkedSet<E> implements Set<E>, Iterable<E> {

    private ArrayList<E> values;

    public LinkedSet() {
	values = new ArrayList<E>();
    }

    public LinkedSet(Collection<E> collection) {
	values = new ArrayList<E>(collection);
    }

    public LinkedSet(List<E> collection) {
	values = new ArrayList<E>(collection);
    }

    /**
     * Gets item from Set.
     * 
     * @param index
     * @return the value at the specified index
     */
    public E get(int index) {
	return values.get(index);
    }

    /**
     * The integer postion of an object
     * 
     * @param object
     * @return Where the object is.
     */
    public int indexOf(Object object) {
	return values.indexOf(object);
    }

    /**
     * Removes item at specified index.
     * 
     * @param index
     *            Index of item
     */
    public void remove(int index) {
	values.remove(index);
    }

    /**
     * 
     * @param indexes
     *            The indexes of the items you want to remove.
     */
    public void remove(int... indexes) {
	for (int item : indexes) {
	    remove(item);
	}
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Set#add(java.lang.Object)
     */
    @Override
    public boolean add(E object) {
	return values.add(object);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Set#addAll(java.util.Collection)
     */
    @Override
    public boolean addAll(Collection<? extends E> arg0) {
	return values.addAll(arg0);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Set#clear()
     */
    @Override
    public void clear() {
	values.clear();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Set#contains(java.lang.Object)
     */
    @Override
    public boolean contains(Object object) {
	return values.contains(object);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Set#containsAll(java.util.Collection)
     */
    @Override
    public boolean containsAll(Collection<?> arg0) {
	return values.containsAll(arg0);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Set#isEmpty()
     */
    @Override
    public boolean isEmpty() {
	return values.isEmpty();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Set#iterator()
     */
    @Override
    public Iterator<E> iterator() {
	return values.iterator();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Set#remove(java.lang.Object)
     */
    @Override
    public boolean remove(Object object) {
	return values.remove(object);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Set#removeAll(java.util.Collection)
     */
    @Override
    public boolean removeAll(Collection<?> arg0) {
	return values.removeAll(arg0);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Set#retainAll(java.util.Collection)
     */
    @Override
    public boolean retainAll(Collection<?> arg0) {
	return values.retainAll(arg0);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Set#size()
     */
    @Override
    public int size() {
	return values.size();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Set#toArray()
     */
    @Override
    public Object[] toArray() {
	return values.toArray();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Set#toArray(T[])
     */
    @Override
    public <T> T[] toArray(T[] array) {
	return values.toArray(array);
    }

    /*
     * List Methods (non-Javadoc)
     * 
     * @see java.util.List#add(int, java.lang.Object)
     * 
     * @Override public void add(int index, E object) { values.add(index,
     * object); } (non-Javadoc)
     * 
     * @see java.util.List#addAll(int, java.util.Collection)
     * 
     * @Override public boolean addAll(int arg0, Collection<? extends E> arg1) {
     * return values.addAll(arg1); } (non-Javadoc)
     * 
     * @see java.util.List#lastIndexOf(java.lang.Object)
     * 
     * @Override public int lastIndexOf(Object object) { return
     * values.lastIndexOf(object); } (non-Javadoc)
     * 
     * @see java.util.List#listIterator()
     * 
     * @Override public ListIterator<E> listIterator() { return
     * values.listIterator(); } (non-Javadoc)
     * 
     * @see java.util.List#listIterator(int)
     * 
     * @Override public ListIterator<E> listIterator(int location) { return
     * values.listIterator(location); } (non-Javadoc)
     * 
     * @see java.util.List#remove(int)
     * 
     * @Override public E remove(int index) { return values.remove(index); }
     * (non-Javadoc)
     * 
     * @see java.util.List#set(int, java.lang.Object)
     * 
     * @Override public E set(int index, E object) { return values.set(index,
     * object); } (non-Javadoc)
     * 
     * @see java.util.List#subList(int, int)
     * 
     * @Override public List<E> subList(int start, int end) { return
     * values.subList(start, end); }
     */

}

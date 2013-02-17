/**
 * 
 */
package hmh.util;

<<<<<<< HEAD
=======
import hmh.util.LinkedHashSet;

>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
<<<<<<< HEAD
import java.util.LinkedHashSet;
=======
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Habeeb Hooshmand
 * 
 */
<<<<<<< HEAD
public class LinkedMap<K, V> implements Iterable<V>, Map<K, V> {
=======
public class LinkedMap<K, V> implements Iterable<V>, Map<K, V>, AbstractMap<K, V>  {
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    private List<K> keys;
    private List<V> values;

    public LinkedMap() {
<<<<<<< HEAD
	keys = new ArrayList<K>();
	values = new ArrayList<V>();
=======
		keys = new ArrayList<K>();
		values = new ArrayList<V>();
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    @Override
    public V put(K key, V value) {
<<<<<<< HEAD
	this.keys.add(key);
	this.values.add(value);

	return value;
=======
		this.keys.add(key);
		this.values.add(value);

		return value;
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    /**
     * Adds the Entry to the Map
     * 
     * @param index
     * @param key
     * @param value
     */
    public void put(int index, K key, V value) {
<<<<<<< HEAD
	this.keys.add(index, key);
	this.values.add(index, value);
=======
		this.keys.add(index, key);
		this.values.add(index, value);
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    @SuppressWarnings("unchecked")
    @Override
    public V get(Object key) {
<<<<<<< HEAD
	return getValue(indexOfKey((K) key));
=======
		return getValue(indexOfKey((K) key));
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    /**
     * Gets the Mapping as an individual HashMap.
     * 
     * @param index
     * @return The HashMap of the Mapping
     */
    public HashMap<K, V> getWholeAsMap(int index) {
<<<<<<< HEAD
	HashMap<K, V> map = new HashMap<K, V>();
	map.put(this.getKey(index), this.getValue(index));

	return map;
=======
		HashMap<K, V> map = new HashMap<K, V>();
		map.put(this.getKey(index), this.getValue(index));

		return map;
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    /**
     * Gets the value at the specified index.
     * 
     * @param index
     * @return
     */
    public V get(int index) {
<<<<<<< HEAD
	return getValue(index);
    }

    private K getKey(int index) {
	return keys.get(index);
    }

    private V getValue(int index) {
	return this.values.get(index);
    }

    private Integer indexOfKey(K key) {
	return this.keys.indexOf(key);
=======
		return getValue(index);
    }

    private K getKey(int index) {
		return keys.get(index);
    }

    private V getValue(int index) {
		return this.values.get(index);
    }

    private Integer indexOfKey(K key) {
		return this.keys.indexOf(key);
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    /**
     * Returns the postion of the Value in the map
     * 
     * @param value
     * @return The value's position.
     */
    public Integer indexOf(V value) {
<<<<<<< HEAD
	return this.values.indexOf(value);
=======
		return this.values.indexOf(value);
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    /**
     * Remove the value at the specified index
     * 
     * @param index
     */
    public void remove(int index) {
<<<<<<< HEAD
	this.keys.remove(index);
	this.values.remove(index);
=======
		this.keys.remove(index);
		this.values.remove(index);
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    @SuppressWarnings("unchecked")
    @Override
    public V remove(Object key) {
<<<<<<< HEAD
	V val = get(key);

	remove(indexOfKey((K) key));

	return val;
=======
		V val = get(key);

		remove(indexOfKey((K) key));

		return val;
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    /**
     * Removes the values at the specified Indexes.
     * 
     * @param indexes
     */
    public void remove(int... indexes) {
<<<<<<< HEAD
	for (int item : indexes) {
	    remove(item);
	}
=======
		for (int item : indexes) {
	    	remove(item);
		}
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    /**
     * Removes "count" values from the "start" position
     * 
     * @param start
     * @param count
     */
    public void remove(int start, int count) {
<<<<<<< HEAD
	for (int i = start; i < (start + count); i++) {
	    remove(i);
	}
=======
		for (int i = start; i < (start + count); i++) {
		    remove(i);
		}
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    @Override
    public int size() {
<<<<<<< HEAD
	return this.keys.size();
=======
		return this.keys.size();
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Iterable#iterator()
     */
    @Override
<<<<<<< HEAD
    public Iterator<V> iterator() {
	return values.iterator();
=======
   	public Iterator<V> iterator() {
		return values.iterator();
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Map#clear()
     */
    @Override
    public void clear() {
<<<<<<< HEAD
	this.keys.clear();
	this.values.clear();
=======
		this.keys.clear();
		this.values.clear();
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Map#containsKey(java.lang.Object)
     */
    @Override
    public boolean containsKey(Object key) {
<<<<<<< HEAD
	if (this.keys.contains(key)) {
	    return true;
	} else {
	    return false;
	}
=======
		if (this.keys.contains(key)) {
		    return true;
		} else {
		    return false;
		}
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Map#containsValue(java.lang.Object)
     */
    @Override
    public boolean containsValue(Object value) {
<<<<<<< HEAD
	if (this.values.contains(value)) {
	    return true;
	} else {
	    return false;
	}
=======
		if (this.values.contains(value)) {
		    return true;
		} else {
		    return false;
		}
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Map#entrySet()
     */
    @Override
    public Set<Entry<K, V>> entrySet() {
<<<<<<< HEAD
	Set<Entry<K, V>> set = new HashSet<Entry<K, V>>();

	for (int i = 0; i < size(); i++) {
	    Entry<K, V> entry = new AbstractMap.SimpleEntry<K, V>(getKey(i),
		    get(i));

	    set.add(entry);

=======
		Set<Entry<K, V>> set = new HashSet<Entry<K, V>>();

		for (int i = 0; i < size(); i++) {
	    	Entry<K, V> entry = new AbstractMap.SimpleEntry<K, V>(getKey(i),
			    get(i));

	    	set.add(entry);
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
	}

	return set;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Map#isEmpty()
     */
    @Override
    public boolean isEmpty() {
<<<<<<< HEAD
	if (keys.isEmpty() && values.isEmpty()) {
	    return true;
	} else {
	    return false;
	}
=======
		if (keys.isEmpty() && values.isEmpty()) {
		    return true;
		} else {
	   		return false;
		}
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Map#keySet()
     */
    @Override
    public Set<K> keySet() {
<<<<<<< HEAD
	Set<K> set = new HashSet<K>();
	for (K item : keys) {
	    set.add(item);
	}
	return set;
=======
		Set<K> set = new HashSet<K>();
		for (K item : keys) {
		    set.add(item);
		}
		return set;
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Map#values()
     */
    @Override
    public Collection<V> values() {
<<<<<<< HEAD
	return values;
=======
		return values;
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Map#putAll(java.util.Map)
     */
    @Override
    public void putAll(Map<? extends K, ? extends V> arg0) {
<<<<<<< HEAD

	LinkedHashSet<K> keySet = new LinkedHashSet<K>(arg0.keySet());

	this.values.addAll(arg0.values());

	for (K item : keySet) {
	    this.keys.add(item);
	}
=======
		LinkedHashSet<K> keySet = new LinkedHashSet<K>(arg0.keySet());

		this.values.addAll(arg0.values());

		for (K item : keySet) {
		    this.keys.add(item);
		}
>>>>>>> 711f638914a92ba14effa1a4aa47050f353af15a
    }
}

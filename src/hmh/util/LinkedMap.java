/**
 * 
 */
package hmh.util;

import hmh.util.LinkedHashSet;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Habeeb Hooshmand
 * 
 */
public class LinkedMap<K, V> implements Iterable<V>, Map<K, V>, AbstractMap<K, V>  {
    private List<K> keys;
    private List<V> values;

    public LinkedMap() {
		keys = new ArrayList<K>();
		values = new ArrayList<V>();
    }

    @Override
    public V put(K key, V value) {
		this.keys.add(key);
		this.values.add(value);

		return value;
    }

    /**
     * Adds the Entry to the Map
     * 
     * @param index
     * @param key
     * @param value
     */
    public void put(int index, K key, V value) {
		this.keys.add(index, key);
		this.values.add(index, value);
    }

    @SuppressWarnings("unchecked")
    @Override
    public V get(Object key) {
		return getValue(indexOfKey((K) key));
    }

    /**
     * Gets the Mapping as an individual HashMap.
     * 
     * @param index
     * @return The HashMap of the Mapping
     */
    public HashMap<K, V> getWholeAsMap(int index) {
		HashMap<K, V> map = new HashMap<K, V>();
		map.put(this.getKey(index), this.getValue(index));

		return map;
    }

    /**
     * Gets the value at the specified index.
     * 
     * @param index
     * @return
     */
    public V get(int index) {
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
    }

    /**
     * Returns the postion of the Value in the map
     * 
     * @param value
     * @return The value's position.
     */
    public Integer indexOf(V value) {
		return this.values.indexOf(value);
    }

    /**
     * Remove the value at the specified index
     * 
     * @param index
     */
    public void remove(int index) {
		this.keys.remove(index);
		this.values.remove(index);
    }

    @SuppressWarnings("unchecked")
    @Override
    public V remove(Object key) {
		V val = get(key);

		remove(indexOfKey((K) key));

		return val;
    }

    /**
     * Removes the values at the specified Indexes.
     * 
     * @param indexes
     */
    public void remove(int... indexes) {
		for (int item : indexes) {
	    	remove(item);
		}
    }

    /**
     * Removes "count" values from the "start" position
     * 
     * @param start
     * @param count
     */
    public void remove(int start, int count) {
		for (int i = start; i < (start + count); i++) {
		    remove(i);
		}
    }

    @Override
    public int size() {
		return this.keys.size();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Iterable#iterator()
     */
    @Override
   	public Iterator<V> iterator() {
		return values.iterator();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Map#clear()
     */
    @Override
    public void clear() {
		this.keys.clear();
		this.values.clear();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Map#containsKey(java.lang.Object)
     */
    @Override
    public boolean containsKey(Object key) {
		if (this.keys.contains(key)) {
		    return true;
		} else {
		    return false;
		}
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Map#containsValue(java.lang.Object)
     */
    @Override
    public boolean containsValue(Object value) {
		if (this.values.contains(value)) {
		    return true;
		} else {
		    return false;
		}
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Map#entrySet()
     */
    @Override
    public Set<Entry<K, V>> entrySet() {
		Set<Entry<K, V>> set = new HashSet<Entry<K, V>>();

		for (int i = 0; i < size(); i++) {
	    	Entry<K, V> entry = new AbstractMap.SimpleEntry<K, V>(getKey(i),
			    get(i));

	    	set.add(entry);
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
		if (keys.isEmpty() && values.isEmpty()) {
		    return true;
		} else {
	   		return false;
		}
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Map#keySet()
     */
    @Override
    public Set<K> keySet() {
		Set<K> set = new HashSet<K>();
		for (K item : keys) {
		    set.add(item);
		}
		return set;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Map#values()
     */
    @Override
    public Collection<V> values() {
		return values;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Map#putAll(java.util.Map)
     */
    @Override
    public void putAll(Map<? extends K, ? extends V> arg0) {
		LinkedHashSet<K> keySet = new LinkedHashSet<K>(arg0.keySet());

		this.values.addAll(arg0.values());

		for (K item : keySet) {
		    this.keys.add(item);
		}
    }
}

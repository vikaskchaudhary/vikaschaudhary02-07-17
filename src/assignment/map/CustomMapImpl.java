package assignment.map;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CustomMapImpl<K,V> implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9206766827638708894L;
	private   int  size;
	    private int DEFAULT_SIZE_LIMIT = 16;
	    @SuppressWarnings("unchecked")
	    private CustomMap<K, V>[] values = new CustomMap[DEFAULT_SIZE_LIMIT];


	    public synchronized V get(K key) {
	        for (int i = 0; i < size; i++) {
	            if (values[i] != null) {
	                if (values[i].getKey().equals(key)) {
	                    return values[i].getValue();
	                }
	            }
	        }
	        return null;
	    }

	    public synchronized void put(K key, V value) {
	        boolean insert = true;
	        for (int i = 0; i < size; i++) {
	            if (values[i].getKey().equals(key)) {
	                values[i].setValue(value);
	                insert = false;
	            }
	        }
	        if (insert) {
	        	spillOnDisk();
	            values[size++] = new CustomMap<K, V>(key, value);
	        }
	    }

	    private void spillOnDisk() {
	        if (size == values.length) {
	        	
	        	
	        /*	try( FileOutputStream fout=new FileOutputStream("spill.txt");  ObjectOutputStream out=new ObjectOutputStream(fout);  )
	        	{
					out.writeObject(values);  
					remove();
	        	}catch(IOException e)
	        	{
	        		
	        	}*/
	            int newSize = values.length * 2;
	            values = Arrays.copyOf(values, newSize);
	        }
	    }

	    public    int  size() {
	        return size;
	    }

	    public void remove() {
	        for (int i = 0; i < size; i++) {
	                values[i] = null;
	                size--;
	                condenseArray(i);
	        }
	    }

	    private void condenseArray(int start) {
	        for (int i = start; i < size; i++) {
	            values[i] = values[i + 1];
	        }
	    }
	    public Set<K> keySet() {
	        Set<K> set = new HashSet<K>();
	        for (int i = 0; i < size; i++) {
	            set.add(values[i].getKey());
	        }
	        return set;
	    }

}
	

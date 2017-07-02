package assignment.map;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

public class CustomMap<K,V> implements NavigableMap<K, V> ,Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final K key;
	    private V value;

	    public CustomMap(K key, V value) {
	        this.key = key;
	        this.value = value;
	    }

	    public K getKey() {
	        return key;
	    }

	    public V getValue() {
	        return value;
	    }

	    public void setValue(V value) {
	        this.value = value;
	    }

		@Override
		public Comparator<? super K> comparator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Set<java.util.Map.Entry<K, V>> entrySet() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public K firstKey() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Set<K> keySet() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public K lastKey() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Collection<V> values() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean containsKey(Object key) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsValue(Object value) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public V get(Object key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public V put(K key, V value) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void putAll(Map<? extends K, ? extends V> m) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public V remove(Object key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public java.util.Map.Entry<K, V> ceilingEntry(K key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public K ceilingKey(K key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NavigableSet<K> descendingKeySet() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NavigableMap<K, V> descendingMap() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public java.util.Map.Entry<K, V> firstEntry() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public java.util.Map.Entry<K, V> floorEntry(K key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public K floorKey(K key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SortedMap<K, V> headMap(K toKey) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NavigableMap<K, V> headMap(K toKey, boolean inclusive) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public java.util.Map.Entry<K, V> higherEntry(K key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public K higherKey(K key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public java.util.Map.Entry<K, V> lastEntry() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public java.util.Map.Entry<K, V> lowerEntry(K key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public K lowerKey(K key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NavigableSet<K> navigableKeySet() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public java.util.Map.Entry<K, V> pollFirstEntry() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public java.util.Map.Entry<K, V> pollLastEntry() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SortedMap<K, V> subMap(K fromKey, K toKey) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SortedMap<K, V> tailMap(K fromKey) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NavigableMap<K, V> tailMap(K fromKey, boolean inclusive) {
			// TODO Auto-generated method stub
			return null;
		}

}

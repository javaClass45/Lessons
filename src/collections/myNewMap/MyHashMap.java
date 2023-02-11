package collections.myNewMap;


import java.util.Objects;

public class MyHashMap<K,V> extends MyAbstarctMap<K,V> implements MyMap<K,V> {

    @Override
    public V put(K key, V value) {
        return null;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public void delete(Object key) {

    }

    static class MyNode<K,V> implements MyMap.MyEntry<K,V> {
        final int hash;
        final K key;
        V value;
        MyHashMap.MyNode<K,V> next;

        MyNode(int hash, K key, V value, MyHashMap.MyNode<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public final K getKey()        { return key; }

        @Override
        public V getVal() {
            return null;
        }

        @Override
        public V setVal(Object key, Object val) {
            return null;
        }

        public final V getValue()      { return value; }
        public final String toString() { return key + "=" + value; }

        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        public final V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        public final boolean equals(Object o) {
            if (o == this)
                return true;
            if (o instanceof MyMap.MyEntry) {
                MyMap.MyEntry<?,?> e = (MyMap.MyEntry<?,?>)o;
                if (Objects.equals(key, e.getKey()) &&
                        Objects.equals(value, e.getVal()))
                    return true;
            }
            return false;
        }
    }

}

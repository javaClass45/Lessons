package collections.myNewMap;

public interface MyMap<K,V> {
    V put(K key, V value);

    V get(Object key);

    void delete(Object key);


    interface MyEntry<K, V> {
        K getKey();

        V getVal();

        V setVal(Object key, Object val);

    }

}

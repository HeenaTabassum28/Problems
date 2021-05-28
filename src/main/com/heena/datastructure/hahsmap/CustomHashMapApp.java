package com.heena.datastructure.hahsmap;

class CustomHashMap<K, V> {
    private Entry<K, V>[] array;
    private int capacity = 4;

    public V get(K key) {
        int index = calculateHashCode(key);
        Entry<K, V> entry = array[index];
        while (entry != null) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
            entry = entry.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = calculateHashCode(key);
        Entry<K, V> previous = null;
        Entry<K, V> entry = array[index];
        while (entry != null) {
            if (entry.key.equals(key)) {

                if (null == previous) {
                    entry = entry.next;
                    array[index] = entry;
                    return;
                } else {
                    previous.next = entry.next;
                    return;
                }
            }
            previous = entry;
            entry = entry.next;
        }
    }

    public void print() {
        for (int i = 0; i < capacity; i++) {
            if (array[i] != null) {
                Entry<K, V> currentNode = array[i];
                while (currentNode != null) {
                    System.out.printf("Key is %s and value is %s%n", currentNode.key, currentNode.value);
                    currentNode = currentNode.next;
                }
            }
        }
    }

    static class Entry<K, V> {

        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

    }

    public CustomHashMap() {
        this.array = new Entry[capacity];
    }

    public V put(K newKey, V newValue) {
        if (null == newKey) {
            return null;
        }
        int index = calculateHashCode(newKey);
        Entry<K, V> newEntry = new Entry<>(newKey, newValue, null);
        if (null == array[index]) {
            array[index] = newEntry;
        } else {
            Entry<K, V> previous = null;
            Entry<K, V> current = array[index];
            while (current != null) {
                if (current.key.equals(newKey)) {
                    current.value = newValue;
                    return newValue;
                }
                previous = current;
                current = current.next;
            }
            if (previous != null) {
                previous.next = newEntry;
            }
        }
        return newValue;
    }

    private int calculateHashCode(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }


}

public class CustomHashMapApp {
    public static void main(String[] args) {
        CustomHashMap<Integer, Integer> hashMap = new CustomHashMap<>();
        hashMap.put(1, 10);
        hashMap.put(1, 20);
        hashMap.put(3, 30);
        System.out.println(hashMap.get(1));
        hashMap.print();
        hashMap.remove(1);
        hashMap.print();
    }

}

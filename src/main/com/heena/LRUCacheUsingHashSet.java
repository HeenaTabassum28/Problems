package com.heena;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class LRUCacheUsingHashSet {

    private int capacity;
    private Set<Integer> cache;

    public LRUCacheUsingHashSet(int capacity) {
        this.cache = new LinkedHashSet<>(capacity);
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        LRUCacheUsingHashSet lruCache = new LRUCacheUsingHashSet(4);
        lruCache.refer(1);
        lruCache.refer(2);
        lruCache.refer(3);
        lruCache.refer(1);
        lruCache.refer(4);
        lruCache.refer(5);
        lruCache.display();
    }

    private void display() {
        ArrayList<Integer> integers = new ArrayList<>(cache);
        for (int i = integers.size() - 1; i >= 0; i--) {
            System.out.println(integers.get(i));
        }
        //cache.forEach(integer -> System.out.println(integer));
    }

    private void refer(int key) {
        if (!cacheHit(key)) {
            loadCache(key);
        }
    }

    private void loadCache(int key) {
        evictIfCacheIsFull();
        cache.add(key);
    }

    private void evictIfCacheIsFull() {
        if (cache.size() == capacity) {
            Integer firstKey = cache.iterator().next();
            cache.remove(firstKey);
        }
    }

    private boolean cacheHit(int key) {
        if (!cache.contains(key)) {
            return false;
        }
        cache.remove(key);
        cache.add(key);
        return true;
    }

}

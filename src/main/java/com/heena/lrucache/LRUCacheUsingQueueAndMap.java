package com.heena.lrucache;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRUCacheUsingQueueAndMap {
    private Set<Integer> cache;
    private Deque<Integer> doublyQueue;
    private final int CACHE_SIZE;

    public LRUCacheUsingQueueAndMap(int capacity) {
        this.cache = new HashSet<>();
        this.doublyQueue = new LinkedList<>();
        this.CACHE_SIZE = capacity;
    }

    public static void main(String[] args) {
        LRUCacheUsingQueueAndMap lruCache = new LRUCacheUsingQueueAndMap(4);
        lruCache.refer(1);
        lruCache.refer(2);
        lruCache.refer(3);
        lruCache.refer(1);
        lruCache.refer(4);
        lruCache.refer(5);
    }

    private void refer(int page) {
        if (cache.contains(page)) {
            doublyQueue.remove(page);
        } else {
            if (doublyQueue.size() == CACHE_SIZE) {
                Integer last = doublyQueue.removeLast();
                cache.remove(last);
            }
        }
        doublyQueue.push(page);
        cache.add(page);
    }
}

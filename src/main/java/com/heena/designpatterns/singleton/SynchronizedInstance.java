package com.heena.designpatterns.singleton;

public class SynchronizedInstance {
    private static SynchronizedInstance obj;

    private SynchronizedInstance() {
    }

    public static synchronized SynchronizedInstance getInstance() {
        if (null == obj) {
            return new SynchronizedInstance();
        }
        return obj;
    }
}

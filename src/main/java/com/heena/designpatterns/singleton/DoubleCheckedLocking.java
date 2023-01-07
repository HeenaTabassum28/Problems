package com.heena.designpatterns.singleton;

public class DoubleCheckedLocking {
    private static volatile DoubleCheckedLocking obj;

    private DoubleCheckedLocking() {
    }

    public static DoubleCheckedLocking getInstance() {
        if (null == obj) {
            synchronized (DoubleCheckedLocking.class) {
                if (null == obj) {
                    // new DoublyLi
                    return new DoubleCheckedLocking();
                }
            }
        }
        return obj;
    }
}


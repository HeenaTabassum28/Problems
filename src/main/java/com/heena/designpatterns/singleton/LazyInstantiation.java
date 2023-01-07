package com.heena.designpatterns.singleton;

public class LazyInstantiation {
    private static LazyInstantiation obj;

    private LazyInstantiation() {
    }

    public LazyInstantiation getInstance() {
        if (null == obj) {
            return new LazyInstantiation();
        }
        return obj;
    }
}

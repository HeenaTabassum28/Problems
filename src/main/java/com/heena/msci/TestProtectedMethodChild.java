package com.heena.msci;

public class TestProtectedMethodChild extends TestProtectedMethod {
    int i=20;
    static {
        System.out.println("Static block from B");
    }

    TestProtectedMethodChild() {
        System.out.println("Constructor from B");
    }

    @Override
    public void view() {
        System.out.println("View from B");
    }

    public void view1() {
        System.out.println("View1 from B");
    }

}

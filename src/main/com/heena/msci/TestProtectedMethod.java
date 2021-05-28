package com.heena.msci;

public class TestProtectedMethod {
    int i=10;
    static {
        System.out.println("Static block from A");
    }

    TestProtectedMethod(){
        System.out.println("Constructor from A");
    }
    protected void protectedMethod(){
        System.out.println("in Protected Method");
    }
    public void view(){
        System.out.println("View from A");
    }
}

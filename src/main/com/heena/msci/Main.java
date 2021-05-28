package com.heena.msci;

public class Main {
    public static void main(String[] args) {
        TestProtectedMethod a = new TestProtectedMethodChild();
        a.view();
        System.out.println("iiii"+a.i);

        ((TestProtectedMethodChild) a).view1();
         TestProtectedMethodChild b = (TestProtectedMethodChild) new TestProtectedMethod();
         b.view();

       // new TestProtectedMethodChild();

    }
}

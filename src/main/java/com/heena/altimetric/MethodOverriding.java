package com.heena.altimetric;
class A {
    public void method(int a, int b) {
        System.out.println("in A");
    }
}

class B extends A {
    public void method(int a, int b) {
        System.out.println("in B");
    }
}

class C extends B {
    public void method(int a, int b) {
        System.out.println("in C");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        A a = new B();
        a.method(10, 20); // in B
        B b = (B) a;
        b.method(10, 20); // in B
        C c = (C) b;
        c.method(10, 20); // in B
    }

}

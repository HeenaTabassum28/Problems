package com.heena.altimetric;

public class MethodOverloading {
    public static void aMethod(long val1, int val2) {
        System.out.println("long, int");
    }

    public static void aMethod(int val1, long val2) {
        System.out.println("int, long");
    }

    public static void method2(long val1, long val2) {
        System.out.println("long, long");
    }

    public static void method2(int val1, int val2) {
        System.out.println("int, int");
    }

    public static void main(String[] args) {
        aMethod(9L, 10); // call to aMethod //Compile time error
        aMethod(9L, 10); // call to aMethod //Compile time error
        method2(8L, 8L);
    }
}

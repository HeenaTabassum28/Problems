package com.heena;

public class Main {

    public static void main(String[] args) {
       // testOverloading(null);
    }

    public static void testOverloading(Object obj) {
        System.out.println("Object testOverloading");
    }

    public void testOverloading(String obj) {
        System.out.println("String testOverloading");
    }

    public void testOverloading(Integer obj) {
        System.out.println("Integer testOverloading");
    }
}

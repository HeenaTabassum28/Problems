package com.heena.java8;

interface Interface1{
    default void m1(){
        System.out.println("I1");
    }

    default void m2(){
        System.out.println("M2 from I1");
    }

    static boolean isNull(String str) {
        System.out.println("Interface Null Check");

        return str == null || "".equals(str);
    }

}
interface Interface2{
    default void m1(){
        System.out.println("I2");
    }

    static void staticMethod(){
        System.out.println("Static from I2");
    }
}
public class DefaultMethod implements Interface1, Interface2{
    public static void main(String[] args) {
        new DefaultMethod().m1();
        new DefaultMethod().m2();
        isNull("HEena");
        Interface2.staticMethod();
    }

    @Override
    public void m1() {
        System.out.println("Mine");
    }

    static boolean isNull(String str) {
        System.out.println("Impl Null Check");

        return str == null;
    }
}

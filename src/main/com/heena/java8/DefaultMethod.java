package com.heena.java8;

interface Interface1{
    default void m1(){
        System.out.println();
    }
}
interface Interface2{
    default void m1(){
        System.out.println();
    }
}
public class DefaultMethod implements Interface1, Interface2{

    @Override
    public void m1() {

    }
}

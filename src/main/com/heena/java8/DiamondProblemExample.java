package com.heena.java8;
interface A{
    void abstractMethod();
    default void display(){
        System.out.println("From A");
    }
    default void onlyInA(){
        System.out.println("Drfault from A");
    }
}
interface B extends A{
    void abstractMethodFromB();
    default void display(){
        System.out.println("From B");
    }
}
interface C extends A{

}
public class DiamondProblemExample implements A,B {
    @Override
    public void abstractMethod() {

    }

    @Override
    public void display() {
        B.super.display();
    }

    @Override
    public void abstractMethodFromB() {

    }

    public static void main(String[] args) {
        DiamondProblemExample example = new DiamondProblemExample();
        example.display();
        example.onlyInA();

    }
}

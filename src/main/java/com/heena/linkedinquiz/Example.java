package com.heena.linkedinquiz;

public class Example {
    public static void main(String[] args) {
        Number number1 = new Number();
        number1.x = 100;

        Number number2 = new Number();
        number2.x = 1000;

        int x1 = number1.x;
        int x2 = number2.x;
        System.out.println(x1 == x2);
    }
}

class Number {
    int x = 10;
}

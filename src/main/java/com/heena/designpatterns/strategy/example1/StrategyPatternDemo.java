package com.heena.designpatterns.strategy.example1;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        System.out.println(new Context(new OperationAdd()).execute(1, 2));
        System.out.println(new Context(new OperationSubstract()).execute(1, 2));
        System.out.println(new Context(new OperationMultiply()).execute(1, 2));
    }
}

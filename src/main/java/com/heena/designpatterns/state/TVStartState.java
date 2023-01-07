package com.heena.designpatterns.state;

public class TVStartState implements State {
    @Override
    public void doAction() {
        System.out.println("Tv is turned on");
    }
}

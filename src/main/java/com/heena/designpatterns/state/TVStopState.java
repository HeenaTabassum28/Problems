package com.heena.designpatterns.state;

public class TVStopState implements State {
    @Override
    public void doAction() {
        System.out.println("Tv is turned off");
    }
}

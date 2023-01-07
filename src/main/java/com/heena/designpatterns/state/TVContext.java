package com.heena.designpatterns.state;

public class TVContext implements State {
    private State tvState;

    @Override
    public void doAction() {
        this.tvState.doAction();
    }

    public State getTvState() {
        return tvState;
    }

    public void setTvState(State tvState) {
        this.tvState = tvState;
    }
}

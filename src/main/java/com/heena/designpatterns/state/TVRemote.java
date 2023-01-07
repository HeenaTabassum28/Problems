package com.heena.designpatterns.state;

public class TVRemote {
    public static void main(String[] args) {
        TVContext tvContext = new TVContext();
        tvContext.setTvState(new TVStartState());
        tvContext.doAction();
        tvContext.setTvState(new TVStopState());
        tvContext.doAction();
    }
}

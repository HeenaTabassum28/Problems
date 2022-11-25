package com.heena.designpatterns.observerPattern;

public interface Observer {
    void update();
    void setObservable(Observable observable);
}

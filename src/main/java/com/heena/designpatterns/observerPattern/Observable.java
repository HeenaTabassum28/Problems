package com.heena.designpatterns.observerPattern;

public interface Observable {
    void register(Observer observer);

    void unRegister(Observer observer);

    void notifyObservers();

    Object getUpdate(Observer observer);
}

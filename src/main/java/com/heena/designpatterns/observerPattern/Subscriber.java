package com.heena.designpatterns.observerPattern;

public class Subscriber implements Observer {
    private final String name;
    private Observable topic;

    public Subscriber(String nm) {
        this.name = nm;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + ":: No new message");
        } else
            System.out.println(name + ":: Consuming message::" + msg);
    }

    @Override
    public void setObservable(Observable observable) {
        this.topic = observable;
    }
}

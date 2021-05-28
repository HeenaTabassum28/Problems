package com.heena.designpatterns.observerPattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Subscriber subscriber1 = new Subscriber("subscriber1");
        Subscriber subscriber2 = new Subscriber("subscriber2");
        Subscriber subscriber3 = new Subscriber("subscriber3");
        publisher.register(subscriber1);
        publisher.register(subscriber2);
        publisher.register(subscriber3);
        subscriber1.setObservable(publisher);
        subscriber2.setObservable(publisher);
        subscriber3.setObservable(publisher);
        subscriber1.update();
        publisher.postMessage("New Message");
    }
}

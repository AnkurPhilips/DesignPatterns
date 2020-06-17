package com.behavioral.observer;

public class Subscriber extends Observer {

    private final String subscriberName;

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(String message) {
        System.out.println("Hey "+this.subscriberName+", "+message);
    }
}

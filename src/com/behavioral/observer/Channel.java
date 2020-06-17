package com.behavioral.observer;

public class Channel extends Subject {

    private final String channelName ;

    public Channel(String channelName) {
        this.channelName = channelName;
    }

    public void upload(String message){
            this.notifyObservers(channelName+" uploaded a new video: "+message);
    }
}

package com.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args){
        Channel channel = new Channel("Gym for everyone");

        Subscriber ankur = new Subscriber("Ankur");
        channel.subscribe(ankur);

        Subscriber neha = new Subscriber("Neha");
        channel.subscribe(neha);

        Subscriber susu = new Subscriber("Susu");
        channel.subscribe(susu);

        channel.upload("Drink water everyday");
    }
}

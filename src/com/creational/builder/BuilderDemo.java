package com.creational.builder;

public class BuilderDemo {
    public static void main(String[] args){

        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("wheat").meat("chicken").dressing("lettuce").condiments("ketchup");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder);

    }
}

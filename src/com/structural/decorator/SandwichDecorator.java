package com.structural.decorator;

public abstract class SandwichDecorator implements Sandwich {
    protected Sandwich customSandwich ;

    public SandwichDecorator(Sandwich sandwich){
        this.customSandwich = sandwich;
    }

    public String make(){
        return customSandwich.make();
    }
}

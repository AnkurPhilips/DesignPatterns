package com.structural.decorator;

public class DressingDecorator extends MeatDecorator {
    public DressingDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    public String make(){
        return customSandwich.make()+addDressing();
    }

    private String addDressing() {
        return " + mustard";
    }
}

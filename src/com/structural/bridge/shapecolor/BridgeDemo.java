package com.structural.bridge.shapecolor;


public class BridgeDemo {
    public static void main(String[] args){
        Shape circle = new Circle();
        Color red = new Red();
        circle.applyColor(red);

        Shape square = new Square();
        Color green = new Green();
        square.applyColor(green);
    }
}

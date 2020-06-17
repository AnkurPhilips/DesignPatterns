package com.creational.AbstractFactory;

public abstract class CreditCard {
    protected int carNumberLength;

    public int getCarNumberLength() {
        return carNumberLength;
    }

    public void setCarNumberLength(int carNumberLength) {
        this.carNumberLength = carNumberLength;
    }

    public int getCscNumber() {
        return cscNumber;
    }

    public void setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
    }

    protected int cscNumber;
}

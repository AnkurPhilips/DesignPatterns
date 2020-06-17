package com.creational.AbstractFactory;

public class AmexGoldValidator extends Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}

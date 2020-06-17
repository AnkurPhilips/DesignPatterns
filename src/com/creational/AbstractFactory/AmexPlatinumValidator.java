package com.creational.AbstractFactory;

public class AmexPlatinumValidator extends Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}

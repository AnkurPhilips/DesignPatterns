package com.creational.AbstractFactory;

public class VisaValidator extends Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}

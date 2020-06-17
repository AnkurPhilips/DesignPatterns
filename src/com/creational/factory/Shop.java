package com.creational.factory;

public class Shop extends Website {
    @Override
    protected void createPage() {
        pages.add( new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}

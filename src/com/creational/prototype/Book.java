package com.creational.prototype;

public class Book extends Item {
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    private int numberOfPages;


}

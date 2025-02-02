package com.creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    public Website(){
        this.createPage();
    }

    public List<Page> getPages() {
        return pages;
    }

    protected abstract void createPage();
}

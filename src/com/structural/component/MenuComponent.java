package com.structural.component;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    private String name;
    private String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    MenuComponent(String name, String url){
        this.name = name;
        this.url = url;
    }

    public String getUrl(){
        return url;
    }

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Operation not supported at this level");
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Operation not supported at this level");
    }

    @Override
    public abstract String toString();

    public String print(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name).append(":").append(url).append('\n');
        return stringBuilder.toString();
    }
}

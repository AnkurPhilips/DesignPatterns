package com.structural.component;

public class Menu extends MenuComponent {

    Menu(String name, String url){
        super(name,url);
    }

    @Override
    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(print()).append("{\n");

        for(MenuComponent menuComponent: menuComponents){
            stringBuilder.append(menuComponent.toString());
        }

        stringBuilder.append("}\n");

        return stringBuilder.toString();
    }
}

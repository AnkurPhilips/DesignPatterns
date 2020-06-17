package com.structural.component;

public class MenuItem extends MenuComponent {

    MenuItem(String name, String url){
        super(name,url);
    }

    @Override
    public String toString() {
        return print();
    }

}

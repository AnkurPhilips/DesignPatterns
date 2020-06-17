package com.structural.component;

public class ComponentDemo {
    public static void main(String[] args){
        Menu mainMenu = new Menu("Main","/main");

        MenuItem safetyMenuItem = new MenuItem("Safety","/safety");

        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims","/claims");

        MenuItem personalClaims = new MenuItem("Personal claims","/personalClaims");

//        personalClaims.add(personalClaims);

        claimsSubMenu.add(personalClaims);

        mainMenu.add(claimsSubMenu);

        System.out.println(mainMenu.toString());


    }
}

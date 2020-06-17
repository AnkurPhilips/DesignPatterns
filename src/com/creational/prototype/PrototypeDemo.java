package com.creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args){
//        String sql = "SELECT * FROM MOVIES WHERE TITLE =?";
//        List<String> parameters = new ArrayList<>();
//        parameters.add("Star wars");
//        Record record = new Record();
//
//        Statement firstStatement = new Statement(sql,parameters,record);
//
//        System.out.println(firstStatement.getSql());
//
//        System.out.println(firstStatement.getParameters());
//
//        System.out.println(firstStatement.getRecord());
//
//        Statement secondStatement = firstStatement.clone();
//
//        System.out.println(secondStatement.getSql());
//
//        System.out.println(secondStatement.getParameters());
//
//        System.out.println(secondStatement.getRecord());
        Registry registry = new Registry();

        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Gang of four");

        System.out.println(movie.getTitle().hashCode());
        System.out.println(movie.getPrice().hashCode());
        System.out.println(movie.getRunTime().hashCode());

        movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational patterns in Java");

        System.out.println(movie.getTitle().hashCode());
        System.out.println(movie.getPrice().hashCode());
        System.out.println(movie.getRunTime().hashCode());

    }
}

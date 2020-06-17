package com.structural.bridge.movie;

public class MovieDemo {
    public static void main(String[] args){
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setRuntime("2:15");
        movie.setTitle("John Wick");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printtedMaterial = moviePrinter.print(printFormatter);
        System.out.println(printtedMaterial);

        Formatter htmlFormatter = new HtmlFormatter();

        System.out.println(moviePrinter.print(htmlFormatter));
    }
}

package com.structural.bridge.movie;

public class Movie {
    public String classification;
    public String runtime;
    public String title;
    public String year;

    public String getClassification() {
        return classification;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

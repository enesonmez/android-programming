package com.enesonmez.methodsandclasses;

public class Books {
    // attribute
    private String name;
    private String publication;
    private int year;

    public Books(String name, String publication, int year) {
        this.name = name;
        this.publication = publication;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

package com.enesonmez.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args){
        // Arrays
        String[] names = new String[3];
        names[0] = "Bob";
        names[1] = "Jessica";
        names[2] = "Ford";

        int[] ages = {30,40,50};

        System.out.println("Name: " + names[0] + " Age: " + ages[0]);

        // Lists
        ArrayList<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add(1,"frog");
        System.out.println(animals.get(1));
        System.out.println(animals.size());

        // Sets
        HashSet<String> myBooks = new HashSet<String>();
        myBooks.add("Hayvan Çiftliği");
        myBooks.add("Hayvan Çiftliği");
        System.out.println(myBooks.size());

        // Maps
        HashMap<String,Integer> sportsAndCalories = new HashMap<>();
        sportsAndCalories.put("run",100);
        sportsAndCalories.put("football",500);
        sportsAndCalories.put("fitness",800);
        System.out.println(sportsAndCalories.get("fitness"));
    }
}

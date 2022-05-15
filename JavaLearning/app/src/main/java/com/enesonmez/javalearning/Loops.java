package com.enesonmez.javalearning;

public class Loops {
    public static void main(String[] args){
        // for loop
        int[] numbers = {12,15,18,21,24,27,30};

        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]/3 * 5);
        }

        // foreach loop
        for (int number: numbers) {
            System.out.println(number/3 * 5);
        }

        // while loop
        int j = 0;
        while(j<10){
            System.out.println("test");
            j++;
        }
    }
}

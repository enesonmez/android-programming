package com.enesonmez.javalearning;

public class Statements {
    public static void main(String[] args){
        // Operators
        int x = 3;
        int y = 4;
        int z = 5;

        System.out.println(++x);
        System.out.println(x+1);
        System.out.println(x--);
        System.out.println(x-1);

        System.out.println(x>y);
        System.out.println(y<=z);
        System.out.println(x==y && z>y);
        System.out.println(x!=y || y<=z);

        // if Statement
        int num1 = 5;
        int num2 = 48;

        if(num1>num2){
            System.out.println("num1 is bigger");
        }
        else if(num1<num2){
            System.out.println("num2 is bigger");
        }
        else{
            System.out.println("num1 equal num2");
        }

        // Switch-case
        int day = 1;
        switch (day){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            default:
                System.out.println("Weekend");
        }
    }
}

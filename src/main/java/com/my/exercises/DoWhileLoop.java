package com.my.exercises;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);

        //The do/while loop always runs at least once, even if the condition is already false.
        i = 10;
        do {
            System.out.println("i is " + i);
            i++;
        } while (i < 5);
    }

}

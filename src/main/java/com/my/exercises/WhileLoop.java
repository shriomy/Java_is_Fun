package com.my.exercises;

public class WhileLoop {
    public static void main(String[] args) {
        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");

        System.out.println("break statement can be used to jump out of a loop");
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

        System.out.println("continue statement can be used to skip the current iteration of a loop");
        i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}

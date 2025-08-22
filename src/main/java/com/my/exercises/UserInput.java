package com.my.exercises;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String userName = myScanner.nextLine();
        System.out.println("Username is: " + userName);
    }
}

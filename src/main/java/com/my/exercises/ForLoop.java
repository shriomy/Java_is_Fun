package com.my.exercises;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid: ");
        int height = scanner.nextInt();

        if (height <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        printLeftPyramid(height);
        printCenteredPyramid(height);
        printRightPyramid(height);
    }

    public static void printLeftPyramid(int height) {
        System.out.println("\nLeft-Aligned Pyramid:");
        for (int row = 0; row < height; row++) {
            for (int star = 0; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printCenteredPyramid(int height) {
        System.out.println("\nCentered Pyramid:");
        int spaces = height - 1;
        for (int row = 0; row < height; row++) {
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
            spaces--;
        }
    }

    public static void printRightPyramid(int height) {
        System.out.println("\nRight-Aligned Pyramid:");
        int spaces = height - 1;
        for (int row = 0; row < height; row++) {
            for (int space = 0; space < spaces; space++) {
                System.out.print("  ");
            }
            for (int star = 0; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
            spaces--;
        }
    }
}

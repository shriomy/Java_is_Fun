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
        invertedPyramid(height);
        leftInvertedPyramid(height);
        rightInvertedPyramid(height);
        forEachLoopExample();;
        breakExample();
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

    public static void invertedPyramid(int height){
        System.out.println("\nInverted Pyramid");
        int columns = height + 1;
        for (int row = 0; row < height; row++) {
            System.out.println();
            for (int i = 0; i < row; i++) {
                System.out.print(" ");
            }
            columns--;
            for (int star = 0; star < columns; star++) {
                System.out.print("* ");
            }
        }
    }

    public static void leftInvertedPyramid(int height){
        System.out.println("\nLeft-Aligned Inverted Pyramid:");
        int columns = height;
        for (int row = 0; row < height; row++) {
            for (int i = 0; i < columns; i++) {
                System.out.print("* ");
            }
            System.out.println();
            columns--;
        }
    }

    public static void rightInvertedPyramid(int height){
        System.out.println("\nRight-Aligned Inverted Pyramid:");
        int columns = height;
        for (int rows = 0; rows < height; rows++) {
            for (int spaces = 0; spaces < rows; spaces++) {
                System.out.print("  ");
            }
            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }
            columns--;
            System.out.println();
        }

    }

    public static void forEachLoopExample() {
        System.out.println("\nFor-Each Loop Example:");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.print(i + ", ");
        }
    }

    public static void breakExample() {
        System.out.println("\n\nBreak Example:");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }

    public static void continueExample() {
        System.out.println("\nContinue Example: breaks one iteration in the loop and continues");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }

}

package com.my.exercises;

public class InterestingArrays {
    public static void main(String[] args) {
        System.out.println("Declare an array: String[] cars;");

        System.out.println("Insert values into it = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"}");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println("\nAccess the array elements= such as cars[0]");
        System.out.println(cars[0]);

        System.out.println("\nLoop through an array");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("\nLoop through an array using for-each loop");
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println("\nMulti-Dimentional Arrays");
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println("Accessing multi-dimensional array element: myNumbers[0][2]");
        System.out.println(myNumbers[0][2]);

        System.out.println("\nLoop through a multi-dimensional array");
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.print(myNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}

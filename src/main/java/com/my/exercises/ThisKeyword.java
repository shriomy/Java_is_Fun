package com.my.exercises;

public class ThisKeyword {
    int modelYear;
    String modelName;

    // Constructor with one parameter
    public ThisKeyword(String modelName) {
        // Call the two-parameter constructor to reuse code and set a default year
        this(2020, modelName);
    }

    // Constructor with two parameters
    public ThisKeyword(int modelYear, String modelName) {
        // Use 'this' to assign values to the class variables
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    // Method to print car information
    public void printInfo() {
        System.out.println(modelYear + " " + modelName);
    }

    public static void main(String[] args) {
        // Create a car with only model name (uses default year)
        ThisKeyword car1 = new ThisKeyword("Corvette");

        // Create a car with both model year and name
        ThisKeyword car2 = new ThisKeyword(1969, "Mustang");

        car1.printInfo();
        car2.printInfo();
    }
}

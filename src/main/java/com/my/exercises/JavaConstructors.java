package com.my.exercises;

public class JavaConstructors {
    int x;  // Create a class attribute

    // Create a class constructor for the Main class
    public JavaConstructors() {
        x = 5;  // Set the initial value for the class attribute x
    }

    public JavaConstructors(int y) { //Constructors can also take parameters, which is used to initialize attributes.
        x = y;
    }

    public static void main(String[] args) {
        JavaConstructors myObj = new JavaConstructors(6);
        System.out.println(myObj.x); // Print the value of x
        System.out.println("A constructor in Java is a special method that is used to initialize objects.\n" +
                "The constructor is called when an object of a class is created.\n" +
                "It can be used to set initial values for object attributes.\n" +
                "Constructors can also take parameters, which is used to initialize attributes.");
    }
}

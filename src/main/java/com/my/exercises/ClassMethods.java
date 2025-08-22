package com.my.exercises;

import org.w3c.dom.ls.LSOutput;

public class ClassMethods {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        ClassMethods myObj = new ClassMethods(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object

        System.out.println("static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects:");
    }
}

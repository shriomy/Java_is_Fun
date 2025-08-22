package com.my.exercises;

public class Modifiers_1 {

    public static void main(String[] args) {
        System.out.println("Non-access modifiers \n" +
                "final classes - The class cannot be inherited by other classes \n" +
                "abstract classes - The class cannot be used to create objects (To access an abstract class, it must be inherited from another class \n" +
                "final attributes and methods - Attributes and methods cannot be overridden/modified\n" +
                "static attributes and methods - belongs to the class, rather than an object\n" +
                "abstract - Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from).\n" +
                "synchronized methods - Methods can only be accessed by one thread at a time\n" +
                "volatile attributes - The value of an attribute is not cached thread-locally, and is always read from the \"main memory\"\n");
    }
}

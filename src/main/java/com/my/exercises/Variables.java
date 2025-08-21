package com.my.exercises;

public class Variables {
    public static void main(String[] args) {
        // Declare and initialize variables
        byte myByte = 100; //  8 bits
        short myShort = 10000; // 16 bits
        int number = 5; // 32 bits
        long largeNumber = 100000L; // long numbers should end with 'L' and size of 64 bits
        String text = "hello world";
        double decimalNumber = 10.5; // size of 64bits
        float myFloatNum = 5.99f; //float numbers should end with 'f' and it has 32bits
        final int myNum = 15; //If you don't want others (or yourself) to overwrite existing values, use the final keyword
        char myLetter = 'D';
        char myVar = 65; // ASCII value of 'A' is 65, so this will also print 'A'
        boolean myBool = true;

        // Output the variables
        System.out.println(text);
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(number);
        System.out.println(largeNumber);
        System.out.println(decimalNumber);
        System.out.println(myFloatNum);
        System.out.println(myNum);
        System.out.println(myLetter);
        System.out.println(myVar);
        System.out.println(myBool);

        // Perform arithmetic operation
        int sum = number + 10;
        System.out.println(sum); // Output: 15

        // Real life example
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        System.out.println("\nDATA TYPE CASTING");
        System.out.println("Widening casting");
        int x = 9;
        double y = x;
        System.out.println("Narrowing casting");
        double z = 9.78d;
        int q = (int) z;

    }
}

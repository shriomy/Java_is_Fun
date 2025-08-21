package com.my.exercises;

public class Operators {
    public static void main (String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        // Relational Operators
        System.out.println("Is a equal to b? " + (a == b)); // false
        System.out.println("Is a not equal to b? " + (a != b)); // true
        System.out.println("Is a greater than b? " + (a > b)); // true
        System.out.println("Is a less than or equal to b? " + (a <= b)); // false

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("x AND y: " + (x && y)); // false
        System.out.println("x OR y: " + (x || y)); // true
        System.out.println("NOT x: " + (!x)); // false

        // Bitwise Operators
        int m = 5, n = 3; // Binary: m=0101, n=0011
        System.out.println("Bitwise AND: " + (m & n)); // 1 (0001)
        System.out.println("Bitwise OR: " + (m | n)); // 7 (0111)
        System.out.println("Bitwise XOR: " + (m ^ n)); // 6 (0110)

        //Assignment Operators
        int p = 10;
        System.out.println(p+=5); // addition assignment
        System.out.println(p-=3); // subtraction assignment
        System.out.println(p*=2); // multiplication assignment
        System.out.println(p/=4); // division assignment
        System.out.println(p%=3); // modulus assignment
        System.out.println(p&=3); // bitwise AND operator
        System.out.println(p|=3); // bitwise OR operator
    }
}

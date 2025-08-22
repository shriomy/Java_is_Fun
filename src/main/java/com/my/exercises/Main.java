package com.my.exercises;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(5);
        System.out.println(5 + 10);

        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        myOuter.setX(20);
        myInner.setY(20);
        System.out.println(myInner.getY() + myOuter.getX());
    }
}

// In Java, every application begins with a class name, and that class must match the filename.
// every program must contain the main() method.//
//outputting texts should be in double quotes. but not arithmetic numbers

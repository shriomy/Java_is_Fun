package com.my.exercises;

public class JavaMethods {
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    // recursion: a method that calls itself
    public static int sumTill1(int k) {
        if (k > 0) {
            return k + sumTill1(k - 1);
        } else {
            return 0;
        }
    }
    public static int sumAllBtwn2nums(int first, int last){
//        int sum = first ;
//        do{
//            sum += ++first;
//        }
//        while (first < last);
//        return sum;

        if (last >= first) {
            return first + sumAllBtwn2nums(++first, last);
        } else {
            return 0;
        }
    }

    //method overloading: same method name with different parameter types
    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        int result = sumTill1(10);
        System.out.println(result);

        //addition all the numbers between two numbers
        System.out.println(sumAllBtwn2nums(2,4));
    }
}

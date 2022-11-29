package com.alamin.variables;

public class Root {
    // declare properties
    private static final Integer a = 25;
    private static final Integer b = 2;

    public static void main(String[] args) {
        System.out.println("Property of a = "+a);
        System.out.println("Property of b = "+b);
        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulo operator
        System.out.println("a % b = " + (a % b));

        // Right shift Operator of b
        System.out.println("2 Right shift of 1 bit 0010>>0001 = "+(b>>1));
        
        // Left shift Operator of b
        System.out.println("2 Left shift of 1 bit 0010>>0100 = "+(b<<1));
    }
}

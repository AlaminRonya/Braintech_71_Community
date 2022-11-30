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

        // Minimum and Maximum value and bytes
        System.out.println("Byte Minimum Value: "+Byte.MIN_VALUE + " and Bytes: "+Byte.BYTES);
        System.out.println("Byte Maximum Value: "+Byte.MAX_VALUE);
        System.out.println("Short Minimum Value: "+Short.MIN_VALUE + " and Bytes: "+Short.BYTES);
        System.out.println("Short Maximum Value: "+Short.MAX_VALUE);
        System.out.println("Integer Minimum Value: "+Integer.MIN_VALUE + " and Bytes: "+Integer.BYTES);
        System.out.println("Integer Maximum Value: "+Integer.MAX_VALUE);
        System.out.println("Long Minimum Value: "+Long.MIN_VALUE + " and Bytes: "+Long.BYTES);
        System.out.println("Long Maximum Value: "+Long.MAX_VALUE);
        System.out.println("Float Minimum Value: "+Float.MIN_VALUE + " and Bytes: "+Float.BYTES);
        System.out.println("Float Maximum Value: "+Float.MAX_VALUE);
        System.out.println("Double Minimum Value: "+Double.MIN_VALUE + " and Bytes: "+Double.BYTES);
        System.out.println("Double Maximum Value: "+Double.MAX_VALUE);

        // Ternary operator
        String str = "Rony";
        String s = (str instanceof String) ? "It is an instance of String." : "It is not an instance of String.";
        System.out.println(s);


    }
}

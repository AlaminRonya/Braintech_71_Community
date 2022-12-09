package com.alamin.character_to_binary;

public class Root {
    public static String decimalToBinary(int num){
        if (num < 0){
            throw new IllegalArgumentException("Sorry, This is negative number");
        }
        if (num == 0 ){
            return "0";
        }
        return toBinary(num);
    }
    private static String toBinary(int num){
        return (num > 0) ? toBinary(num / 2) + (num % 2) : "";
    }

    public static char binaryToCharacter(String binary){
        return (char) binaryToDecimal(binary);
    }

    private static int binaryToDecimal(String str){
        int size = str.length();
        if (size == 1) {
            return Integer.parseInt(str);
        } else {
            return binaryToDecimal(str.substring(1, size))
                    + Integer.parseInt(str.substring(0, 1))
                    * (int) Math.pow(2, size - 1);
        }
    }
    public static void main(String[] args) {

        System.out.println("Lower Case: Character To Binary");
        String lowerCaseCharacter = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < lowerCaseCharacter.length(); i++){
            char c = lowerCaseCharacter.charAt(i);
            String s = decimalToBinary(c);
            System.out.println(c+" ==> "+s);
        }
        System.out.println("==============================================");
        System.out.println("Upper Case: Character To Binary");
        String upperCaseCharacter = lowerCaseCharacter.toUpperCase();
        for (int i = 0; i < upperCaseCharacter.length(); i++){
            char c = upperCaseCharacter.charAt(i);
            String s = decimalToBinary(c);
            System.out.println(c+" ==> "+s);
        }

        System.out.println("==========================");
        System.out.println("Binary to Character converter");
        char s = binaryToCharacter("0000000000111100");
        System.out.println("Binary to Character: " +s);
    }
}

package com.alamin.bit_manipulation;

public class Bits {
    private static final int number = 12;

    public static void main(String[] args) {
        getBitOfPosition(number, 2);
        setBitOfPosition(number, 1);

    }

    // TODO: getBitOfPosition
    // 12 binary:           1 1 0 0
    // position numbering:  3 2 1 0
    // check bit 2 number position is bit 1.
    // 12 binary            ==> 1 1 0 0
    // bitMask value (1<<1) ==> 0 0 1 0
    //------------------------------------
    // & Operation          0 0 0 0 ==> 0

    private static void getBitOfPosition(int num, int position){

        // 0 1 0 1 0 1 <==bit
        // 5 4 3 2 1 0 <== position of number
        int pos = position-1;
        if (pos < 0){
            return;
        }
        int bitMask = 1<<pos;
        if ((num & bitMask) == 0){
            System.out.println("Bit is zero.");
        }else {
            System.out.println("Bit is one");
        }
    }


    // TODO:  setBitOfPosition position=1
    // 12 binary            ==> 1 1 0 0
    // bitMask value (1<<0) ==> 0 0 0 1
    //-----------------------------------
    // | Operation              1 1 0 1  ==> 13

    private static void setBitOfPosition(int num, int position){

        // 0 1 0 1 0 1 <==bit
        // 5 4 3 2 1 0 <== position of number
        int pos = position-1;
        if (pos < 0){
            return;
        }
        int bitMask = 1<<pos;
        int newNumber = num | bitMask;
        System.out.println(newNumber);

    }
}

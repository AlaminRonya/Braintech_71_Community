package com.alamin.array;

public class Root {
    int count = 0;

    public static void main(String[] args) {
        Root root = new Root();
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++){
            root.insertArray(arr, i);
        }
        root.print(arr);
        root.insertAtFirst(arr, -1);
//        root.insertAtFirst(arr, -1);
//        root.insertAtFirst(arr, -1);
        root.print(arr);
    }

    public void insertArray(int[] arr, int val){
        arr[count++] = val;
    }

    public void insertAtFirst(int[] arr, int val){
        for (int i = count-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0]=val;
    }
    public void print(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
}

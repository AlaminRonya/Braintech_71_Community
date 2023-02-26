package com.alamin.string;

public class Root {
    public static void main(String[] args) {

    }

    public String reversString(String s){
        if (s == null){
            return null;
        }
        int n = s.length();
        if (n == 1){
            return s;
        }
        char[] arr = s.toCharArray();
        int l = 0, r = n-1;
        while (l < r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return new String(arr);
    }
}

package com.alamin.duplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Root {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(new Root().containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i-1] == nums[i]){
//                return true;
//            }
//        }
//        return false;
        List<Integer> dup = new ArrayList<>();
        for (Integer n: nums){
            if (dup.contains(n)){
                return true;
            }
            dup.add(n);
        }
        return false;
    }
}

package com.learn.algoexpert.codinginterviewquestions.medium;

import java.util.HashSet;

public class ZeroSumSubArray {
    public static boolean solution(int[] nums) {
        boolean result = false;
        HashSet<Integer> sums = new HashSet<>();
        sums.add(0);
        int currentSum = 0;
        for(int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if(sums.contains(currentSum)) {
                result = true;
            }
            sums.add(currentSum);
        }
        return result;
    }
}

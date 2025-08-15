package com.learn.algoexpert.codinginterviewquestions.medium;

import java.util.Arrays;

public class MissingNumbers {
    public static int[] solution(int[] nums) {
        int[] result = new int[2];
        int missingNumbers = 0;
        int size = nums.length;
        for (int i = 1; i <= size + 2; i++) {
            missingNumbers = missingNumbers ^ i;
            if (i <= size) {
                missingNumbers = missingNumbers ^ nums[i - 1];
            }
        }
        int diffBit = missingNumbers & -missingNumbers;
        int firstMissingNumber = 0;
        int secondMissingNumber = 0;
        for (int i = 1; i <= size + 2; i++) {
            if ((i & diffBit) == 0) {
                firstMissingNumber = firstMissingNumber ^ i;
            } else {
                secondMissingNumber = secondMissingNumber ^ i;
            }
            if (i <= size) {
                if ((nums[i - 1] & diffBit) == 0) {
                    firstMissingNumber = firstMissingNumber ^ nums[i - 1];
                } else {
                    secondMissingNumber = secondMissingNumber ^ nums[i - 1];
                }
            }
        }
        result[0] = firstMissingNumber;
        result[1] = secondMissingNumber;
        Arrays.sort(result);
        return result;
    }
}

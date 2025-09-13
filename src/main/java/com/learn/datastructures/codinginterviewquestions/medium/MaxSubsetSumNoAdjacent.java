package com.learn.datastructures.codinginterviewquestions.medium;

public class MaxSubsetSumNoAdjacent {
    public static int maxSubsetSumNoAdjacent(int[] array) {
        int result = 0;
        if (array.length == 0) {
        } else if (array.length == 1) {
            result = array[0];
        } else {
            int first = array[0];
            int second = Math.max(array[0], array[1]);
            for (int i = 2; i < array.length; i++) {
                int sum = Math.max(first + array[i], second);
                first = second;
                second = sum;
            }
            result = Math.max(first, second);
        }
        return result;
    }
}

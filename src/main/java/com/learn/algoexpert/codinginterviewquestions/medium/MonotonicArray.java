package com.learn.algoexpert.codinginterviewquestions.medium;

public class MonotonicArray {
    public static boolean solution(int[] array) {
        boolean result = false;
        int increase = 0, decrease = 0;
        int size = array.length;
        for(int i = 1; i < size; i++) {
            if(array[i] <= array[i -1]) {
                decrease++;
            }
            if(array[i] >= array[i - 1]) {
                increase++;
            }
        }
        if(increase == size - 1 || decrease == size - 1 || size == 0) {
            result = true;
        }
        return result;
    }
}

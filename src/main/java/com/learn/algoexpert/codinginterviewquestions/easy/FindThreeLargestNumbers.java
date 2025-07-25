package com.learn.algoexpert.codinginterviewquestions.easy;

import java.util.Arrays;

public class FindThreeLargestNumbers {

    public static int[] solution(int[] array) {
        int[] result = new int[] {array[0], array[1], array[2]};
        for(int i = 3; i < array.length; i++) {
            if(result[0] < array[i]) {
                result[2] = result[1];
                result[1] = result[0];
                result[0] = array[i];
            } else if (result[1] < array[i]) {
                result[2] = result[1];
                result[1] = array[i];
            } else if (result[2] < array[i]) {
                result[2] = array[i];
            }
        }
        Arrays.sort(result);
        return result;
    }
}

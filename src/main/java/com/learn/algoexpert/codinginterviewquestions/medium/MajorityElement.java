package com.learn.algoexpert.codinginterviewquestions.medium;

public class MajorityElement {
    public static int solution(int[] array) {
        int result = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == result) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                result = array[i];
                count = 1;
            }
        }
        return result;
    }
}

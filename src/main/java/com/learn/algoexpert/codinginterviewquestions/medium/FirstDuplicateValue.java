package com.learn.algoexpert.codinginterviewquestions.medium;

public class FirstDuplicateValue {
    public static int solution(int[] array) {
        for(int ele: array) {
            ele = Math.abs(ele);
            if(array[ele - 1] < 0) {
                return ele;
            } else {
                array[ele - 1] *= -1;
            }
        }
        return -1;
    }
}

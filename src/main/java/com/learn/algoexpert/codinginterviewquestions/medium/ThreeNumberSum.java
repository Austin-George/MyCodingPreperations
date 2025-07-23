package com.learn.algoexpert.codinginterviewquestions.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static List<Integer[]> solution(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> result = new ArrayList<Integer[]>();
        int size = array.length;
        int leftIndx, rightIndx, sum;
        for(int i = 0; i < size-2; i++) {
            leftIndx = i + 1;
            rightIndx = size - 1;
            while (leftIndx < rightIndx) {
                sum = array[i] + array[leftIndx] + array[rightIndx];
                if(sum == targetSum) {
                    Integer[] triplet = {array[i], array[leftIndx], array[rightIndx]};
                    result.add(triplet);
                    rightIndx--;
                    leftIndx++;
                } else if (sum > targetSum) {
                    rightIndx--;
                } else {
                    leftIndx ++;
                }
            }
        }
        return result;
    }
}

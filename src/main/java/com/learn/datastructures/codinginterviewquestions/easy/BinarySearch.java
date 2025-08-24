package com.learn.datastructures.codinginterviewquestions.easy;

public class BinarySearch {
    public static int solution(int[] array, int target) {
        int leftIndx = 0, rightIndx = array.length - 1, midIndx = array.length / 2;
        int targetIndx = -1;
        while (leftIndx <= rightIndx) {
            if(array[midIndx] == target) {
                targetIndx = midIndx;
                break;
            } else if (array[midIndx] < target) {
                leftIndx = midIndx + 1;
            } else {
                rightIndx = midIndx - 1;
            }
            midIndx = (leftIndx + rightIndx) / 2;
        }
        return targetIndx;
    }
}

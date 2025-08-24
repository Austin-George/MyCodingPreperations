package com.learn.datastructures.codinginterviewquestions.easy;

public class SortedSquaredArray {
    public static int[] solution(int[] array) {
        int[] sortedArray = new int[array.length];
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        for(int idx = array.length -1; idx >=0; idx--) {
            int leftValue = array[leftIndex];
            int rightValue = array[rightIndex];
            if(Math.abs(leftValue) > Math.abs(rightValue)) {
                sortedArray[idx] = leftValue * leftValue;
                leftIndex++;
            } else {
                sortedArray[idx] = rightValue * rightValue;
                rightIndex--;
            }
        }
        return sortedArray;
    }
}

package com.learn.algoexpert.codinginterviewquestions.medium;

public class LongestPeak {
    public static int solution(int[] array) {
        int peak = 0;
        int i = 1;
        int size = array.length;
        while (i < size - 1) {
            int leftIndx = i - 1;
            int rightIndx = i + 1;
            if(array[leftIndx] < array[i] && array[rightIndx] < array[i]) {
                while (leftIndx >= 0) {
                    if (array[leftIndx] >= array[leftIndx + 1]) {
                        break;
                    }
                    leftIndx--;
                }
                while (rightIndx < size) {
                    if (array[rightIndx] >= array[rightIndx - 1]){
                        break;
                    }
                    rightIndx++;
                }
                int currentPeakHeight = rightIndx - leftIndx - 1;
                if(peak < currentPeakHeight) {
                    peak = currentPeakHeight;
                }
            }
            i = rightIndx;
        }
        return peak;
    }
}

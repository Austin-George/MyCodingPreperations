package com.learn.datastructures.codinginterviewquestions.easy;

public class SelectionSort {

    public static int[] solution(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            int smallIndx = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[smallIndx] > array[j]) {
                    smallIndx = j;
                }
            }
            if(smallIndx != i) {
                int temp = array[smallIndx];
                array[smallIndx] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
}

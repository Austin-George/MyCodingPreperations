package com.learn.datastructures.codinginterviewquestions.medium;

import java.util.Arrays;

public class SmallestDifference {
    public static int[] solution(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int[] result = new int[] {arrayOne[0], arrayTwo[0]};
        int sizeOne = arrayOne.length;
        int sizeTwo = arrayTwo.length;
        int i = 0, j = 0;
        int diff = Math.abs(arrayOne[0] - arrayTwo[0]);
        while (i < sizeOne && j < sizeTwo) {
            if(Math.abs(arrayOne[i] - arrayTwo[j]) < diff) {
                result[0] = arrayOne[i];
                result[1] = arrayTwo[j];
                diff = Math.abs(arrayOne[i] - arrayTwo[j]);
            }
            if(arrayOne[i] < arrayTwo[j]) {
                i++;
            } else {
                j++;
            }

        }
        return result;
    }
}

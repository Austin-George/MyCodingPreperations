package com.learn.datastructures.additional;

import java.util.Arrays;

public class NextHighestTemperature {
    public static int[] solution(int[] inputArray) {
        int size = inputArray.length;
        int[] resultant = new int[inputArray.length];
        for(int i = size-2; i >= 0; i--) {
            for(int j = i + 1; j<size; j++) {
                if(inputArray[i] < inputArray[j]) {
                    resultant[i] = j - i;
                    break;
                }
            }
        }
        return resultant;
    }

    public static void main(String[] args) {
        int[] input = new int[] {25,24,26};
        int[] result = solution(input);
        Arrays.stream(result).forEach(e -> System.out.println(e));
    }
}

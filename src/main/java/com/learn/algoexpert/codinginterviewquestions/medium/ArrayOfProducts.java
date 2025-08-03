package com.learn.algoexpert.codinginterviewquestions.medium;

public class ArrayOfProducts {

    public  static  int[] solution(int[] array) {
        int size = array.length;
        int[] result = new int[size];
        int product = 1;
        for (int i = 0; i < size; i++) {
            result[i] = product;
            product *= array[i];
        }
        product = 1;
        for (int i = size - 1; i >= 0; i--) {
            result[i] = result[i] * product;
            product *= array[i];
        }
        return result;
    }
}

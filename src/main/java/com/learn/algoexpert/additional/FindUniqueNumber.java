package com.learn.algoexpert.additional;

/*
Given that all number occurs exactly twice except one number which need to be found out.
 */

public class FindUniqueNumber {
    public static int solution(int[] array) {
        int unique = 0;
        for (int i:array) {
            unique = unique ^ i;
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 1, 6, 7, 7};
        System.out.println(solution(array));
    }
}

package com.learn.datastructures.codinginterviewquestions.easy;

import java.util.Arrays;

public class NonConstrucibleChange {
    public static int solution(int[] coins) {
        Arrays.sort(coins);
        int minAmount = 0;
        for(int i = 0;i < coins.length;i++) {
            if(coins[i] > minAmount + 1) {
                return minAmount + 1;
            } else {
                minAmount += coins[i];
            }
        }
        return minAmount + 1;
    }
}

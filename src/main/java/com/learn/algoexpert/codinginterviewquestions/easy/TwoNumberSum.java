package com.learn.algoexpert.codinginterviewquestions.easy;

import java.util.HashSet;

public class TwoNumberSum {

    public static int[] solution(int[] array, int targetSum) {
        HashSet<Integer> visited = new HashSet<>();
        for(int num: array) {
            int diff = targetSum - num;
            if(visited.contains(diff)) {
                return new int[] {num, diff};
            } else {
                visited.add(num);
            }
        }
        return new int[0];
    }
}

package com.learn.algoexpert.codinginterviewquestions.easy;

import java.util.Arrays;
import java.util.List;

public class MinimumWaitingTime {
    public int solution(int[] queries) {
        Arrays.sort(queries);
        int waitingTime = 0;
        int totalWaitingTime = 0;
        for(int i=1; i<queries.length; i++) {
            waitingTime = waitingTime + queries[i-1];
            totalWaitingTime = totalWaitingTime + waitingTime;
        }
        return totalWaitingTime;
    }
}

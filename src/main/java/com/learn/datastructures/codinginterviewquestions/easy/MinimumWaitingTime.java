package com.learn.datastructures.codinginterviewquestions.easy;

import java.util.Arrays;

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

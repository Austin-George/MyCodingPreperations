package com.learn.algoexpert.codinginterviewquestions.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public class OptimalFreelancing {
    public int solution(Map<String, Integer>[] jobs) {
        final int MAX_DAYS = 7;
        int[] occupiedDays = new int[MAX_DAYS];
        int maxProfit = 0;
        Arrays.sort(jobs, new Comparator<Map<String, Integer>>() {
            @Override
            public int compare(Map<String, Integer> job1, Map<String, Integer> job2) {
                return job2.get("payment").compareTo(job1.get("payment"));
            }
        });
        for(Map<String, Integer> job:jobs) {
            if(job.get("deadline") > MAX_DAYS) {
                job.put("deadline", MAX_DAYS);
            }
            int i = job.get("deadline") - 1;
            while(i >= 0) {
                if(occupiedDays[i] == 0) {
                    maxProfit += job.get("payment");
                    occupiedDays[i] = 1;
                    break;
                }
                i--;
            }
        }
        return maxProfit;
    }
}

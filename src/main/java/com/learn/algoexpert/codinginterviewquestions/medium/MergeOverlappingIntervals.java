package com.learn.algoexpert.codinginterviewquestions.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeOverlappingIntervals {
    public static int[][] solution(int[][] intervals) {
        ArrayList<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(row -> row[0]));
        int i = 1;
        result.add(intervals[i - 1]);
        int j = 0;
        while ( i < intervals.length) {
            if(result.get(j)[1] >= intervals[i][0]) {
                if(result.get(j)[1] < intervals[i][1]) {
                    result.get(j)[1] = intervals[i][1];
                }
            } else {
                result.add(intervals[i]);
                j++;
            }
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][] {{1, 2}, {9, 10}, {3, 5}, {6, 8}, {4, 7}};
        solution(intervals);
    }
}

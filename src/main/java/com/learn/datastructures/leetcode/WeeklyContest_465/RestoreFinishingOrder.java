package com.learn.datastructures.leetcode.WeeklyContest_465;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class RestoreFinishingOrder {
    public int[] solution(int[] order, int[] friends) {
        HashSet<Integer> frnds = Arrays.stream(friends)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));
        ArrayList<Integer> frndsOrder = new ArrayList<>();
        for (int i = 0; i < order.length; i++) {
            if (frnds.contains(order[i])) {
                frndsOrder.add(order[i]);
            }
        }
        return frndsOrder.stream().mapToInt(Integer::intValue).toArray();
    }
}

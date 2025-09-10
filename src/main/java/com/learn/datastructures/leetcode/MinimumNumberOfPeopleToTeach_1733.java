package com.learn.datastructures.leetcode;

import java.util.HashSet;

public class MinimumNumberOfPeopleToTeach_1733 {
    public int solution(int n, int[][] languages, int[][] friendships) {
        int result = Integer.MAX_VALUE;
        HashSet<Integer> users = new HashSet<>();

        for (int i = 0; i < friendships.length; i++) {
            int friend1 = friendships[i][0] - 1;
            int friend2 = friendships[i][1] - 1;

            boolean canTalk = false;
            for (int j = 0; j < languages[friend1].length; j++) {
                for (int k = 0; k < languages[friend2].length; k++) {
                    if (languages[friend1][j] == languages[friend2][k]) {
                        canTalk = true;
                        break;
                    }
                }
                if (canTalk) {
                    break;
                }
            }
            if (!canTalk) {
                users.add(friend1);
                users.add(friend2);
            }
        }

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int user:users) {
                boolean canTalk = false;
                for (int j = 0; j < languages[user].length; j++) {
                    if (languages[user][j] == i) {
                        canTalk = true;
                        break;
                    }
                }
                if (!canTalk) {
                    count++;
                }
            }
            result = Math.min(count, result);
        }
        return result;
    }
}

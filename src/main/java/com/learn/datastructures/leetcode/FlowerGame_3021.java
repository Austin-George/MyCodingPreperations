package com.learn.datastructures.leetcode;

public class FlowerGame_3021 {
    public static long solution(int n, int m) {
        long a,b;
        if (n%2 == 0) {
            if (m%2 == 0) {
                a = n/2;
                b = m/2;
                return 2 * (a * b);
            } else {
                a = n/2;
                b = m/2;
                return (a * b) + (a * (b  + 1));
            }
        } else {
            if (m%2 == 0) {
                a = n/2;
                b = m/2;
                return ((a + 1) * b) + (a * b);
            } else {
                a = n/2;
                b = m/2;
                return ((a + 1) * b) + ((b + 1) * a);
            }
        }
    }
}

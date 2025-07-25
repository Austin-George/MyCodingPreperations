package com.learn.algoexpert.codinginterviewquestions.easy;

public class NthFibonacci {
    public static int solution(int n) {
        int a = -1, b = 1;
        int nthNumber = 0;
        for(int i = 1; i <= n; i++) {
            nthNumber = a + b;
            a = b;
            b = nthNumber;
        }
        return nthNumber;
    }
}

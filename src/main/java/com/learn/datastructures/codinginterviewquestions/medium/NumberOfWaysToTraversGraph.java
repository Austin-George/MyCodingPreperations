package com.learn.datastructures.codinginterviewquestions.medium;

import java.math.BigInteger;

public class NumberOfWaysToTraversGraph {
    public int numberOfWaysToTraverseGraph(int width, int height) {
        return factorial(width + height - 2) / (factorial(width - 1) * factorial(height - 1));
    }

    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

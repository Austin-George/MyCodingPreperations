package com.learn.datastructures.leetcode;

import java.util.Arrays;

public class SortByDiagonals_3446 {
    public int[][] solution(int[][] grid) {
        int size = grid.length;
        int i,j,k;
        for (k = 0; k < size; k++) {
            int[] diagonal = new int[size - k];
            for (i = k, j = 0; i < size && j < size - k; i++, j++) {
                diagonal[j] = grid[i][j];
            }
            Arrays.sort(diagonal);
            for (i = k, j = 0; i < size && j < size - k; i++, j++) {
                grid[i][j] = diagonal[size - k - j - 1];
            }
        }
        for (k = size - 1; k >= 1; k--) {
            int[] diagonal = new int[size - k];
            for (i = 0, j = k; i < size - k && j < size; i++, j++) {
                diagonal[i] = grid[i][j];
            }
            Arrays.sort(diagonal);
            for (i = 0, j = k; i < size - k && j < size; i++, j++) {
                grid[i][j] = diagonal[i];
            }
        }
        return grid;
    }
}

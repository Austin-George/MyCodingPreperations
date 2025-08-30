package com.learn.datastructures.codinginterviewquestions.medium;

public class SearchInSortedMatrix {
    public int[] solution(int[][] matrix, int target) {
        int targetRow = -1;
        int targetColumn = -1;
        int row = matrix.length;
        int column = matrix[0].length;
        int j = column - 1;
        int i = 0;
        while(i < row && j >= 0) {
            if (matrix[i][j] == target) {
                targetRow = i;
                targetColumn = j;
                break;
            } else if (matrix[i][j] > target) {
                j--;
            } else if (matrix[i][j] < target) {
                i++;
            }
        }
        return new int[] {targetRow, targetColumn};
    }
}

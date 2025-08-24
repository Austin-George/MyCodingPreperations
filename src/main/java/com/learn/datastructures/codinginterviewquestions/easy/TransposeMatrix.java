package com.learn.datastructures.codinginterviewquestions.easy;

public class TransposeMatrix {
    public static int[][] solution(int[][] matrix) {
        int matrixRow = matrix.length;
        int matrixColumn = matrix[0].length;
        int[][] transposeMatrix = new int[matrixColumn][matrixRow];
        for(int i = 0;i < matrixRow;i++) {
            for(int j = 0;j < matrixColumn;j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }
}

package com.learn.algoexpert.codinginterviewquestions.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigzagTraverse {
    public static List<Integer> solution(List<List<Integer>> array) {
        List<Integer> result = new ArrayList<>();
        int rows = array.size();
        int columns = array.get(0).size();
        int leftColumn = 0;
        int rightColumn = 0;
        int topRow = 0;
        int bottomRow = 0;
        int count = 0;
        int totalCount = rows * columns;
        int flag = 0;
        while (count < totalCount) {
            if (flag == 0) {
                for (int i = topRow, j = rightColumn; i <= bottomRow && j >= leftColumn; i++, j--) {
                    result.add(array.get(i).get(j));
                    count++;
                }
                flag = 1;
            } else {
                for (int i = bottomRow, j = leftColumn; i >= topRow && j <= rightColumn; i--, j++) {
                    result.add(array.get(i).get(j));
                    count++;
                }
                flag = 0;
            }
            System.out.println(" " + topRow + " " + bottomRow + " " + leftColumn + " " + rightColumn);
            if (bottomRow == rows - 1 && leftColumn < columns - 1) {
                leftColumn++;
            }
            if (bottomRow < rows -1) {
                bottomRow++;
            }
            if (rightColumn == columns - 1 && topRow < rows - 1) {
                topRow++;
            }
            if (rightColumn < columns - 1) {
                rightColumn++;
            }
        }
        return result;
    }
}

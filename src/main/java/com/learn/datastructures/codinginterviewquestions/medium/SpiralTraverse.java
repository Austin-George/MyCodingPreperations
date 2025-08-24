package com.learn.datastructures.codinginterviewquestions.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public static List<Integer> solution(int[][] array) {
        ArrayList<Integer> result = new ArrayList<>();
        int rows = array.length;
        int columns = array[0].length;
        int count = rows * columns;
        int startRow = 0;
        int startColumn = 0;
        int endRow = rows - 1;
        int endColumn = columns - 1;
        int i;
        while (count > 0 && startRow <= endRow && startColumn <= endColumn) {
            for (i = startColumn; i <= endColumn; i++) {
                result.add(array[startRow][i]);
                count--;
            }
            if(count == 0) break;
            startRow++;
            for (i = startRow; i <= endRow; i++) {
                result.add(array[i][endColumn]);
                count--;
            }
            if(count == 0) break;
            endColumn--;
            for (i = endColumn; i >= startColumn; i--) {
                result.add(array[endRow][i]);
                count--;
            }
            if(count == 0) break;
            endRow--;
            for (i = endRow; i >= startRow; i--) {
                result.add(array[i][startColumn]);
                count--;
            }
            if(count == 0) break;
            startColumn++;
        }
        return result;
    }
}

package com.learn.datastructures.codinginterviewquestions.veryhard;

import java.util.ArrayList;
import java.util.HashSet;

public class MinimumAreaRectangle {
    public static int solution(int[][] points) {
        int minArea = Integer.MAX_VALUE;
        int size = points.length;

        HashSet<ArrayList<Integer>> pointsSet = new HashSet<>();
        for (int i = 0; i < size; i++) {
            ArrayList<Integer> point = new ArrayList<>();
            point.add(points[i][0]);
            point.add(points[i][1]);
            pointsSet.add(point);
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                int x1 = points[i][0];
                int y1 = points[i][1];
                int x2 = points[j][0];
                int y2 = points[j][1];
                if (x1 == x2 || y1 == y2) {
                    continue;
                }
                ArrayList<Integer> newPoint1 = new ArrayList<>();
                ArrayList<Integer> newPoint2 = new ArrayList<>();
                newPoint1.add(x1);
                newPoint1.add(y2);
                newPoint2.add(x2);
                newPoint2.add(y1);
                if(pointsSet.contains(newPoint1) && pointsSet.contains(newPoint2)) {
                    int l = Math.abs(x1 - x2);
                    int b = Math.abs(y1 - y2);
                    int area = l * b;
                    if(area < minArea) {
                        minArea = area;
                    }
                }
            }
        }
        return minArea == Integer.MAX_VALUE? 0 : minArea;
    }
}

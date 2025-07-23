package com.learn.algoexpert.codinginterviewquestions.easy;

import java.util.ArrayList;
import java.util.Collections;

public class ClassPhoto {
    public boolean solution(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        boolean result = true;
        int rowSize = redShirtHeights.size();
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        System.out.println(redShirtHeights);
        if(redShirtHeights.get(0) < blueShirtHeights.get(0)) {
            result = findAnswer(redShirtHeights, blueShirtHeights, rowSize);
        } else if(redShirtHeights.get(0) > blueShirtHeights.get(0)) {
            result = findAnswer(blueShirtHeights, redShirtHeights, rowSize);
        }
        else {
            result = false;
        }
       return result;
    }
    public boolean findAnswer(ArrayList<Integer> frontRow, ArrayList<Integer> backRow, int rowSize) {
        int indx = 0;
        while (indx < rowSize) {
            if(frontRow.get(indx) >= backRow.get(indx)) {
                return false;
            }
            indx++;
        }
        return true;
    }
}

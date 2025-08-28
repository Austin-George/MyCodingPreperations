package com.learn.datastructures.codinginterviewquestions.medium;

public class SingleCycleCheck {
    public static boolean solution(int[] array) {
        int loopCount = 1;
        int size = array.length;
        int indx = 0;
        while (loopCount < size) {
            indx = getIndx(indx, array[indx], size);
            if (indx == 0) {
                return false;
            }
            loopCount++;
        }
        indx = getIndx(indx, array[indx], size);
        return indx == 0;
    }

    static int getIndx(int currentIndx, int jumps, int size) {
        int indx = (currentIndx + jumps) % size;
        return indx >= 0 ? indx : size + indx;
    }
}

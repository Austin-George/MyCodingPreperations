package com.learn.datastructures.codinginterviewquestions.medium;

import java.util.List;

public class MoveElementToEnd {
    public static List<Integer> solution(List<Integer> array, int toMove) {
        int size = array.size();
        int i = 0, j = size - 1;
        while(i < j) {
            if(array.get(j) == toMove) {
                j--;
                continue;
            }
            if(array.get(i) == toMove) {
                int temp = array.get(j);
                array.set(j, array.get(i));
                array.set(i, temp);
                j--;
            }
            i++;
        }
        return array;
    }
}

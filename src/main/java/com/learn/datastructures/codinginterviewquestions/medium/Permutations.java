package com.learn.datastructures.codinginterviewquestions.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> solution(List<Integer> array) {
        List<List<Integer>> result = new ArrayList<>();
        if (array.isEmpty()) {
            return new ArrayList<>();
        }
        return getPermutation(array, result);
    }

    public static List<List<Integer>> getPermutation(List<Integer> array, List<List<Integer>> result) {
        if (array.isEmpty()) {
            List<List<Integer>> result1 = new ArrayList<>();
            result1.add(new ArrayList<>());
            return result1;
        }
        for(int i = 0; i < array.size(); i++) {
            List<Integer> array1 = new ArrayList<>(array);
            array1.remove(i);
            List<List<Integer>> newResult = new ArrayList<>();
            List<List<Integer>> resultTemp = getPermutation(array1, newResult);
            array1.add(array.get(i));
            for (List<Integer> ele : resultTemp) {
                ele.add(0, array.get(i));
            }
            result.addAll(resultTemp);
        }
        return result;
    }
}

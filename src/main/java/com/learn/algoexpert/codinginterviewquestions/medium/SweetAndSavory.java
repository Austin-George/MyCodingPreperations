package com.learn.algoexpert.codinginterviewquestions.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SweetAndSavory {
    public static int[] solution(int[] dishes, int target) {
        int[] result = new int[2];
        ArrayList<Integer> sweetDishes = new ArrayList<>();
        ArrayList<Integer> savouryDishes = new ArrayList<>();
        for (int dish:dishes) {
            if (dish < 0) {
                sweetDishes.add(dish);
            } else {
                savouryDishes.add(dish);
            }
        }
        sweetDishes.sort(Comparator.comparingInt(Math::abs));
        savouryDishes.sort(Comparator.naturalOrder());
        int sweetIndx = 0;
        int savouryIndx = 0;
        int closestTarget = Integer.MAX_VALUE;
        while (sweetIndx < sweetDishes.size() && savouryIndx < savouryDishes.size()) {
            int currentPair = sweetDishes.get(sweetIndx) + savouryDishes.get(savouryIndx);
            if (currentPair < target) {
                int diff = target - currentPair;
                if (diff < closestTarget) {
                    closestTarget = diff;
                    result[0] = sweetDishes.get(sweetIndx);
                    result[1] = savouryDishes.get(savouryIndx);
                }
                savouryIndx++;
            } else {
                sweetIndx++;
            }
        }
        return result;
    }
}

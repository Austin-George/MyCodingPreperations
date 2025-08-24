package com.learn.datastructures.codinginterviewquestions.easy;

import java.util.Arrays;

public class TandemBicycle {
    public int solution(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        int totalSpeed = 0;
        int size = redShirtSpeeds.length;
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);
        if(fastest) {
            for (int i = 0; i < size / 2; i++) {
                int temp = blueShirtSpeeds[i];
                blueShirtSpeeds[i] = blueShirtSpeeds[size - 1 - i];
                blueShirtSpeeds[size - 1 - i] = temp;
            }
        }
        for(int i = 0; i < size; i++) {
            totalSpeed += Math.max(redShirtSpeeds[i], blueShirtSpeeds[i]);
        }
        return totalSpeed;
    }
}

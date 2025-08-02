package com.learn.algoexpert.codinginterviewquestions.easy;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public int solution(String string) {
        int result = -1;
        HashMap<Character, Integer> count = new HashMap<>();
        for(int i = 0; i < string.length(); i++) {
            count.put(string.charAt(i), count.getOrDefault(string.charAt(i), 0) + 1);
        }
        for(int i = 0; i < string.length(); i++) {
            if(count.get(string.charAt(i)) == 1) {
                result = i;
                break;
            }
        }
        return result;
    }
}

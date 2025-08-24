package com.learn.datastructures.codinginterviewquestions.easy;

import java.util.HashMap;

public class GenerateDocument {

    public boolean solution(String characters, String document) {
        boolean result = true;
        HashMap<Character, Integer> count = new HashMap<>();
        for(int i = 0; i < characters.length(); i++) {
            count.put(characters.charAt(i), count.getOrDefault(characters.charAt(i), 0) + 1);
        }
        for(int i = 0; i < document.length(); i++) {
            if(count.containsKey(document.charAt(i)) && count.get(document.charAt(i)) > 0) {
               count.put(document.charAt(i), count.get(document.charAt(i)) - 1);
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}

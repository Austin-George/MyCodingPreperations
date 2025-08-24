package com.learn.datastructures.codinginterviewquestions.easy;

import java.util.HashSet;

public class CommonCharacters {

    public static String[] solution(String[] strings) {
        String smallestStr = strings[0];
        HashSet<Character> result = new HashSet<>();
        for(String str : strings) {
            if(str.length() < smallestStr.length()) {
                smallestStr = str;
            }
        }
        for(int i = 0; i < smallestStr.length(); i++) {
            result.add(smallestStr.charAt(i));
        }
        for(String str : strings) {
            HashSet<Character> strCh = new HashSet<>();
            for(int i = 0; i < str.length(); i++) {
                strCh.add(str.charAt(i));
            }
            HashSet<Character> toRemove = new HashSet<>();
            for(char ch : result) {
                if(!strCh.contains(ch)) {
                    toRemove.add(ch);
                }
            }
            for(char ch : toRemove) {
                result.remove(ch);
            }
        }
        String[] output = new String[result.size()];
        int  i = 0;
        for(Character ch : result) {
            output[i] = ch.toString();
            i++;
        }
        return output;
    }
}

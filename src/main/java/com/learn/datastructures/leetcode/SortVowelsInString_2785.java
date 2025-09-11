package com.learn.datastructures.leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class SortVowelsInString_2785 {
    public static String solution(String s) {
        StringBuilder str = new StringBuilder();
        ArrayList<Character> vowels = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels.add(s.charAt(i));
            }
        }
        Collections.sort(vowels);
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    str.append(vowels.get(j));
                    j++;
                    break;
                default:
                    str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}

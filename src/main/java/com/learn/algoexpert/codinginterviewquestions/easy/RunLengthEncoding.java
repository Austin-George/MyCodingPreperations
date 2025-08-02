package com.learn.algoexpert.codinginterviewquestions.easy;

public class RunLengthEncoding {

    public static String solution(String string) {
        StringBuilder encodedStr = new StringBuilder();
        int i = 0, count = 0;
        while (i < string.length()) {
            char ch = string.charAt(i);
            while (i < string.length() && string.charAt(i) == ch && count < 9) {
                count++;
                i++;
            }
            encodedStr.append(count).append(ch);
            count = 0;
        }
        return encodedStr.toString();
    }
}

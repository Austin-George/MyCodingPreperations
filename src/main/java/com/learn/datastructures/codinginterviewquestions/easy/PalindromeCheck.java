package com.learn.datastructures.codinginterviewquestions.easy;

public class PalindromeCheck {

    public static boolean solution(String str) {
        StringBuilder revers = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--) {
            revers.append(str.charAt(i));
        }
        return str.equals(revers.toString());
    }
}

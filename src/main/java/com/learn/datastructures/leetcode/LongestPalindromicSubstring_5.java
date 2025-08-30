package com.learn.datastructures.leetcode;

public class LongestPalindromicSubstring_5 {
    public static String solution(String s) {
        String palindrome = "";
        int size = s.length();
        int maxPalindromLenght = 0;
        StringBuilder sReverse = new StringBuilder(s);
        if(size == 1 || s.equals(sReverse.reverse().toString())) {
            return s;
        }
        int i = 0;
        while (i < size) {
            int leftIndx = i;
            int rightIndx = i;
            int count = 1;
            while (rightIndx < size - 1 && s.charAt(rightIndx) == s.charAt(rightIndx + 1)) {
                rightIndx++;
                count++;
            }
            leftIndx--;
            rightIndx++;
            while (leftIndx >= 0 && rightIndx < size) {
                if (s.charAt(leftIndx) == s.charAt(rightIndx)) {
                    leftIndx--;
                    rightIndx++;
                    count += 2;
                } else {
                    break;
                }
            }
            if (count > maxPalindromLenght) {
                palindrome = s.substring(leftIndx + 1, rightIndx);
                maxPalindromLenght = count;
            }
            i++;
        }
        return palindrome;
    }
}

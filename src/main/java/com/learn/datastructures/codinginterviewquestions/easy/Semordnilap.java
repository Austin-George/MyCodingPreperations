package com.learn.datastructures.codinginterviewquestions.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Semordnilap {
    public ArrayList<ArrayList<String>> solution(String[] words) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        HashSet<String> wordSet = new HashSet<>(Arrays.asList(words));
        for (String word: words) {
            String reverseWord = new StringBuilder(word).reverse().toString();
            if(wordSet.contains(reverseWord) && !reverseWord.equals(word)) {
                ArrayList<String> pair = new ArrayList<>();
                pair.add(word);
                pair.add(reverseWord);
                result.add(pair);
                wordSet.remove(word);
                wordSet.remove(reverseWord);
            }
        }
        return result;
    }
}

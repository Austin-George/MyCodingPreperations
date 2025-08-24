package com.learn.datastructures.codinginterviewquestions.easy;

import java.util.List;

public class ValidateSubsequence {
    public static boolean solution(List<Integer> array, List<Integer> sequence) {
        int sequenceIndex = 0;
        for(int i = 0; i < array.size(); i++) {
            if(sequenceIndex <= sequence.size() - 1 && array.get(i) == sequence.get(sequenceIndex)) {
                sequenceIndex++;
            }
        }
        if(sequenceIndex == sequence.size()) {
            return true;
        }
        return false;
    }
}

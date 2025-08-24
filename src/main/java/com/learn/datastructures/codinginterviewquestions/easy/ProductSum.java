package com.learn.datastructures.codinginterviewquestions.easy;

import java.util.List;

public class ProductSum {

    public static int solution(List<Object> array) {
        return getAnswer(1, array);
    }

    public static int getAnswer(int depth, List<Object> array) {
        int result = 0;
        for(Object object:array) {
            if(object instanceof List<?>) {
                result += getAnswer(depth + 1, (List)object);
            } else {
                result += (int)object;
            }
        }
        return depth * result;
    }
}

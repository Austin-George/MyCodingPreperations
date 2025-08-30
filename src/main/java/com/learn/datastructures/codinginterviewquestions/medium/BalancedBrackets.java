package com.learn.datastructures.codinginterviewquestions.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean solution(String str) {
        boolean result = true;
        Stack<Character> stack = new Stack<>();
        HashSet<Character> openBrackets = new HashSet<>();
        openBrackets.add('[');
        openBrackets.add('(');
        openBrackets.add('{');
        HashSet<Character> closeBracktes = new HashSet<>();
        closeBracktes.add(']');
        closeBracktes.add(')');
        closeBracktes.add('}');
        HashMap<Character,Character> brackets = new HashMap<>();
        brackets.put(']', '[');
        brackets.put(')', '(');
        brackets.put('}', '{');
        for (int i = 0; i < str.length(); i++) {
            if (!openBrackets.contains(str.charAt(i)) && !closeBracktes.contains(str.charAt(i))) {
                continue;
            }
            if (openBrackets.contains(str.charAt(i))) {
                stack.push(str.charAt(i));
            } else if (!stack.isEmpty() && stack.peek() == brackets.get(str.charAt(i))) {
                stack.pop();
            } else {
                result = false;
                break;
            }
        }
        if (!stack.isEmpty()) {
            result = false;
        }
        return result;
    }
}

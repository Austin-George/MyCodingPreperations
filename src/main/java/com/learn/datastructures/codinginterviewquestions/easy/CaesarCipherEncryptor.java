package com.learn.datastructures.codinginterviewquestions.easy;

public class CaesarCipherEncryptor {

    public static String solution(String str, int key) {
        StringBuilder strEncrypted = new StringBuilder();
        key = key % 26;
        for(int i = 0; i < str.length(); i++) {
            int newLetter = (str.charAt(i) + key);
            strEncrypted.append( newLetter <= 122 ? (char)newLetter : (char)(96 + newLetter % 122));
        }
        return strEncrypted.toString();
    }
}

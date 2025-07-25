package com.learn.algoexpert.codinginterviewquestions.easy;

public class MiddleNode {

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList solution(LinkedList linkedList) {
        LinkedList middleNode = linkedList;
        int counter = 1;
        while (linkedList.next != null) {
            counter++;
            if(counter == 2) {
                middleNode = middleNode.next;
                counter = 0;
            }
            linkedList = linkedList.next;
        }
        return middleNode;
    }
}

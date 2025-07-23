package com.learn.algoexpert.codinginterviewquestions.easy;

public class RemoveDuplicatesFromLinkedList {

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList solution(LinkedList linkedList) {
        LinkedList previousNode = linkedList;
        LinkedList currentNode = linkedList.next;
        while (currentNode != null) {
            if(previousNode.value == currentNode.value) {
                currentNode = currentNode.next;
            } else {
                previousNode.next = currentNode;
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        previousNode.next = null;
        return linkedList;
    }
}

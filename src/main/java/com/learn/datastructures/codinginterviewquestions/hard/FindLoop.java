package com.learn.datastructures.codinginterviewquestions.hard;

public class FindLoop {
    public static LinkedList solution(LinkedList head) {
        LinkedList singlePointer = head.next;
        LinkedList doublePointer = head.next.next;
        while (singlePointer != doublePointer) {
            singlePointer = singlePointer.next;
            doublePointer = doublePointer.next.next;
        }
        singlePointer = head;
        while (singlePointer != doublePointer) {
            singlePointer = singlePointer.next;
            doublePointer = doublePointer.next;
        }
        return singlePointer;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}


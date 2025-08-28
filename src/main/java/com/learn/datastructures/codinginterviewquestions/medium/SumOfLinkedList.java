package com.learn.datastructures.codinginterviewquestions.medium;

public class SumOfLinkedList {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList sumOfLinkedLists(
            LinkedList linkedListOne, LinkedList linkedListTwo
    ) {
        int sum;
        int digit;
        int carry = 0;
        LinkedList result = null;
        LinkedList head = null;
        while (linkedListOne != null && linkedListTwo != null) {
            sum = linkedListOne.value + linkedListTwo.value + carry;
            digit = sum % 10;
            carry = sum / 10;
            if (result == null) {
                result = new LinkedList(digit);
                head = result;
            } else {
                result.next = new LinkedList(digit);
                result = result.next;
            }
            linkedListOne = linkedListOne.next;
            linkedListTwo = linkedListTwo.next;
        }
        LinkedList node = linkedListOne == null ? linkedListTwo : linkedListOne;
        while (node != null) {
            sum = node.value + carry;
            digit = sum % 10;
            carry = sum / 10;
            result.next = new LinkedList(digit);
            result = result.next;
            node = node.next;
        }
        if (carry != 0) {
            result.next = new LinkedList(carry);
        }
        return head;
    }
}

package com.training;

public class LinkedListNode {
    public int data;
    public LinkedListNode next;

    LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public int findLength() {
        int length = 0;
        LinkedListNode current = this;
        while(current != null) {
            length++;
            current = current.next;
        }

        return length;
    }

    @Override
    public String toString() {
        return "[Data for this is " + data + "]" + next;
    }
}

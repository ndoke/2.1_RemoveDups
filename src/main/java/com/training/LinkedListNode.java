package com.training;

/**
 * {@link LinkedListNode} has basic methods for a LinkedListNodeLinked list.
 *
 * {@link LinkedListNode#findLength()} returns length of the Linked list.
 *
 * @author Nachiket Doke
 * @since 1.0
 */
public class LinkedListNode {
    public int data;
    public LinkedListNode next;

    LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }

    /**
     * Returns length of a linked list
     *
     * @return length of the linked list
     */
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

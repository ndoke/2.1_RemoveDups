package com.training;

/**
 * {@link DeleteMiddleNode} has a methods to delete middle element of
 * a linked list.
 *
 * {@link DeleteMiddleNode#deleteNode(LinkedListNode)} deletes the given
 * node from the list.
 *
 * @author Nachiket Doke
 * @since 1.0
 */
public class DeleteMiddleNode {
    /**
     * Returns a k to last element of a linked list using another
     * list, in an iterative way
     *
     * @param n LinkedListNode which is to be deleted
     */
    public void deleteNode(LinkedListNode n) {
        // base case
        if (n == null || n.next == null) {
            return;
        }

        n.data = n.next.data;
        n.next = n.next.next;
    }
}

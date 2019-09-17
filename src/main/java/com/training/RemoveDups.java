package com.training;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link RemoveDups} has a methods to remove duplicate elements from a
 * Linked list.
 * {@link RemoveDups#removeDuplicateNodesWithSet(LinkedListNode)} returns
 * a list with no duplicate elements using a set.
 * {@link RemoveDups#removeDuplicateNodesTwoLists(LinkedListNode)} returns
 * a list with no duplicate elements using two lists.
 *
 * @author Nachiket Doke
 * @since 1.0
 */
public class RemoveDups {
    /**
     * Returns a LinkedListNode with no duplicates using a hash set
     *
     * @param node LinkedListNode from which duplicates are to be
     * deleted
     * @return node with no duplicate elements
     */
    public LinkedListNode removeDuplicateNodesWithSet(LinkedListNode node) {
        Set<Integer> elems = new HashSet<>();
        LinkedListNode previous = null;
        LinkedListNode current = node;
        while(current != null) {
            if (elems.contains(current.data)) {
                previous.next = current.next;
            } else {
                elems.add(current.data);
                previous = current;
            }
            current = current.next;
        }

        return node;
    }

    /**
     * Returns a LinkedListNode with no duplicates using two lists
     *
     * @param node LinkedListNode from which duplicates are to be
     * deleted
     * @return node with no duplicate elements
     */
    public LinkedListNode removeDuplicateNodesTwoLists(LinkedListNode node) {
        LinkedListNode current = node;
        while (current != null) {
            LinkedListNode runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
        return node;
    }
}

package com.training;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveDupsTest {
    RemoveDups removeDups = new RemoveDups();
    private LinkedListNode node;

    @BeforeMethod
    public void setUp() {
        node = new LinkedListNode(10);
        initializeNode(node);
    }

    private void initializeNode(LinkedListNode node) {
        LinkedListNode prev = node;
        for (int i = 9; i >= 0; i--) {
            LinkedListNode curr = new LinkedListNode(i);
            if (i == 3 || i == 4 || i == 6) {
                prev.next = new LinkedListNode(i);
                prev = prev.next;
            }
            prev.next = curr;
            prev = prev.next;
        }
    }

    @Test
    public void setTest() {
        int length = node.findLength();
        removeDups.removeDuplicateNodesWithSet(node);
        int newLength = node.findLength();
        Assert.assertEquals(length - newLength, 3);
    }

    @Test
    public void twoListsTest() {
        int length = node.findLength();
        removeDups.removeDuplicateNodesTwoLists(node);
        int newLength = node.findLength();
        Assert.assertEquals(length - newLength, 3);
    }
}

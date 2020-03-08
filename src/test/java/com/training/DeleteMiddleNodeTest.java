package com.training;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteMiddleNodeTest {
    private LinkedListNode node;
    private LinkedListNode deleteNode;

    @BeforeClass
    public void setUp() {
        node = new LinkedListNode(10);
        initializeNode(node);
    }

    private void initializeNode(LinkedListNode node) {
        LinkedListNode prev = node;
        for (int i = 9; i >= 1; i--) {
            LinkedListNode curr = new LinkedListNode(i);
            prev.next = curr;
            prev = prev.next;
            if (i == 3) {
                deleteNode = curr;
            }
        }
    }

    @Test
    public void deleteNode() {
        DeleteMiddleNode deleteMiddleNode = new DeleteMiddleNode();
        Assert.assertEquals(node.findLength(), 10);
        deleteMiddleNode.deleteNode(deleteNode);
        Assert.assertEquals(node.findLength(), 9);
    }
}

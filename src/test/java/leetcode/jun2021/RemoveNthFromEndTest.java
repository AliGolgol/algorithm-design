package leetcode.jun2021;

import leetcode.jun2021.ListNode;
import leetcode.jun2021.RemoveNthFromEnd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveNthFromEndTest {

    RemoveNthFromEnd removeNthFromEnd;

    @BeforeEach
    public void setup(){
        removeNthFromEnd = new RemoveNthFromEnd();
    }

    @Test
    public void should_LinkedListTraversal_returnRemovalOfNthElementFromTheEnd(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = null;

        ListNode accept = removeNthFromEnd.accept(head, 2);


    }
}
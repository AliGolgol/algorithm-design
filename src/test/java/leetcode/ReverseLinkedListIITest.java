package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListIITest {
    ReverseLinkedListII reverseLinkedListII;

    @BeforeEach
    public void setup(){
        reverseLinkedListII = new ReverseLinkedListII();
    }

    @Test
    public void should_return_reverse_linked_list(){
        ReverseLinkedListII.ListNode head = new ReverseLinkedListII.ListNode(1);
        head.next = new ReverseLinkedListII.ListNode(2);
        head.next.next = new ReverseLinkedListII.ListNode(3);
        head.next.next.next = new ReverseLinkedListII.ListNode(4);
        head.next.next.next = new ReverseLinkedListII.ListNode(5);

        ReverseLinkedListII.ListNode result = reverseLinkedListII.reverseBetween(head, 2, 4);

        ReverseLinkedListII.ListNode expected = new ReverseLinkedListII.ListNode(1);
        expected.next = new ReverseLinkedListII.ListNode(4);
        expected.next.next = new ReverseLinkedListII.ListNode(3);
        expected.next.next.next = new ReverseLinkedListII.ListNode(2);
        expected.next.next.next = new ReverseLinkedListII.ListNode(5);

        assertEquals(expected,result);

    }

}
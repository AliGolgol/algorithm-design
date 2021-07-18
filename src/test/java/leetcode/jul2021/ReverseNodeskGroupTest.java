package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNodeskGroupTest {
    ReverseNodeskGroup reverseNodeskGroup;

    @BeforeEach
    public void setup(){
        reverseNodeskGroup = new ReverseNodeskGroup();
    }

    @Test
    public void should_return_its_modified_list(){
        int k = 2;
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = reverseNodeskGroup.accept(head,k);

        ListNode expected = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(5);

        assertEquals(expected, result);
    }

}
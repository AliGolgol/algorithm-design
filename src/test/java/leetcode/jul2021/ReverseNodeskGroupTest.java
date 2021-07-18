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
        ReverseNodeskGroup.ListNode head = new ReverseNodeskGroup.ListNode(1);
        head.next = new ReverseNodeskGroup.ListNode(2);
        head.next.next = new ReverseNodeskGroup.ListNode(3);
        head.next.next.next = new ReverseNodeskGroup.ListNode(4);
        head.next.next.next.next = new ReverseNodeskGroup.ListNode(5);
        ReverseNodeskGroup.ListNode result = reverseNodeskGroup.accept(head,k);

        ReverseNodeskGroup.ListNode expected = new ReverseNodeskGroup.ListNode(2);
        head.next = new ReverseNodeskGroup.ListNode(1);
        head.next.next = new ReverseNodeskGroup.ListNode(4);
        head.next.next.next = new ReverseNodeskGroup.ListNode(3);
        head.next.next.next.next = new ReverseNodeskGroup.ListNode(5);

        assertEquals(expected, result);
    }

}
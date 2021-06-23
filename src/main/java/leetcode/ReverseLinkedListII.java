package leetcode;

import java.util.Objects;

public class ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0, head);
        ListNode prv = dummy;
        for(int i = 0; i < left - 1; i++){
            prv = prv.next;
        }

        ListNode curr = prv.next;
        for(int i = 0; i < right - left; i++){
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = prv.next;
            prv.next = next;
        }

        return dummy.next;
    }

    public ReverseLinkedListII() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }
}

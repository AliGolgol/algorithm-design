package leetcode.jun2021;

import java.util.LinkedList;

public class JumpGameVI {
    public int maxResult(int[] nums, int k) {
        int[] scores = new int[nums.length];
        LinkedList<Integer> queue = new LinkedList<>();

        scores[0] = nums[0];
        queue.offer(0);

        for (int i = 1 ; i < nums.length ; i++) {
            if (queue.getFirst() < i - k) {
                queue.removeFirst();
            }
            scores[i] = scores[queue.getFirst()] + nums[i];

            while (!queue.isEmpty() && scores[queue.getLast()] <= scores[i]) {
                queue.removeLast();
            }
            queue.addLast(i);
        }

        return scores[nums.length - 1];
    }
}

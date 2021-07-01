package leetcode.jun2021;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int accept(int[] nums) {
        HashSet<Integer> setNum = new HashSet<>();
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            setNum.add(nums[i]);
        }

        for (int num : setNum) {
            if (!setNum.contains(num - 1)) {
                int currentNum = num;
                int counter = 1;

                while (setNum.contains(currentNum + 1)) {
                    currentNum++;
                    counter++;
                }

                ans = Math.max(ans, counter);
            }
        }

        return ans;
    }
}

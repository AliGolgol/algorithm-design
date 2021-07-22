package leetcode.jul2021;

public class PartitionArrayDisjointIntervals {
    public int partitionDisjoint(int[] nums) {
        int leftMax = nums[0];
        int max = nums[0];
        int index = 0;

        for(int i = 1; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            if(nums[i] < leftMax){
                leftMax = max;
                index = i;
            }
        }

        return index +1;
    }
}

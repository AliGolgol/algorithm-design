package leetcode;

public class ThreeSumWithMultiplicity {
    public int accept(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int max = 0;

        while(left < right){
            int k = left + 1;
            int sum = nums[left] + nums[k] + nums[right];
            if(sum == target){
                max = Math.max(max, nums[left] * nums[k] * nums[right]);
                left++;
                right--;
            }
            if(sum < target){
                left++;
            }
            if(sum > target){
                right--;
            }
        }

        return max;
    }
}

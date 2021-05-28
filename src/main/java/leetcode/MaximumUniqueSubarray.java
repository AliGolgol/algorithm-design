package leetcode;

public class MaximumUniqueSubarray {
    public int solution(int[] nums){
        int left =0, right = 0, length = nums.length, sum = 0;
        int[] map = new int[10001];
        int ans = 0;
        while (right < length) {
            map[nums[right]]++;
            sum += nums[right];
            right++;
            while (map[nums[right - 1]] >= 2) {
                map[nums[left]]--;
                sum -= nums[left];
                left++;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}

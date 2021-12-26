package leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        combine(nums,result, new ArrayList<>());
        return result;
    }

    private void combine(int[] nums, List<List<Integer>> result, List<Integer> currList){
        if(currList.size() == nums.length){
            result.add(new ArrayList<>(currList));
        }else{
            for(int i = 0; i <= nums.length - 1; i++){
                if(currList.contains(nums[i])) continue;

                currList.add(nums[i]);
                combine(nums, result, currList);
                currList.remove(currList.size() - 1);
            }
        }
    }
}

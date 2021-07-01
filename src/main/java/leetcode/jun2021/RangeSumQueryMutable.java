package leetcode.jun2021;

public class RangeSumQueryMutable {
    int[] btree;
    int[] arr;

    public RangeSumQueryMutable(int[] nums) {
        btree = new int[nums.length+1];
        arr = nums;

        for(int i=0; i<nums.length; i++){
            add(i+1, nums[i]);
        }
    }

    public void update(int index, int val) {
        add(index+1, val-arr[index]);
        arr[index]=val;
    }

    public int sumRange(int left, int right) {
        return sumHelper(right+1)-sumHelper(left);
    }

    void add(int i, int val) {
        for(int j=i; j<btree.length; j=j+(j&(-j)) ){
            btree[j] += val;
        }
    }

    int sumHelper(int i){
        int sum=0;
        for(int j=i; j>=1; j=j-(j&(-j))){
            sum += btree[j];
        }
        return sum;
    }

}

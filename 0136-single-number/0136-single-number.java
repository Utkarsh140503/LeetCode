class Solution {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for(int x=1;x<nums.length;x++){
            res = res^nums[x];
        }
        return res;
    }
}
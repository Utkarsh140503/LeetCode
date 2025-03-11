class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int x=2;x<nums.length;x++){
            dp[x] = Math.max(dp[x-1], dp[x-2]+nums[x]);
        }
        return dp[dp.length - 1];
    }
}
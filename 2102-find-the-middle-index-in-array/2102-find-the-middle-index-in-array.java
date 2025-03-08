class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for(int x=0;x<nums.length;x++){
            sum+=nums[x];
        }
        int s = 0;
        int ans=-1;
        for(int x=0;x<nums.length;x++){
            if(sum-(s+nums[x])==s){
                ans = x;
                break;
            }
            s+=nums[x];
        }
        return ans;
    }
}
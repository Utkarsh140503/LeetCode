class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        for(int x=0;x<nums.length;x++){
            for(int y=x+1;y<nums.length;y++){
                if(nums[x] == nums[y]){
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
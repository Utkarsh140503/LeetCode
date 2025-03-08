class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int x=0;x<nums.length;x++){
            total+=nums[x];
        }
        int suml = 0;
        for(int x=0;x<nums.length;x++){
            int sumr = total - suml - nums[x];
            if(sumr==suml){
                return x;
            }
            suml+=nums[x];
        }
        return -1;
    }
}
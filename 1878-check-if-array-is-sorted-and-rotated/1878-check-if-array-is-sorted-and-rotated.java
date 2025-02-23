class Solution {
    public boolean check(int[] nums) {
        int c=0;
        for(int x=0;x<nums.length-1;x++){
            if(nums[x+1]<nums[x]){
                    c++;
                }
        }
        // Also check the rotation by comparing the last and first elements
        if (nums[nums.length - 1] > nums[0]) {
            c++;
        }
        if(c<=1){
            return true;
        }else{
            return false;
        }
    }
}
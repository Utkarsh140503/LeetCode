class Solution {
    public boolean checkPossibility(int[] nums) {
        int c=0;
        if (isNonDecreasing(nums)) {
            return true;
        }
        for(int x=1;x<nums.length;x++){
            if(nums[x-1]>nums[x]){
                c++;
                if(c>1){
                    return false;
                }
                // Adjust previous element or current element to maintain non-decreasing order
                if (x - 2 < 0 || nums[x] >= nums[x - 2]) {
                    nums[x - 1] = nums[x];
                } else {
                    nums[x] = nums[x - 1];
                }
            }
        }
        return true;
    }
    public boolean isNonDecreasing(int[] n) {
        for (int i=0; i<n.length-1; i++) {
            if (n[i] > n[i+1]) {
                return false;
            }
        }
        return true;
    }
}

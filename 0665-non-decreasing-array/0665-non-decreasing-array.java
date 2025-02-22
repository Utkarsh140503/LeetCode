class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean poss = false;

        if (isNonDecreasing(nums)) {
            return true; // Already non-decreasing
        }

        for (int x = 0; x < nums.length; x++) {
            int original = nums[x]; 
            if (x > 0){
                nums[x] = nums[x-1];
            } 
            else nums[x] = 0; 

            if (isNonDecreasing(nums)) return true;

            // Restore original value
            nums[x] = original;
        }
        return false;
    }

    public boolean isNonDecreasing(int[] n) {
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] > n[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

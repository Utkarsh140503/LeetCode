class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0; // Count of modifications

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (count == 1) {
                    return false; // More than one modification required
                }
                count++;

                // Modify nums[i] or nums[i+1] to maintain order
                if (i == 0 || nums[i - 1] <= nums[i + 1]) {
                    nums[i] = nums[i + 1]; // Adjust current element
                } else {
                    nums[i + 1] = nums[i]; // Adjust next element
                }
            }
        }
        return true;
    }
}

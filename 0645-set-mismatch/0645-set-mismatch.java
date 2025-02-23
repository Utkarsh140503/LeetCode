import java.util.Arrays;

class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] ar = new int[2];
        int duplicate = -1, missing = -1;

        for (int x = 1; x < nums.length; x++) {
            if (nums[x] == nums[x - 1]) {
                duplicate = nums[x];
            } else if (nums[x] > nums[x - 1] + 1) {
                missing = nums[x - 1] + 1;
            }
        }

        // Check for missing number at the end
        if (missing == -1) {
            if (nums[0] != 1) {
                missing = 1;
            } else {
                missing = nums.length;
            }
        }

        ar[0] = duplicate;
        ar[1] = missing;
        return ar;
    }
}

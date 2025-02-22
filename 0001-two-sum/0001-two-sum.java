class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        for (int x = 0; x < nums.length; x++) {
            for (int y = x + 1; y < nums.length; y++) {
                if ((nums[x] + nums[y]) == target) {
                    res[0] = x;
                    res[1] = y;
                }
            }
        }
        return res;
    }
}
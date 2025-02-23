class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int x = 0; x < nums.length; x++) {
            int sum = 0;
            for (int y = x; y < nums.length; y++) {
                sum += nums[y];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}

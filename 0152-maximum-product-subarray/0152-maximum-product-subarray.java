class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int tempMax = currentMax;
            currentMax = Math.max(nums[i], Math.max(currentMax * nums[i], currentMin * nums[i]));
            currentMin = Math.min(nums[i], Math.min(tempMax * nums[i], currentMin * nums[i]));

            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }
}

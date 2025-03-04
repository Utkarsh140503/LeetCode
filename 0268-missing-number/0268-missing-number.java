class Solution {
    public int missingNumber(int[] nums) {
        int arr[] = new int[nums.length];
        Arrays.sort(nums);
        for(int x=0;x<arr.length;x++){
            if(x!=nums[x]){
                return x;
            }
        }
        return nums.length;
    }
}
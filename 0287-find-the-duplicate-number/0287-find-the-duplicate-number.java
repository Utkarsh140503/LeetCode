class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int x=0;x<nums.length;x++){
            if(h.containsKey(nums[x])){
                return nums[x];
            }else{
                h.put(nums[x], 1);
            }
        }
        return 0;
    }
}
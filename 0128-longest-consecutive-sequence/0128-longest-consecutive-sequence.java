class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int c=1, longest=1;
        for(int x=0;x<nums.length-1;x++){
            if(nums[x]!=nums[x+1]){
                if(nums[x]+1 == nums[x+1]){
                    c++;
                }else{
                    longest=Math.max(c, longest);
                    c=1;
                }
            }
        }
        return Math.max(longest, c);
    }
}
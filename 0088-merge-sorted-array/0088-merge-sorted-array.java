class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m+n];
        for(int x=0;x<nums1.length;x++){
            if(nums1[x]!=0){
                arr[x] = nums1[x];
            }
        }
        int f=m;

        for(int y=0;y<nums2.length;y++){
            if(nums2[y]!=0){
                nums1[f] = nums2[y];
                f++;
            }
        }

        Arrays.sort(nums1);
    }
}
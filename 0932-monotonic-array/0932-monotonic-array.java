class Solution {
    public boolean isMonotonic(int[] nums) {
        return isArrayAsc(nums)||isArrayDes(nums);
    }
    private static boolean isArrayAsc(int[] arr) {
    int n = arr.length;
    for(int i=0; i<n-1; i++) {
      if(arr[i]>arr[i+1]) {
        return false;
      }
    }
    return true;
  }

  private static boolean isArrayDes(int[] arr) {
    int n = arr.length;
    for(int i=0; i<n-1; i++) {
      if(arr[i]<arr[i+1]) {
        return false;
      }
    }
    return true;
  }
}
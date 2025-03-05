class Solution {
    public long coloredCells(int n) {
        long ans = 1;
        if(n==1){
            return ans;
        }
        for(int x=2;x<=n;x++){
            ans+=((x-1)*4);
        }
        return ans;
    }
}
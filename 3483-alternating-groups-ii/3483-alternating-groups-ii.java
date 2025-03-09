class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int w=1, ans=0;
        for(int x=1;x<=colors.length+k-2;x++){
            if(colors[x%colors.length]!=colors[(x-1)%colors.length]){
                w++;
            }else{
                w=1;
            }
            if(w>=k){
                ans++;
            }
        }
        return ans;
    }
}
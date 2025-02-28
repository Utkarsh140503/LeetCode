class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int c=0;
        for(int x=0;x<tickets.length;x++){
            if(x<=k){
                c+=Math.min(tickets[x], tickets[k]);
            }else{
                c+=Math.min(tickets[x], tickets[k]-1);
            }
        }
        return c;
    }
}
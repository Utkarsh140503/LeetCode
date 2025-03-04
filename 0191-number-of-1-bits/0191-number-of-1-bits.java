class Solution {
    public int hammingWeight(int n) {
        String binary = "";
        while(n!=0){
            binary=(n%2)+binary;
            n/=2;
        }
        int c=0;
        for(int x=0;x<binary.length();x++){
            if(binary.charAt(x)=='1'){
                c++;
            }
        }
        return c;
    }
}
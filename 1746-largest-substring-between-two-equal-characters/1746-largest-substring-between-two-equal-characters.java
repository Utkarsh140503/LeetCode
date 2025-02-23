class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int l=-1;
        for(int x=0;x<s.length();x++){
            char ch = s.charAt(x);
            for(int y=x+1; y<s.length();y++){
                if(ch==s.charAt(y)){
                    l=Math.max(l, y-x-1);
                }
            }
        }
        return l;
    }
}
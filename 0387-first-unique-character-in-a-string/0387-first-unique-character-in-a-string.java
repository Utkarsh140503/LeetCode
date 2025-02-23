class Solution {
    public int firstUniqChar(String s) {
        for(int x=0;x<s.length();x++){
            boolean flag=true;
            for(int y=0;y<s.length();y++){
                if(x!=y && s.charAt(x)==s.charAt(y)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                return x;
            }
        }
        return -1;
    }
}
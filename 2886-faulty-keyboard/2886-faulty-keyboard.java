class Solution {
    public String finalString(String s) {
        String ans="";
        for(int x=0;x<s.length();x++){
            if(s.charAt(x)!='i'){
                ans+=s.charAt(x);
            }
            else{
                ans=revStr(ans);
            }
        }
        return ans;
    }
    public String revStr(String st){
        String rev = "";
        for(int x=st.length()-1;x>=0;x--){
            rev+=st.charAt(x);
        }
        return rev;
    }
}
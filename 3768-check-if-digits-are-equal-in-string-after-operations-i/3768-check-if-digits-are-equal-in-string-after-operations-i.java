class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()!=2){
            int x=0, y=s.length()-1;
            String num = "";
            for(int a=0;a<s.length()-1;a++){
                int c1 = s.charAt(a)-'0';
                int c2 = s.charAt(a+1)-'0';
                int sum = (c1+c2)%10;
                num+=sum;
            }    
            s="";
            s=num;
        }
        System.out.println(s);
        if(s.charAt(0)==s.charAt(1)){
            return true;
        }else{
            return false;
        }
    }
}
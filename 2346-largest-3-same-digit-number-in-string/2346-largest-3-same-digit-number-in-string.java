class Solution {
    public String largestGoodInteger(String num) {
        int numb=0;
        String res = "";
        for(int x=0;x<num.length()-2;x++){
            String str = num.substring(x,x+3);
            int s = Integer.parseInt(str);
            if(s>=numb && str.charAt(1)==str.charAt(0) && str.charAt(1)==str.charAt(2)){
                res = str;
                numb=s;
                System.out.println(numb);
            }
        }
        return res;
    }
}
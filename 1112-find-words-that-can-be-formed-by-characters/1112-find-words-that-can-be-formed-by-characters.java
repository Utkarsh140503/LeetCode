class Solution {
    public int countCharacters(String[] words, String chars) {
        
        int c=0;
        
        for(int x=0;x<words.length;x++){
            String s = "";
            HashMap<Character, Integer> h = new HashMap<>();
            for(int z=0;z<chars.length();z++){
                if(h.containsKey(chars.charAt(z))){
                    h.put(chars.charAt(z), h.get(chars.charAt(z))+1);
                }else{
                    h.put(chars.charAt(z), 1);
                }
            }
            for(int y=0;y<words[x].length();y++){
                if(h.containsKey(words[x].charAt(y)) && h.get(words[x].charAt(y))>=1){
                    s+=words[x].charAt(y);
                    h.put(words[x].charAt(y), h.get(words[x].charAt(y))-1);
                }
            }
            System.out.println(s);
            if(s.length()==words[x].length()){
                c+=s.length();
            }
        
        }
        return c;
    }
}
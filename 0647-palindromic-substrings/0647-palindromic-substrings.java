class Solution {
    public int countSubstrings(String s) {
        int c = 0;
        for (int x = 0; x < s.length(); x++) {
            for (int y = x; y < s.length(); y++) {
                String subs = s.substring(x, y + 1);
                if (isPalin(subs)) {
                    c++;
                }
            }
        }
        return c;
    }

    public boolean isPalin(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }
}

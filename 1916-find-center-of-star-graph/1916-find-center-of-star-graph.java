import java.util.Arrays;

class Solution {
    public int findCenter(int[][] edges) {
        if (edges.length == 0 && edges.length == 1) {
            return 1;
        }
        int[] count = new int[edges.length + 2];
        for (int[] num : edges) {
            count[num[0]]++;
            count[num[1]]++;
        }
        for (int x = 1; x < count.length; x++) {
            if (count[x] == edges.length) {
                return x;
            }
        }
        return -1;
    }
}

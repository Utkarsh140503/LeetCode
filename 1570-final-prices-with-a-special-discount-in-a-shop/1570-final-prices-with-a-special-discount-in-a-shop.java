class Solution {
    public int[] finalPrices(int[] prices) {
        for (int x = 0; x < prices.length - 1; x++) {
            int num = findLargest(x + 1, prices.length, prices);
            if (num != -1) {
                prices[x] -= prices[num];
            }
        }
        return prices;
    }

    public int findLargest(int x, int n, int prices[]) {
        for (int y = x; y < n; y++) {
            if (prices[x - 1] >= prices[y]) {
                return y;
            }
        }
        return -1;
    }
}

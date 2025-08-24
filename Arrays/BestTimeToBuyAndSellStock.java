// Logic: Best Time to Buy & Sell Stock
// - Track minimum price so far (buy).
// - For each price: profit = price - minPrice.
// - Update maxProfit with this profit.
// - Update minPrice if current price is lower.
// - One pass solution → O(n).

public class BestTimeToBuyAndSellStock {
    // Logic: track min price so far; profit = price - min; keep max. One pass.
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, best = 0;
        for (int p : prices) {
            if (p > min) best = Math.max(best, p - min); // sell
            else min = p;                                // new buy
        }
        return best;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4})); // 5
    }
}
// Example: buy at 1, sell at 6; profit = 6-1 = 5
// Time: O(n); Space: O(1)

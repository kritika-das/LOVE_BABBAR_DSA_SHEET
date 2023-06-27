// 17
public class beststock {
    
        public int maxProfit(int[] prices) {
            int minPrice = prices[0];
            int maxProfit = 0;
    
            for (int i = 1; i < prices.length; i++) {
                int currentPrice = prices[i];
                int currentProfit = currentPrice - minPrice;
    
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
    
                if (currentPrice < minPrice) {
                    minPrice = currentPrice;
                }
            }
    
            return maxProfit;
        }
    
        public static void main(String[] args) {
            Solution solution = new Solution();
    
            int[] prices = {7, 1, 5, 3, 6, 4}; // Example input array
    
            int maxProfit = solution.maxProfit(prices);
    
            System.out.println("Maximum profit: " + maxProfit);
        }
    
}

import java.util.*;

class sharetwice {
    public static int maxProfit_recursion(int prices[], int n, int day, int canBuy, int cap) {
        if (day > n || cap == 0) return 0;

        if (canBuy == 1) {
            int notBuy = 0 + maxProfit_recursion(prices, n, day+1, 1, cap);
            int buy = -prices[day-1] + maxProfit_recursion(prices, n, day+1, 0, cap);
            return Math.max(buy, notBuy);
        } else {
            int notSell = 0 + maxProfit_recursion(prices, n, day+1, 0, cap);
            int sell = prices[day-1] + maxProfit_recursion(prices, n, day+1, 1, cap-1);
            return Math.max(sell, notSell);
        }
    }

    public static int maxProfit_tabulation(int prices[], int n) {
        int dp[][][] = new int[n+1][2][3];

        for (int day = n-1; day >= 0; day--) {
            for (int canBuy = 0; canBuy <= 1; canBuy++) {
                for (int cap = 1; cap <= 2; cap++) {
                    if (canBuy == 1) {
                        int notBuy = 0 + dp[day+1][1][cap];
                        int buy = -prices[day] + dp[day+1][0][cap];
                        dp[day][canBuy][cap] = Math.max(buy, notBuy);
                    } else {
                        int notSell = 0 + dp[day+1][0][cap];
                        int sell = prices[day] + dp[day+1][1][cap-1];
                        dp[day][canBuy][cap] = Math.max(sell, notSell);
                    }
                }
            }
        }

        return dp[0][1][2];
    }


    public static int maxProfit(int n, int[] price) {
        return maxProfit_tabulation(price, n);
    }
}

public class Main {
    public static void main(String[] args) {
        sharetwice obj = new sharetwice();

        int[] prices = {10, 22, 5, 75, 65, 80};
        int n = prices.length;

        int maxProfit = obj.maxProfit(n, prices);

        System.out.println("Maximum profit: " + maxProfit);
    }
}

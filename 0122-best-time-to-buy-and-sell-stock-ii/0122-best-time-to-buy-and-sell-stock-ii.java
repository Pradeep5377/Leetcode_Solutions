class Solution {
    public int maxProfit(int[] prices) {
        Integer[][] dp = new Integer[prices.length][2];
        return recursion(0, 1, prices, dp);
    }

    private int recursion(int index, int buy, int[] prices, Integer[][] dp){

        if(index == prices.length) return 0;

        if(dp[index][buy]!= null) return dp[index][buy];
        int profit = 0;
        if(buy==1){
            int buyHere = -prices[index] + recursion(index+1,0,prices,dp);
            int skipBuy = recursion(index+1, 1, prices,dp);
            profit += Math.max(buyHere, skipBuy);
        }
        else{
            int sellHere = prices[index] + recursion(index+1, 1, prices,dp);
            int skipSell = recursion(index+1, 0, prices,dp);
            profit += Math.max(sellHere, skipSell);
        }
        dp[index][buy] = profit;
        return profit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {

        Integer[][][] dp = new Integer[prices.length][2][3];
        return solve(0,1,prices,dp,2);
    }
    public int solve(int index, int buy, int[] prices, Integer[][][] dp, int count){
        if(index == prices.length || count == 0 ) return 0;
        int profit = 0;
        if(dp[index][buy][count]!=null ) return dp[index][buy][count];
        if(buy== 1){
            int buyHere = -prices[index] + solve(index+1, 0, prices, dp, count);
            int skipBuy= solve(index+1, 1, prices, dp, count);
            profit += Math.max(buyHere, skipBuy);
        }

        else{
            int sellHere = prices[index] + solve(index+1, 1, prices, dp, count-1);
            int skipSell = solve(index+1, 0 , prices, dp,count);
            profit+= Math.max(sellHere, skipSell);
        }
        dp[index][buy][count] = profit;
        return profit;
    }
}   
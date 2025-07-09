int maxProfit(int* prices, int pricesSize) {
    int profit = 0;
    int buy = INT_MAX;
    for(int i=0;i<pricesSize;i++){

        if(prices[i]< buy){
            buy = prices[i];
        }
        else{
            profit += prices[i] - buy;
            buy = prices[i];
        }
    }
    return profit;
}
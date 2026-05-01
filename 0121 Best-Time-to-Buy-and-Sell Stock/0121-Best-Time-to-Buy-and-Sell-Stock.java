class Solution {
    public int maxProfit(int[] prices) {
        int buy=0;
        int highProfit=0;
        for(int sell=1;sell<prices.length;sell++){
            if(prices[buy]<prices[sell]){
                int profit=prices[sell]-prices[buy];
                if(profit>highProfit){
                    highProfit=profit;
                }
            }else{
                buy=sell;
            }
        }
        return highProfit;
    }
}

// 121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int tmax = 0 , max = prices[prices.length-1], result = 0;
        for(int i = prices.length-2 ; i>=0 ; i--){
            if(prices[i]>max){
                max = prices[i];
            }else{
                tmax = max-prices[i];
                if(result<tmax){
                    result = tmax;
                }
            }
        }
        return result;
    }
}

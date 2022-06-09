class Solution {
    public int maxProfit(int[] prices) {
       
        int min = Integer.MAX_VALUE;
        int max = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i]<min){
                min = prices[i];// min price of stock
            }else{
                max = Math.max(max, prices[i] - min); //per day profit, update max
            }
        }
        return max;       
    }
}

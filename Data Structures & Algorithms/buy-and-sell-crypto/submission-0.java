class Solution {
    public int maxProfit(int[] prices) {

        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        int currentProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]< min){
                min=prices[i];
            } else {
                currentProfit=prices[i]-min;
                maxProfit=Math.max(maxProfit,currentProfit);
            }
        }
        return maxProfit;
        
    }
}

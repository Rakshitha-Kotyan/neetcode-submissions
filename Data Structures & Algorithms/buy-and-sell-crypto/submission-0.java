class Solution {
    public int maxProfit(int[] prices) {
        int maxPro=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            } else {
                maxPro=Math.max(maxPro,prices[i]-min);
            }
        }
        return maxPro;
    }
}

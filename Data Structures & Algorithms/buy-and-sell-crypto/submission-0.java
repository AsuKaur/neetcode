class Solution {
    public int maxProfit(int[] prices) {
        int low=prices[0];
        int p=0;
        for (int i=0;i<prices.length-1;i++){
            low=Math.min(low,prices[i]);
            for (int j=i+1;j<prices.length;j++){
                if(prices[j]>low){
                    p=Math.max(p,prices[j]-low);
                }
            }
        }
        return p;
    }
}

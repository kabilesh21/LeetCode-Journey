class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int sum=0;
        int low=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(low>prices[i]){
                low=prices[i];
            }
                
                sum=prices[i]-low;
                if(sum>max)
                {
                    max=sum;
                }
            
        }return max;
    }
}
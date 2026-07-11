class Solution {
    public int[] finalPrices(int[] prices) {
        int j=0;
        for(int i=0 ; i<prices.length-1 ; i++){
            j=i+1;
            if(prices[i]>=prices[j]){
                prices[i]=prices[i]-prices[j];
            }
            else{
                while(prices[i]<prices[j] && j<prices.length-1){
                    j++;
                }
                if(prices[i]>=prices[j]){
                   prices[i]=prices[i]-prices[j]; 
                }
                
            }
            
        }
        return prices;
    }
}
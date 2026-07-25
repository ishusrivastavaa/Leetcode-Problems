class Solution {
    public int maxProduct(int n) {
        int num=n;
        int max=0 , prevmax=0;
        while(num>0){
            int rem = num%10;
            if(rem>max){
                prevmax=max;
                max=rem;
            }
            else if(rem>prevmax){
                prevmax=rem;;
            }
            
            num=(num-rem)/10;
        }
        return max*prevmax;
    }
}
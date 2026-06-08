class Solution {
    public int subtractProductAndSum(int n) {
        int num = n;
        int prod=1,sum=0;
        while(num>0){
            int n2=num%10;
            num=(num-n2)/10;
            prod=prod*n2;
            sum=sum+n2;
        }   
        return prod-sum;
    }
}
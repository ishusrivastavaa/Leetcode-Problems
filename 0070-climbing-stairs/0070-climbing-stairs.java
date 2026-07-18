class Solution {
    int dp[] ;
    
    public int climbStairs(int n) {
       dp=new int[n+1];
       Arrays.fill(dp,-1);
       return func(0,n);
       
    }
    public int func(int i, int n){
        if(i==n)return 1;
        if(i>n)return 0;
        if(dp[i]>-1)return dp[i];
        int a1 = func(i+1 , n);
        int a2 = func(i+2 , n);
        dp[i]=a1+a2;
        return a1+a2;
    }
}
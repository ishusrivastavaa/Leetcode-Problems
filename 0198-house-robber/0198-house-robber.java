class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int free=2;
        int dp[][] = new int[n][free];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<free ; j++){
                dp[i][j]=-1;
            }
        }
        return houseRobber(nums,n,0,1,dp);
    }
    public int houseRobber(int nums[] , int n , int i ,int free, int dp[][]){
        if(i==n) return 0;
        if(dp[i][free]!=-1)return dp[i][free];
        if(free==0) return dp[i][free]=houseRobber(nums,n,i+1,1,dp);
        int c1 = nums[i]+houseRobber(nums,n,i+1,0,dp);
        int c2 = houseRobber(nums,n,i+1,1,dp);
        return dp[i][free]=Math.max(c1,c2);
    }
}
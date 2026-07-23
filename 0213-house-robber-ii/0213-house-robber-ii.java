class Solution {
    public int rob(int[] nums) {

        int n = nums.length;
        if(n==1)return nums[0];
        int free=2;
        int dp[][] = new int[n][free];
        int dp2[][] = new int[n][free];
        for(int i=0 ;i<n ; i++){
            for(int j=0 ; j<free ; j++){
                dp[i][j]=-1;
                dp2[i][j]=-1;
            }
        }
        int max1 =robbingHouse(n,nums,0,1,dp);
        int max2= robbingHouse1(n,nums,1,1,dp2);
        return Math.max(max1,max2);
    }
    public int robbingHouse(int n,int nums[] , int i, int free , int dp[][]){
        if(i==n-1) return 0;
        if(dp[i][free]!=-1)return dp[i][free];
        if(free==0) return dp[i][free]=robbingHouse(n , nums, i+1 ,1 , dp);

        int c1 = nums[i]+robbingHouse(n,nums,i+1,0,dp);
        int c2 = robbingHouse(n,nums,i+1,1,dp);
        return Math.max(c1,c2);
    }
    public int robbingHouse1(int n, int nums[],int i , int free , int dp2[][]){
        if(i == n )return 0;
        if(dp2[i][free]!=-1)return dp2[i][free];
        if(free==0) return dp2[i][free]=robbingHouse1(n,nums,i+1,1,dp2);

        int c1=nums[i]+robbingHouse1(n,nums,i+1 ,0,dp2);
        int c2 = robbingHouse1(n , nums,i+1,1,dp2);
        return Math.max(c1,c2);
    }
}
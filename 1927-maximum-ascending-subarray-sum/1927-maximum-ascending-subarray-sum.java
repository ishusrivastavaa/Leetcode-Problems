class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=nums[0];
        if(nums.length==1){
            return nums[0];
        }
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
            }
            else {
                max=Math.max(sum,max);
                sum=nums[i];
            }
        }
        max=Math.max(max,sum);
        return max;
    }
}


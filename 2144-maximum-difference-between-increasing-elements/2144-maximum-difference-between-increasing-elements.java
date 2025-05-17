class Solution {
    public int maximumDifference(int[] nums) {
        int maxdiff=-1;
        int diff=0;
        for(int i=0 ;  i<nums.length-1 ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[j]>nums[i] && j>i){
                    diff=nums[j]-nums[i];
                }
                else{
                    continue;
                }
                maxdiff=Math.max(diff , maxdiff);
            }
        }
        return maxdiff;
    
    }
}
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1;
        int max = 0;
        for(int i=0 ; i<nums.length-1 ; i++){
            if(nums[i+1]>nums[i]){
                count++;
            }
            else{
                max=Math.max(count,max);
                count=1;
            }
        }
        return Math.max(max,count);
    }
}
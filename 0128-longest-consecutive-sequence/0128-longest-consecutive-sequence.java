class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int max=1;
        int count=1;
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            else if (nums[i-1]+1==nums[i]){
                count++;
            }
            else{
                max = Math.max(max , count);
                count=1;
            }
            
        }
        return Math.max(max , count);
    }
}
class Solution {
    public int maxProductDifference(int[] nums) {
        
        Arrays.sort(nums);
        int min=nums[0];
        int sec_min=nums[1];
        int max=nums[nums.length-1];
        int sec_max=nums[nums.length-2];

        int output=(max*sec_max)-(sec_min*min);
        return output;
    }
}
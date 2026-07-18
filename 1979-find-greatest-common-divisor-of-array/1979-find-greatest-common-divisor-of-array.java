class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int min = nums[0];
        int rem = Integer.MAX_VALUE;
        while(rem!=0){
            rem = max%min;
            max=min;
            min=rem;
        }
        return max;

    }
    
}
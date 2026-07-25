class Solution {
    public int minElement(int[] nums) {
        for(int i=0 ; i<nums.length ; i++){
            nums[i]=digitSum(nums[i]);
        }
        Arrays.sort(nums);
        return nums[0];
    }
    public static int digitSum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=(n-rem)/10;
        }
        return sum;
    }
}
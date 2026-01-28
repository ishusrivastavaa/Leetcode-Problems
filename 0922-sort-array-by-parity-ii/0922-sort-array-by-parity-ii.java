class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even=0;  // for even
        int odd=1;  // for odd

        while(odd<nums.length && even < nums.length){
            if(nums[even]%2==0 && even<nums.length){
               even+=2;
            }
            else if(nums[odd]%2!=0 && odd<nums.length){
                odd+=2;
            }
            else{
                int temp=nums[even];
                nums[even] = nums[odd];
                nums[odd]=temp;
                odd+=2;
                even+=2;
            }
        }
        return nums;
    }
}
class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int arr[]=new int[2];
       
        int count=0;
        for(int i=0 ; i<nums.length-1; i++){
            if(nums[i]!=nums[i+1] && count==0){
                arr[0]=nums[i];
                count++;
                
                
            }
            else if(nums[i]!=nums[i+1]){
                arr[1]=nums[i];
                break;
            }
    
            else{
                i++;
            }
        }
        if(nums[nums.length-2] !=nums[nums.length-1]){
            arr[1]=nums[nums.length-1];
        }
        return arr;
    }
}
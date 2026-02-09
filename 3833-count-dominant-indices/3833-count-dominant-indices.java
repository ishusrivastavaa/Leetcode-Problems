class Solution {
    public int dominantIndices(int[] nums) {
        int arr[] = new int[nums.length];
        arr[arr.length-1]=nums[nums.length-1];
        for(int i=nums.length-2 ; i>=0 ; i--){
            arr[i]=nums[i]+arr[i+1];
        }
        int res[] = new int[nums.length-1];
        int j=0;
        for(int i=1; i<nums.length ; i++){
            res[j++]=arr[i];
        }
        int count = res.length;
        int out=0;
        for(int i=0 ; i<res.length ; i++){
            if(nums[i]>(res[i]/count)){
                out++;
            }
            count--;
        }
        return out;
    }
}
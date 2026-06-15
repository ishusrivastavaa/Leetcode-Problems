class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum=0;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0 ; i<k ;i++){
            sum+=nums[i];
        }
       
        
        double maxAvg =sum/k;
        int j=k;
        int i=1;
        while(j<nums.length){
            sum=sum-nums[i-1]+nums[j];
            
            maxAvg = Math.max(maxAvg,sum/k);
            j++;
            i++;
        }
        return (double)maxAvg;

    }
}
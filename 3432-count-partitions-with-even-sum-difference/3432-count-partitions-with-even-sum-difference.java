class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        int j=0;
        
        while(j != nums.length-1){
            
            int val1=0;
            int val2=0;
            for(int i=j+1 ; i<nums.length ; i++){
                val2+=nums[i];
            }
            for(int i=0 ; i<=j ;i++){
                val1+=nums[i];
            }
            if((val1-val2) % 2==0){
                count++;
            }
            j++;
            
            
        }
        return count;
        
    }
}



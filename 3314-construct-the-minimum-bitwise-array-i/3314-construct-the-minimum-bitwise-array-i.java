class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        for(int i=0 ; i<nums.size() ; i++){
            
            int j=0;
            int var =nums.get(i);
            nums.set(i,-1);
            while(j<var){
                if((j | (j+1)) == var){
                    nums.set(i,j);
                    break;
                }
                j++;
            }
            
        }
        int arr[] = new int[nums.size()];
        int i=0;
        for(int val:nums){
            arr[i++]=val;
        }
        return arr;
    }
}
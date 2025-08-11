class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        int num[]=new int[2];
        num[0]=-1;
        num[1]=-1;
        while(start<end){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                num[0]=start+1;
                num[1]=end+1;
                return num;
            }
            else if(sum<target){
                start++;
            }
            else{
               end--;
            }
        }
        return num;
    }
}

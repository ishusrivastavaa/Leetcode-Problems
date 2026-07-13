class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start=0;
        int sum=0;
        int count=0;
        for(int i=0 ; i<k ; i++){
            sum+=arr[i];
        }
        if(sum/k>=threshold){
            count++;
        }
        int left=1;
        for(int right=k ; right<arr.length ; right++){
            sum=sum-arr[left-1]+arr[right];
            int avg=sum/k;
            if(avg>=threshold){
                count++;
            }
            left++;
        }
        return count;
    }
}
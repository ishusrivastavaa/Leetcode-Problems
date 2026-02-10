class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int totallen=n1+n2;
        int res[]= new int [totallen];
        for(int i=0 ; i<n1 ; i++){
            res[i]=nums1[i];
        }
        int j=0;
        for(int i=n1 ; i<totallen ; i++){
            res[i]=nums2[j++];
        }
        Arrays.sort(res);
        
        if(totallen%2!=0){
            return (double)res[(totallen/2)];
        }
        else{
            return (double)(res[(totallen/2)]+res[(totallen/2)-1])/2;
        }
    }
}
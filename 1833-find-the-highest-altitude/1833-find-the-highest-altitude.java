import java.util.*;
class Solution {
    public int largestAltitude(int[] gain) {
        int arr[]=new int [gain.length];
        int sum=0;
        int min=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            arr[i]=sum;
            if(arr[i]>min){
                min=arr[i];
            }
        }
      return min;
    }
}
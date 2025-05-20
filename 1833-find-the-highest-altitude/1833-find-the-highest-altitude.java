import java.util.*;
class Solution {
    public int largestAltitude(int[] gain) {
        int altitude[]=new int[gain.length+1];
        altitude[0]=0;
        int j=0;
        for(int i=1 ; i<altitude.length ; i++){
            altitude[i]=altitude[j]+gain[j];
            j++;
        }
        int max=0;
         for(int i=0 ; i<altitude.length ; i++){
            if(altitude[i]>max){
                max=altitude[i];
            }
        }
        return max;
    }
}
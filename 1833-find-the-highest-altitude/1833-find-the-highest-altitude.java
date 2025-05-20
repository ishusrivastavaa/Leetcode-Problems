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
        
        Arrays.sort(altitude);
        return altitude[altitude.length-1];
    }
}
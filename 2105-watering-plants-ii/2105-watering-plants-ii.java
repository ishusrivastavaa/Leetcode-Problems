class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int i=0;
        int j=plants.length-1;
        int refil=0;
        int capA=capacityA;
        int capB = capacityB;
        while(i<j){
            if(capacityA<plants[i]){
                refil++;
                capacityA=capA;
            }
            capacityA-=plants[i];
            if(capacityB<plants[j]){
                refil++;
                capacityB=capB;
            }
            capacityB-=plants[j];
            i++;
            j--;
            
        }
        if(i==j){
            if(Math.max(capacityA,capacityB)<plants[i]){
                refil++;
            }
        }
        return refil;

    }
}
class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        if(plants.length == 0) return 0;
        int steps = 0;
        int cap = capacity;
        for(int i = 0 ; i < plants.length; i++){
            if(plants[i] <= capacity){
                capacity = capacity - plants[i];
                steps =steps + 1;
            }else if(capacity < plants[i]){
                steps = steps + (i)*2+1 ;
                capacity = cap;
                capacity = capacity -plants[i];
            }
        }
        return steps;
        // for(int i=0;i<plants.length;i++){
        //     if(plants[i]>capacity){
        //         steps+=i;
        //         steps+=i+1;
        //         capacity=cap;
        //     }
        //         steps++;
        //     capacity-=plants[i];
        //     if(i!=plants.length-1 && capacity==0){
        //         steps+=i+1;
        //         capacity=cap;
        //     }
        // }
        // return steps;
    }
}
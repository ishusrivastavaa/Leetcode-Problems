class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps=0;
        int cap=capacity;
        for(int i=0 ; i<plants.length ; i++){
            if(capacity<plants[i]){
                steps=steps+i+i;
                capacity=cap;
            }
            capacity=capacity-plants[i];
            steps++;
        }
        return steps;
    }
}
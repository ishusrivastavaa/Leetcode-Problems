class Solution {
    public int distributeCandies(int[] arr) {
        
        Set <Integer> set = new HashSet<>();
        for(int i=0 ;  i<arr.length ; i++){
            set.add(arr[i]);
        }
        return Math.min(arr.length/2,set.size());
    }
}
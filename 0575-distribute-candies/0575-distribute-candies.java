class Solution {
    public int distributeCandies(int[] arr) {
        int tar = arr.length/2;
        Set <Integer> set = new HashSet<>();
        for(int i=0 ;  i<arr.length ; i++){
            set.add(arr[i]);
        }
        return Math.min(tar,set.size());
    }
}
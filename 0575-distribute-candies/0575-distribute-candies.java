class Solution {
    public int distributeCandies(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
		for(int i=0 ; i<arr.length-1 ; i++){
		    if(arr[i]!=arr[i+1]){
		        list.add(arr[i]);
		    }
		}
		// if(arr[arr.length-1]!=arr[arr.length-2]){
		    list.add(arr[arr.length-1]);
		// }
		int candyCount = arr.length/2;
		int eatingCandy = list.size();
		return(Math.min(candyCount,eatingCandy));
    }
}
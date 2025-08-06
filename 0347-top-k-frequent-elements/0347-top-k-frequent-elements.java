class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            int num=nums[i];
            if(map.containsKey(num)){

                map.put(num , map.get(num)+1);
            }
            else{
                map.put(num , 1);
            }
        }
        int arr[]=new int [k];
        int max=Integer.MIN_VALUE;

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            max=Math.max(max, e.getValue());
        }
        int j=0;
        while(k!=0){
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()==max){
                arr[j]=e.getKey();
                j++;
                k--;
            }
        }
        max--;
        }
        return arr;
    
    }
}




class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int max=0;
        int arr[]= new int[k];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
            max=Math.max(max,map.get(nums[i]));
        }
        while(k!=0){
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==max){
                arr[idx++]=e.getKey();
                k--;
            }
        }
            max--;
        
            
        }
        
        return arr;
        
    }
}
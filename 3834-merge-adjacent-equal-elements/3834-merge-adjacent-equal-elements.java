class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        ArrayList <Long> list = new ArrayList<>();
        for(int i=0 ; i<nums.length; i++){
            list.add((long)nums[i]);
        }
        for(int i=0 ; i<list.size()-1 ; i++){
            
            if(i>=0 && list.get(i).equals(list.get(i+1))){
                long sum = list.get(i)+list.get(i+1);
                list.set(i , sum);
                list.remove(i+1);
                i=i-2;
            }
         }
        return list;
    }
}
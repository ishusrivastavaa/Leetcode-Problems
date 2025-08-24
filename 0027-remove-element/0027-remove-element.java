class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]==val){
                continue;
            }
            else{
                list.add(nums[i]);
            }
        }
        int size=list.size();
        for(int i=0 ; i<list.size() ; i++){
            nums[i]=list.get(i);
        }
        return list.size();
    }
}
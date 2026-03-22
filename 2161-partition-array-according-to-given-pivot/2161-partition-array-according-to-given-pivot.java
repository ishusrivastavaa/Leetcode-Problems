class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0  ; i<nums.length ; i++){
            if(nums[i]<pivot){
                list.add(nums[i]);
            }
            else if(nums[i]>pivot){
                list1.add(nums[i]);
            }
        }
        int length = list.size()+list1.size();
        int diff = nums.length - length;
        int i=0;
        while(i!=list.size()){
            nums[i]= list.get(i);
            i++;
        }
        int j=0;
        while(diff!=0){
            nums[i]=pivot;
            i++;
            diff--;
        }
        while(j!=list1.size()){
            nums[i] = list1.get(j);
            i++;
            j++;
        }
        return nums;

        
    }
}
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        ArrayList<Long> list = new ArrayList<>();
        Stack<Long> stack = new Stack();
        for(int i =0 ; i<nums.length ; i++){
            if(!stack.isEmpty()&&stack.peek() == nums[i]){
                long num = nums[i];
                while(!stack.isEmpty() && num==stack.peek()){
                    num = stack.pop()+num;
                    
                }
                stack.push(num);
                 
            }
            else{
                stack.push((long)nums[i]);
            }
            
        }
        ArrayList<Long> list1 = new ArrayList<>();
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
       for(int i=list.size()-1 ;i>=0 ; i--){
        list1.add(list.get(i));
        
       }

        return list1;
    }
}
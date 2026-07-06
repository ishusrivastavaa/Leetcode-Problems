class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        int j=0;
        while(j!=nums.length){
            pq.offer(nums[j++]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        return pq.peek();
        
    }
}
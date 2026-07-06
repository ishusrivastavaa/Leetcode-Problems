class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        int j=0;
        while(j!=nums.length){
            pq.offer(nums[j++]);
        }
        while(k>1){
            pq.poll();
            k--;
        }
        return pq.peek();
        
    }
}
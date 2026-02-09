class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int[] suffix = new int[n];

        suffix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = nums[i] + suffix[i + 1];
        }

        int count = n - 1;
        int out = 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > (suffix[i + 1] * 1.0 / count)) {
                out++;
            }
            count--;
        }

        return out;
    }
}

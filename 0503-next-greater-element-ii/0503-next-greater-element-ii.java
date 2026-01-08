class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int nums1[] = new int[n * 2];
        int result[] = new int[n];

        // Copy original array
        for (int i = 0; i < n; i++) {
            nums1[i] = nums[i];
        }
        // Duplicate for circular behavior
        int j = n;
        for (int i = 0; i < n; i++) {
            nums1[j++] = nums[i];
        }

        // Initialize result with -1
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        // Find next greater
        for (int i = 0; i < n; i++) {
            int length = n * 2;
            int k = i;  // start from next index

            while (length > 0 && k < n * 2) {
                if (nums1[k] > nums[i]) {
                    result[i] = nums1[k];
                    break;
                }
                k++;
                length--;
            }
        }

        return result;
    }
}

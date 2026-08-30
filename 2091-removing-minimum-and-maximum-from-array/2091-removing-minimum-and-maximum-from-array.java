class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        
        // If there are 2 or fewer elements, we have to remove all of them.
        if (n <= 2) {
            return n;
        }

        int minIdx = 0;
        int maxIdx = 0;

        // Single pass to find the indices of the min and max elements
        for (int k = 1; k < n; k++) {
            if (nums[k] < nums[minIdx]) {
                minIdx = k;
            }
            if (nums[k] > nums[maxIdx]) {
                maxIdx = k;
            }
        }

        // Identify which index comes first and which comes second
        int i = Math.min(minIdx, maxIdx);
        int j = Math.max(minIdx, maxIdx);

        // Calculate the three possible strategies
        int frontOnly = j + 1;
        int backOnly = n - i;
        int bothEnds = (i + 1) + (n - j);

        // Return the minimum of the three strategies
        return Math.min(frontOnly, Math.min(backOnly, bothEnds));
    }
}
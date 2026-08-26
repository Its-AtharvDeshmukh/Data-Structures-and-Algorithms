import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        // Step 1: Sort the array so closest values sit next to each other
        Arrays.sort(nums);
        
        int maxSum = 0;
        
        // Step 2: Iterate through the array, jumping by 2
        // We only add the elements at even indices (the minimum of each pair)
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }
        
        return maxSum;
    }
}
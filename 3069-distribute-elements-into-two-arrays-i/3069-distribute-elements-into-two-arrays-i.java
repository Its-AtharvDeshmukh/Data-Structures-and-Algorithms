import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        
        // Step 1: First two operations
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        
        // Step 2: Distribute the remaining elements
        for (int i = 2; i < nums.length; i++) {
            int last1 = arr1.get(arr1.size() - 1);
            int last2 = arr2.get(arr2.size() - 1);
            
            if (last1 > last2) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }
        
        // Step 3: Concatenate arr1 and arr2 into the result array
        int[] result = new int[nums.length];
        int idx = 0;
        
        for (int val : arr1) {
            result[idx++] = val;
        }
        for (int val : arr2) {
            result[idx++] = val;
        }
        
        return result;
    }
}
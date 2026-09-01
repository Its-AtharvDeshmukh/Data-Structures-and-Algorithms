class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1; 

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous unique element we stored,
            // then it's a new unique element.
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i]; // Store this new unique element
                k++;               // Move to the next position for the next unique element
            }
        }
        return k; 
    }

}
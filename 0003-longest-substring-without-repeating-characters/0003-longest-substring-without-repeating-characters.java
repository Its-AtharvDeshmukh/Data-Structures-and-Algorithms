class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Array to store the last seen index of each ASCII character
        int[] charIndex = new int[128];
        
        // Initialize the array with -1 (meaning character hasn't been seen)
        java.util.Arrays.fill(charIndex, -1);
        
        int maxLength = 0;
        int left = 0;
        
        // Expand the window by moving the right pointer
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            
            // If the character is already inside our current window, 
            // jump the left pointer to the right of the previous duplicate
            if (charIndex[c] >= left) {
                left = charIndex[c] + 1;
            }
            
            // Update the last seen index of the current character
            charIndex[c] = right;
            
            // Calculate the max length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
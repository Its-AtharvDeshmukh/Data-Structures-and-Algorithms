class Solution {
    public boolean isPalindrome(int x) {
        // Convert the integer to a string
        String str = String.valueOf(x);
        
        int left = 0;
        int right = str.length() - 1;
        
        // Check characters from the outside in
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
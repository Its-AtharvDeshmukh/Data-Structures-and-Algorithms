class Solution {
    public boolean isPowerOfFour(int n) {
        // If n is 0 or negative, it can't be a power of 4
        if (n <= 0) {
            return false;
        }
        
        // Keep dividing by 4 as long as the remainder is 0
        while (n % 4 == 0) {
            n = n / 4;
        }
        
        // If we are left with exactly 1, it's a power of 4
        return n == 1;
    }
}
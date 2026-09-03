class Solution {
    public int numTrees(int n) {
        long ans = 1; // Use long to prevent integer overflow during multiplication
        
        for (int i = 0; i < n; i++) {
            // Iterative formula to find the next Catalan number
            ans = ans * 2 * (2 * i + 1) / (i + 2);
        }
        
        return (int) ans;
    }
}
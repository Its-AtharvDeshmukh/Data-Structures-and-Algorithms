import java.util.Arrays;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        
        // pair[i][0] will hold the score
        // pair[i][1] will hold the original index
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = score[i];
            pairs[i][1] = i;
        }
        
        // Sort the pairs in descending order based on the score
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);
        
        String[] result = new String[n];
        
        // Assign ranks based on sorted positions
        for (int i = 0; i < n; i++) {
            int originalIndex = pairs[i][1];
            
            if (i == 0) {
                result[originalIndex] = "Gold Medal";
            } else if (i == 1) {
                result[originalIndex] = "Silver Medal";
            } else if (i == 2) {
                result[originalIndex] = "Bronze Medal";
            } else {
                result[originalIndex] = String.valueOf(i + 1);
            }
        }
        
        return result;
    }
}
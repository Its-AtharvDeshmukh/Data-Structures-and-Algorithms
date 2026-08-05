
class Solution {
    public int maxArea(int[] height) {
        int max = 0;

        int start = 0; 
        int end = height.length - 1;

        while(start < end) {
            int heighta = Math.min(height[start], height[end]);
            int width = end - start;
            int cal = heighta * width;

            max = Math.max(cal, max);

            if(height[start] < height[end]) {
                start++;
            } else { end--; }
        }

        return max;
    }
}


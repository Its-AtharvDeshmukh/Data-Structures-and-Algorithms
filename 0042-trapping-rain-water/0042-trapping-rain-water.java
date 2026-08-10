class Solution {
    public int trap(int height[]) {
        int n = height.length;
        int leftmax[] = new int[height.length];
       
        leftmax[0] = height[0];
        for(int i = 1; i<n; i++)
        {
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }

        int right[] = new int[height.length];
        right[n-1] = height[n-1];
        for(int j=n-2;j>=0;j--)
        {
            right[j] = Math.max(right[j+1],height[j]);
        }

        int trapped = 0;
        for(int i=0 ; i<n; i++)
        {
            int water = Integer.min(leftmax[i],right[i]);
            trapped +=  water - height[i] ;
        }
        return trapped;
    }

}
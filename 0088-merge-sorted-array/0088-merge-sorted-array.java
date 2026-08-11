class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int temp[] = new int[m + n];

        int i = 0; // Nums1
        int j = 0; // Nums2
        int k = 0; // Temp

        while(i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                 temp[k] = nums1[i];
                 i++;
            } else {
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }

        // REaming Part -------------------------------
        while(i < m) {
            temp[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n) {
            temp[k] = nums2[j];
            j++;
            k++;
        }
        // ---------------------------------------------

        for (int idx = 0; idx < m + n; idx++) {
            nums1[idx] = temp[idx];
        }
    }
}
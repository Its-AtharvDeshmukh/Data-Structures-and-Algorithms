class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            set.add(num);
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}










// class Solution {
//     public List<Integer> findMissingElements(int[] nums) {
//         // 1. MUST do this before Arrays.sort(), otherwise a null array crashes the program
//         if (nums == null || nums.length == 0) {
//             return new ArrayList<>(); 
//         }
        
//         Arrays.sort(nums);
        
//         // 2. Added the missing () at the end
//         ArrayList<Integer> ar = new ArrayList<>();

//         int min = nums[0]; 
//         int max = nums[nums.length - 1];

//         for(int i = min; i <= max; i++) {
//             // 3. Replaced nums[i] != i
//             // Arrays.binarySearch returns a negative number if 'i' is NOT in the array
//             if(Arrays.binarySearch(nums, i) < 0) {
//                 ar.add(i);
//             }
//         }

//         return ar;
//     }
// }
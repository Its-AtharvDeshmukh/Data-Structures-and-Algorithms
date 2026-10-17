class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length - 1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i <= n; i++) {
            int current = target - nums[i];
            if(map.containsKey(current)) {
                return new int []  { 
                                       map.get(current),i
                                   };
            }
            map.put(nums[i] , i);
        }

        return new int [] {-1, -1};
    }
}
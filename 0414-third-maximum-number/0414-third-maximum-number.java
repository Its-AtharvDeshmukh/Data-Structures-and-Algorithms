class Solution {
    public int thirdMax(int[] nums) {
        long first_max = Long.MIN_VALUE;
        long second_max = Long.MIN_VALUE;
        long third_max = Long.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {

            long current = nums[i];
            // Skip duplicates
            if (current == first_max || current == second_max || current == third_max) continue;

            if(current > first_max) {
                third_max = second_max;
                second_max = first_max;
                first_max = current;
            } else if (current > second_max) {
                third_max = second_max;
                second_max = current;
            } else if (current > third_max) {
                third_max = current;
            }
        }
        if (third_max == Long.MIN_VALUE) {
            return (int)first_max;
        }
        
        return (int)third_max;
    }
}
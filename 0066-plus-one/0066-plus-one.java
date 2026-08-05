// Java creates a new integer array, it automatically fills all its slots with the default value of 0.

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // 1. Loop from the last digit to the first

        for (int i = n - 1; i >= 0; i--) {

            // 2. Increment the digit
            digits[i]++;

            // 3. If it's less than 10, there's no carry. We are done!
            if (digits[i] < 10) {
                return digits;
            }

            // 4. If it was 10, it becomes 0, and we "carry the one"
            //    by letting the loop continue to the next digit.
            digits[i] = 0;
        }

            // 5. If the loop finishes, all digits were 9s (like [9, 9]).
            //    We need a new, larger array like [1, 0, 0].
        int[] newResult = new int[n + 1];
        newResult[0] = 1;
        return newResult;
    }
}
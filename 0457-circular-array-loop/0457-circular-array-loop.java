class Solution {
public boolean circularArrayLoop(int[] nums) {
int n = nums.length;
if (n <= 1) return false;
for (int i = 0; i < n; i++) {
// Skip already processed elements or elements set to 0
if (nums[i] == 0) continue;
int slow = i;
int fast = i;
boolean isForward = nums[i] > 0;
while (true) {
// Move slow pointer by 1 step
slow = getNextIndex(nums, slow, isForward);
if (slow == -1) break;
// Move fast pointer by 1 step
fast = getNextIndex(nums, fast, isForward);
if (fast == -1) break;
// Move fast pointer by 2nd step
fast = getNextIndex(nums, fast, isForward);
if (fast == -1) break;
if (slow == fast) {
return true;
}
}
// Mark visited elements in this cycle attempt as 0 to avoid re-processing
int curr = i;
while (nums[curr] != 0 && (nums[curr] > 0) == isForward) {
int next = getNextIndex(nums, curr, isForward);
nums[curr] = 0;
if (next == -1) break;
curr = next;
}
}
return false;
}
private int getNextIndex(int[] nums, int curr, boolean isForward) {
boolean direction = nums[curr] > 0;
// Direction check: cycle must be single-direction (all positive or all negative)
if (direction != isForward) {
return -1;
}
int n = nums.length;
int next = (curr + nums[curr]) % n;
if (next < 0) {
next += n;
}
// Cycle length must be > 1 (a element pointing to itself is invalid)
if (next == curr) {
return -1;
}
return next;
}
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base Case 1: Both nodes are null -> structural match
        if (p == null && q == null) {
            return true;
        }

        // Base Case 2: One is null and the other is not -> structural mismatch
        if (p == null || q == null) {
            return false;
        }

        // Base Case 3: Values do not match
        if (p.val != q.val) {
            return false;
        }

        // Recursive Step: Check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
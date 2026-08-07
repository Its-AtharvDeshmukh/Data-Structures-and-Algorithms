class Solution {
    public int longestValidParentheses(String s) {
        int maxLen = 0;
        Stack<Integer> stack = new Stack<>();
        
        // Base for the first valid substring
        stack.push(-1); 
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                
                if (stack.isEmpty()) {
                    // This closing bracket is invalid, so it becomes the new base
                    stack.push(i);
                } else {
                    // Valid substring found
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        
        return maxLen;
    }
}
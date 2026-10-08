class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int opened = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                // If 'opened' is greater than 0, this is not the outermost '('
                if (opened > 0) {
                    result.append(c);
                }
                opened++;
            } else if (c == ')') {
                opened--;
                // If 'opened' is greater than 0 after decrementing, this is not the outermost ')'
                if (opened > 0) {
                    result.append(c);
                }
            }
        }
        
        return result.toString();
    }
}
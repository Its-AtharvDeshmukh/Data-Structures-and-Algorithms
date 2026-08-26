class Solution {
    public ListNode removeNodes(ListNode head) {
        // 1. Reverse the original list
        head = reverseList(head);
        
        // 2. Traverse and keep nodes that are >= the maximum seen so far
        ListNode current = head;
        int maxSoFar = current.val;
        
        while (current != null && current.next != null) {
            if (current.next.val < maxSoFar) {
                // Skip (remove) the next node
                current.next = current.next.next;
            } else {
                // Keep the node, update the max, and step forward
                maxSoFar = current.next.val;
                current = current.next;
            }
        }
        
        // 3. Reverse the modified list back to its original order
        return reverseList(head);
    }
    
    // Standard Linked List Reversal Helper
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        
        return prev;
    }
}
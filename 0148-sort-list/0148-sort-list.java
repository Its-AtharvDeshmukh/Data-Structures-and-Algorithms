/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        // Base case: if the list is empty or has only one node, it's already sorted.
        if (head == null || head.next == null) {
            return head;
        }
        
        // 1. Find the middle of the list
        ListNode mid = getMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        
        // 2. Sever the list into two halves (Crucial step to avoid infinite loops!)
        mid.next = null; 
        
        // 3. Recursively sort both halves
        left = sortList(left);
        right = sortList(right);
        
        // 4. Merge the sorted halves
        return merge(left, right);
    }
    
    // Helper method to find the middle node
    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next; // Start fast one step ahead to correctly split even-length lists
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    // Helper method to merge two sorted lists
    private ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        
        // Append any remaining nodes
        if (list1 != null) tail.next = list1;
        if (list2 != null) tail.next = list2;
        
        return dummy.next;
    }
}
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
class Solution 
{
    public ListNode find(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
              slow = slow.next;
              fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) 
    {
        // Stack<Integer> s = new Stack<>();

        // ListNode curr = head;

        // while(curr != null)
        // {
        //     s.push(curr.val);
        //     curr = curr.next;
        // }

        // curr = head;

        // while(curr != null)
        // {
        //     if(s.peek() != curr.val)
        //     {
        //         return false;
        //     }
        //     else
        //     {
        //         s.pop();
        //     }
        //     curr = curr.next;
        // }

        // return true;














        if(head == null || head.next == null)
        {
            return true;
        }

        ListNode mid = find(head);

        ListNode pre = null;
        ListNode curr = mid;
        ListNode next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        ListNode left = head;
        ListNode right = pre;

        while(right != null)
        {
             if(left.val != right.val)
            {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
}
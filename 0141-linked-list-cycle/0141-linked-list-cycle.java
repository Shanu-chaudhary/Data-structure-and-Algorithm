/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        int pos = 0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            
            fast = fast.next.next;
            slow = slow.next;
            pos++;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
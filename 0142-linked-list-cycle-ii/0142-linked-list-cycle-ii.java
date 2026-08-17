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
    public ListNode detectCycle(ListNode head) {
        // if(head == null || head.next == null){
        //     return null;
        // }
        ListNode fast = head;
        ListNode slow = head;
        // int idx = 0;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            // idx++;
            if(fast == slow){
                ListNode entry = head;
                while(entry != slow){
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry;
            }
        }
        return null;
    }
}
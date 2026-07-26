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
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode a, ListNode b) {
                return a.val - b.val;
            }
        });
        // PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for(ListNode head : lists){
            if(head != null){
                pq.offer(head); // sare list ke node ko insert kr diye kuuki list sorted hai
            }
        }
        ListNode dummy = new ListNode(-1); //dummy node creation, pehle se koi node nhi tha isliye
        ListNode tail = dummy; // traverse krke add karne me help krega isliye
        while(!pq.isEmpty()){
            ListNode smallest = pq.poll();  // from minHeap
            tail.next = smallest;
            tail = tail.next;
            if(smallest.next != null){
                pq.offer(smallest.next);
            }
        }
        return dummy.next;
    }
}
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
        ListNode dummy = new ListNode(0);
        ListNode head= dummy;
        PriorityQueue<Integer> pq = new PriorityQueue();

        for(int i=0;i<lists.length;i++){
            ListNode temp = lists[i];
            while(temp!=null){
                pq.add(temp.val);
                temp=temp.next;
            }
        }

        while(!pq.isEmpty()){
            head.next= new ListNode(pq.remove());
            head=head.next;
        }
        return dummy.next;


    }
}

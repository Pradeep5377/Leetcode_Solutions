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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0,null);
        ListNode next = dummy;
        int sum = 0;
        while(head!=null){
            if(head.val==0 ){
                ListNode curr = new ListNode(sum,null);
                dummy.next = curr;
                dummy = curr;
                sum = 0;
            } 
            else sum+=head.val;
            head = head.next;
        }

        return next.next.next;
    }
}
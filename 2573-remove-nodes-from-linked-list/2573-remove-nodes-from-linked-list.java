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
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);

        ListNode prev = null;
        ListNode curr = head;
        int max = 0;
        while(curr!=null){
            max = Math.max(curr.val,max);
            if(curr.val < max){
                prev.next = curr.next;
                curr = curr.next;
            }
            else{
                prev = curr;
                curr = curr.next;
            }
        }
        return reverse(head);
    }

    private ListNode reverse(ListNode head){
        ListNode temp = head;

        ListNode prev = null;
        while(temp!=null){
            ListNode nn = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nn;
        }
        return prev;
    }
}
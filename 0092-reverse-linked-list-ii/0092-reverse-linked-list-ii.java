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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode beforeLeft = dummy;
        ListNode currentNode = head;

        for(int i=0;i<left-1;i++){
            beforeLeft = beforeLeft.next;
            currentNode = currentNode.next;
        }


        ListNode previous = null;
        ListNode curr = currentNode;
        for(int i=0;i<=right-left;i++){
            ListNode temp = curr.next;
            curr.next = previous;
            previous = curr;
            curr = temp;
        }

        beforeLeft.next = previous;
        currentNode.next = curr;

        return dummy.next;
    }
}
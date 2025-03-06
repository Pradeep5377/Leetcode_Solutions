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
    public ListNode swapNodes(ListNode head, int k) {

        ListNode ptr1 = head,ptr2=head;

        for(int i=1;i<k;i++){
            ptr1=ptr1.next;
        }
        ListNode swap1 = ptr1;

        while(ptr1.next!=null){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        int temp = swap1.val;
        swap1.val = ptr2.val;
        ptr2.val = temp;
        return head;
    }

}
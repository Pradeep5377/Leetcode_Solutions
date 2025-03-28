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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = new ListNode(0);
        dummy.next = list1;

        ListNode start = dummy.next;
        ListNode end = dummy.next;
        for(int i=1;i<a;i++){
            start = start.next;
        }
        for(int i=1;i<=b+1;i++){
            end = end.next;
        }
        start.next = list2;
        while(list2.next!=null){
            list2 = list2.next;
        }
        list2.next = end;
        return dummy.next;
    }
}
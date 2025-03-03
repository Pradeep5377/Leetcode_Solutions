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
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode temp1 = head;
        ListNode temp2 = head.next;
        while(temp2!=null){
            int value1 = temp1.val;
            int value2 = temp2.val;
            int gcd = findgcd(value1,value2);

            ListNode gcdNode = new ListNode(gcd);
            temp1.next = gcdNode;
            gcdNode.next = temp2;
            temp1 = temp2;
            temp2 = temp2.next;
        }
        return head;
        
    }
    private int findgcd(int value1,int value2){
        int gcd = 1;
        for(int i=1;i<=value1 && i<=value2;i++){
            if(value1%i==0 && value2%i==0) gcd = i;
        }
        return gcd;
    }
}
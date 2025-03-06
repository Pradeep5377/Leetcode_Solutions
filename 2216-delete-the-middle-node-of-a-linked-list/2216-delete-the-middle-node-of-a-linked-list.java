class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        ListNode fast = head;
        ListNode slow = dummy;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);
        slow.next = slow.next.next;
        return dummy.next;
    }
}
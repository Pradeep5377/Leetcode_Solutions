class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode great = new ListNode(0,null);
        ListNode less = new ListNode(0,null);
        ListNode greater = great,lesser = less;

        ListNode temp = head;
        while(temp!=null){
            if(temp.val>=x){
                greater.next = temp;
                greater = greater.next;
            }
            else{
                lesser.next = temp;
                lesser = lesser.next;
            }
            temp = temp.next;
        }
        greater.next = null;
        lesser.next = great.next;
        return less.next;
    }
}
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode reser = new ListNode(0);
        ListNode fast = reser;
        ListNode slow = reser;
        reser.next = head;
        if((head == null) || (head.next == null) || (k == 0)) return head;
        int i = 0;
        for(i=0; fast.next != null; i++) fast = fast.next;
        
        for(int j=0; j < i - k%i; j++) slow = slow.next;
        fast.next = reser.next;
        reser.next = slow.next;
        slow.next = null;
        return reser.next;
    }
}
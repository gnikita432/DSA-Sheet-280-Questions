// 19. Remove Nth Node From End of List

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        
            ListNode start = new ListNode(0);
    ListNode slow = start, fast = start;
    start.next = head;
    
        // ListNode slow = head;
        // ListNode fast = head;

        // int i = 0;
        if(head.next==null){
            if(n==1) return null;
            else return head;
        }
        // while(i<n){
        //     fast = fast.next;
        //     i++;
        // }
          for(int i=1; i<=n+1; i++)   {
        fast = fast.next;
    }
          while(fast != null) {
        slow = slow.next;
        fast = fast.next;
    }

    slow.next = slow.next.next;
    return start.next;
        
        // while(fast!=null || fast.next!=null){
        //     slow = slow.next;
        //     fast = fast.next;
        // }
        // slow.next = slow.next.next;
        // return head;
    }
}

// 234. Palindrome Linked List
class Solution {
    private boolean isPal = true;
    public boolean isPalindrome(ListNode head) {  
        helper(head,head);
        return isPal;
    }
    private ListNode helper(ListNode head, ListNode curr) {
        if(curr == null || !isPal) {
            return head;
        }
        head = helper(head, curr.next);
        if(head.val != curr.val) {
            isPal = false;
        } 
        return head.next;        
    }
}

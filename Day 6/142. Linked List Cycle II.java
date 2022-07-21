// 142. Linked List Cycle II

public class Solution {
    public ListNode detectCycle(ListNode head) {
        //Approach 2 - optimal aproach - slow fast pointer ----o(n) O(1)
        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                while(entry != slow){
                    entry = entry.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
    
    // Hashing approach - O(n) O(n) the element which will be already there in the hashmap tha element would be the start point of the loop
}

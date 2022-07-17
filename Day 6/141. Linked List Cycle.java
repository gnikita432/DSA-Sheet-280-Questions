// 141. Linked List Cycle

public class Solution {
    public boolean hasCycle(ListNode head) {
        
        // Approach 2 : Slow Fast Pointer Method O(n) O(1)
        
        ListNode slow = head;
        ListNode fast = head;
    
        while(fast!=null && fast.next!=null){
          
            slow = slow.next;
            fast = fast.next.next;
              if(slow == fast){
                return true;
            }
        }
       
        return false;
    }
}

//  public boolean hasCycle(ListNode head) {
        
//         // Approach 1 : HashMap O(n) O(n)
//         HashMap<ListNode, Boolean> hm = new HashMap<>();
//         ListNode dummyNode = head;
        
//         while(dummyNode != null){
//               if(hm.containsKey(dummyNode)){
//                   return true;
//               }
//               hm.put(dummyNode, true);
//               dummyNode = dummyNode.next;
//         }
        
//         return false;
//     }

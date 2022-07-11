// 21. Merge Two Sorted Lists

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
      ListNode head = new ListNode(0);
      ListNode newList = head;
        
        while(list1 !=null && list2!=null){
            if(list1.val<= list2.val){
                newList.next = list1;
                list1 = list1.next;
            }else{
                newList.next = list2;
                list2 = list2.next;
            }
            newList = newList.next;
        }
         if (list1 != null) {
            newList.next = list1;
        } else if (list2 != null) {
            newList.next = list2;
        }
        return head.next;
    }
}


//         ListNode curr1 = list1;
//         ListNode curr2 = list2;
        
//         while(curr1!=null && curr2!=null){
//             ListNode next1 = curr1.next;
//             ListNode next2 = curr2.next;
            
//             if(curr1.val <= curr2.val){
//                 curr1.next= curr2;
//                 curr1 = next1;
//             }else{
//                 curr2.next = curr1;
//                 curr2 = next2;
//             }
//         }
//         return list1.val<=list2.val? list1 : list2;

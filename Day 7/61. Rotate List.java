// 61. Rotate List

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode dummyNode = head;
        int len = 1;
        // first find the length
        while(dummyNode.next!=null){
            len++;
            dummyNode = dummyNode.next;
        }
        // As you are alredy at the end so connect it with the head as eventyully you want to do it only
        dummyNode.next = head;

        k = k%len;
        int m = len-k;
    
        // now go to the len - k th node and put its next as null
        while(m>1){
            head = head.next;
            m--;
        }
        ListNode next = head.next;
        head.next = null;
        
        return next;
        
        // O(n)  O(1)
    }
}

// 138. Copy List with Random Pointer


// --------------------Optimal Approach O(n) O(1)--------------------

class Solution {
    public Node copyRandomList(Node head) {
        
        //Edge Case
        
        
        // Step 1: Create the new copy nodes and insert them between the orginal nodes
        Node itr = head;
        Node front = head;
        while(front != null){
            front = itr.next;
            itr.next = new Node(itr.val);
            itr.next.next = front;
            itr = itr.next.next;
        }
        
        // Step 4: assign randoms to the new copy nodes
        Node curr = head;
        while(curr != null){    
            if(curr.random == null){
                curr.next.random = null;
            }else{
            curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        
        //Step 3: rearrage the List back to normal 
        Node newlist = new Node(0);
        Node clonedlist = newlist;
        Node originallist = head;
 
        while(originallist != null){
            newlist.next = originallist.next;
            originallist.next = originallist.next.next;
            originallist = originallist.next;
            newlist = newlist.next;
        }
             
        return clonedlist.next ;
    }
}

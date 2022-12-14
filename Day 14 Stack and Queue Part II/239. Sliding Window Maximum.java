// 239. Sliding Window Maximum

//Most Optimal Approach - DeQueue - Doubly linked list
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length-(k-1)];
        Deque<Integer> deque = new LinkedList<Integer>();
  
        for(int i = 0 ; i<nums.length; i++){
            //remove numbers out of range k
            while(!deque.isEmpty() && deque.peekFirst() == i-k){
                deque.removeFirst();
            }
            //remove smaller numbers then nums[i] in k range as they are useless
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]){
                deque.removeLast();
            }
            //Adding current element
           deque.addLast(i);
           if(i>=k-1){
               res[i-(k-1)]=nums[deque.peekFirst()];
           }
        }
        return res;
    }
}
// Time Complexity : O(2n)
// Space Complexity : O(k)


// Approach 1 - Naive Solution - TLE - O(n*k)
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int res[] = new int[nums.length - (k-1)];
        for(int i = 0 ; i<nums.length-(k-1); i++){
            int max = Integer.MIN_VALUE;
            for(int j = i ; j<k+i ; j++){
                if(nums[j]>max){
                    max = nums[j];
                }
            }
            res[i] = max;
        }
        return res;
    }
}

//Approach 3 - Stack solution - real nge
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        //next greater element in right
        Stack <Integer> st = new Stack();
        int [] nge = new int[nums.length];
        st.push(0);
        
        for(int i =1;i<nums.length;i++){
           while(st.size()>0 && nums[i]>nums[st.peek()]){
                   int pos = st.peek();
                   nge[pos]=i;
                   st.pop();
            }
          
            st.push(i);
        }
        while(st.size()>0){
                  int pos = st.peek();
                   nge[pos]=nums.length;
                   st.pop();
            }

     int [] max = new int[(nums.length-k)+1];
        int j=0;
        for(int i=0; i<=nums.length-k; i++){
            if(j<i){
                j=i;
            } 
            while(nge[j]<i+k){
                j=nge[j];
            }
            
            max[i]=nums[j];
        }
        
        return max;
    }
}

// Next Smaller element

public class Solution {
    public int[] prevSmaller(int[] A) {
        //Approach 1 : Stack 
        
        Stack<Integer> st = new Stack<>();
        int[] res = new int[A.length];
        res[0] = -1;
        st.push(A[0]);
        
        for(int i = 1 ; i<A.length; i++){
            while(st.size()>0 && st.peek()>=A[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i] = -1;
            }else{
                res[i] = st.peek();
            }
            st.push(A[i]);
        }
        return res;
        // Approach 2 : 2 for loops -> O(n^2)
    }
}
// Time Complexity : O(2n)
// Space Complexity : O(1)

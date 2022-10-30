// Next Greater Element Simple Basic 

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] res = new int[nums.length];
        Stack<Integer> st = new Stack<Integer>(); 

        st.push(nums[nums.length - 1]);
        int i = nums.length - 2;
        res[nums.length-1] = -1;
        while(i>=0){
            // - pop
            while(st.size()>0 && st.peek()<=nums[i]){
                st.pop();
            }
            //ans
            if(st.size()==0){
                res[i] = -1;
            }else{
                res[i] = st.peek();
            }
            //+ push
            st.push(nums[i]);
            i--;
        }
        return res;
    }
}

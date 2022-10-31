// Next Greater Element Simple Basic 

//From Start
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] res = new int[nums.length];
        Stack<Integer> st = new Stack<Integer>(); 
        st.push(0);
        for(int i = 0; i<nums.length; i++){
            while(st.size()>0 && nums[st.peek()]<nums[i]){
                res[st.peek()]=nums[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size()>0){
            res[st.peek()] = -1;
            st.pop();
        }

        return res;
    }
}

//From End
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

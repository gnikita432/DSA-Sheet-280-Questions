// 503. Next Greater Element II

//Approach 3: Optimal Approach
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] res = new int[nums.length];
        Stack<Integer> st = new Stack<Integer>(); 
        for(int i=nums.length-1; i>=0; i--){
            // pop
            while(st.size()>0 && st.peek()<nums[i]){
                st.pop();
            }
            //Push
            st.push(nums[i]);
        }
        for(int i=nums.length-1; i>=0; i--){
            // Fill the ans
            //pop
            while(st.size()>0 && st.peek()<=nums[i]){
                st.pop();
            }
            //a
            if(st.size()==0){
                res[i] = -1;
            }else{
                res[i] = st.peek();
            }
            //Push
            st.push(nums[i]);
        }
        return res;
    }
}


//Apprach 2 : A little bit optimized but not so good approach
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] res = new int[nums.length];
        Stack<Integer> st = new Stack<Integer>(); 
        st.push(0);
        int max = nums[0];
        for(int i = 1; i< 2*nums.length-1 ; i++){
            while(st.size()>0 && nums[st.peek()]<nums[i%nums.length]){
                res[st.peek()]=nums[i%nums.length];
                st.pop();
            }
            if(nums[i%nums.length]>max){
                max = nums[i%nums.length];
            }
            st.push(i%nums.length);
        }
        while(st.size()>0 && nums[st.peek()]<max){  
            st.pop();
        } 
        while(st.size()>0){
        res[st.peek()] = -1;
        st.pop();
        }

        return res;
    }
}


// Approach 1: Brute force - traverse each element and for each element again traverse till that element(circular) to find greater element. 
// ----------------------O(n^2)
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] res = new int[nums.length];
        for(int i = 0; i< res.length; i++){
            res[i] = -1;
        }
        for(int i = 0; i< nums.length; i++){
            int ele = nums[i];
            for(int j = i+1; j<=nums.length + i ; j++){
                int a = nums[j%nums.length];
                if(a>ele){
                    res[i] = a;
                    break;
                }
            }
        }
        return res;
    }
}

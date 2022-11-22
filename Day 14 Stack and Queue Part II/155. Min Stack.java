// 155. Min Stack

//Optimum Solution - space - O(n)
class MinStack {

    Stack<Long> st;
    Long min = Long.MAX_VALUE;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int value) {
       Long val = Long.valueOf(value);
        if(st.isEmpty()){
            st.push(val);
            min = val;
        }else if(min>val){
            st.push(val+val - min);
            min = val;
        }else{
            st.push(val);
        }
    }
    
    public void pop() {
        if(st.peek()<min){
            Long val = st.pop();
            min = (2*min)-val;
        }else{
            st.pop();
        }
    }
    
    public int top() {
        if(st.peek()<min){
            return min.intValue();
        }else{
            return st.peek().intValue();
        }
    }
    
    public int getMin() {
        return min.intValue();
    }
}


//Brute force - space- O(2n)
class MinStack {

    class minValPair{
        int val;
        int min;
        minValPair(int val, int min){
            this.val = val;
            this.min = min;
        }
    }
    Stack<minValPair> st;
    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if(st.isEmpty()){
            st.push(new minValPair(val, val));
        }else{
            int min = st.peek().min>val? val : st.peek().min;
            st.push(new minValPair(val, min));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}
// Time Complexity: O(1)
// Space Complexity: O(2N)

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

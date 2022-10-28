// 225. Implement Stack using Queues


//TOP and POP Efficient and push will take O(2n)
class MyStack {
    Queue<Integer> mainQ;
    Queue<Integer> helperQ;
   
    public MyStack() {
        mainQ = new ArrayDeque<>();
        helperQ = new ArrayDeque<>();  
    }
    
    public void push(int x) {
        while(mainQ.size()>0){
            helperQ.add(mainQ.remove());
        }
        mainQ.add(x);
        while(helperQ.size()>0){
            mainQ.add(helperQ.remove());
        }
    }
    
    public int pop() {
        return mainQ.remove();
    }
    
    public int top() {
        int topelement = mainQ.peek();
        return topelement;
    }
    
    public boolean empty() {
        if(mainQ.size()==0)return true;
        else return false;
    }
}



// Push efficient - POP and TOP -> O(2n)
class MyStack {
    Queue<Integer> mainQ;
    Queue<Integer> helperQ;
   
    public MyStack() {
        mainQ = new ArrayDeque<>();
        helperQ = new ArrayDeque<>();  
    }
    
    public void push(int x) {
        mainQ.add(x);
    }
    
    public int pop() {
        while(mainQ.size()>1){
            helperQ.add(mainQ.remove());
        }
        int tope = mainQ.remove();
        while(helperQ.size()>0){
            mainQ.add(helperQ.remove());
        }
        return tope;
    }
    
    public int top() {
         while(mainQ.size()>1){
            helperQ.add(mainQ.remove());
        }
        int topelement = mainQ.peek();
        return topelement;
    }
    
    public boolean empty() {
        if(mainQ.size()==0)return true;
        else return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
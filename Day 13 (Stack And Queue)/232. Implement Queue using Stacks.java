// 232. Implement Queue using Stacks

//POP and PEEK efficient and PUSH -> O(2n)
class MyQueue {
    Stack<Integer> mainStack ;
    Stack<Integer> helperStack ;

    public MyQueue() {
        mainStack = new Stack<>();
        helperStack = new Stack<>();
    }
    
    public void push(int x) {
        while(mainStack.size()>0){
            helperStack.push(mainStack.pop());
        }
        mainStack.push(x);
        while(helperStack.size()>0){
            mainStack.push(helperStack.pop());
        }
    }
    
    public int pop() {
       return mainStack.pop();
    }
    
    public int peek() {
       return mainStack.peek();
    }
    
    public boolean empty() {
        if(mainStack.size() == 0) return true;
        else return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
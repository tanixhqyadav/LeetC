class MyQueue {
    Stack<Integer> ts;
    Stack<Integer> st;        
    public MyQueue() {
        st=new Stack<>();
        ts=new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        if(ts.isEmpty()){
            while(!st.isEmpty()){
                ts.push(st.pop());
            }
        }
        return ts.pop();
    }
    
    public int peek() {
        if(ts.isEmpty()){
            while(!st.isEmpty()){
                ts.push(st.pop());
            }
        }
        return ts.peek();
    }
    
    public boolean empty() {
        return st.isEmpty() && ts.isEmpty();
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
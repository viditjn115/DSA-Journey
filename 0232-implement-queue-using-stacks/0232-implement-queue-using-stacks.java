class MyQueue {

    Deque<Integer> dq1;
    Deque<Integer> dq2;
    public MyQueue() {
        dq1= new ArrayDeque<>();
        dq2= new ArrayDeque<>();
    }
    
    public void push(int x) {
        dq1.push(x);
    }
    
    public int pop() {
        if(dq2.isEmpty()){
            while(!dq1.isEmpty()){
                dq2.push(dq1.pop());
            }
        }
        return dq2.pop();
    }
    
    public int peek() {
        if(dq2.isEmpty()){
            while(!dq1.isEmpty()){
                dq2.push(dq1.pop());
            }
        }
        return dq2.peek();
    }
    
    public boolean empty() {
        return (dq1.size()+dq2.size())==0;
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
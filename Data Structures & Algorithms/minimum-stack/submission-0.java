class MinStack {
    Stack<Integer> s;

    public MinStack() {
        s = new Stack<>();
    }
    
    public void push(int val) {
         s.push(val);
        
    }
    
    public void pop() {
        s.pop();
        
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        Stack<Integer> t = new Stack<>();
        int min = s.peek();

        while(!s.isEmpty()){
            min = Math.min(min,s.peek());
            t.push(s.pop());
        }
        while(!t.isEmpty()){
            s.push(t.pop());
        }
        return min;
    }
}

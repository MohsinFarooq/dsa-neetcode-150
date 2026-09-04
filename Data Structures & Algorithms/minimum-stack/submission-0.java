class MinStack {
    private Deque<Integer> mainStack;
    private Deque<Integer> minStack;

    public MinStack() {
        mainStack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
        
    }
    
    public void push(int val) {
        this.mainStack.push(val);
        if(this.minStack.isEmpty() || val <= this.minStack.peek()) {
            this.minStack.push(val);
        } else {
            int minStackTop = this.minStack.peek();
            this.minStack.push(minStackTop);
        }
        
    }
    
    public void pop() {
        if(!this.mainStack.isEmpty()) {
       this.mainStack.pop();
       this.minStack.pop();
        }
        
    }
    
    public int top() {
       return this.mainStack.peek();
        
    }
    
    public int getMin() {
        return this.minStack.peek();
        
    }
}

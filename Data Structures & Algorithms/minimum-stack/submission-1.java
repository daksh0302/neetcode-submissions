class MinStack {
    Stack<Integer>s;
    Stack<Integer>minstack;

    public MinStack() {
        s = new Stack<>();
        minstack = new Stack<>();
        
    }
    
    public void push(int val) {
        s.push(val);
        if(minstack.isEmpty()){
            minstack.push(val);
        }
        else if(val>minstack.peek()){
            minstack.push(minstack.peek());
        }
        else{
            minstack.push(val);
        }
    
        
    }
    
    public void pop() {
      
        minstack.pop();
         s.pop();
         
       
    }
    
    public int top() {
        return s.peek();
        
        
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

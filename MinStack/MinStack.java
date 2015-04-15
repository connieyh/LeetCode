class MinStack {
    Stack<Integer> stk = new Stack<>();
    Stack<Integer> mins = new Stack<>();
    int m = Integer.MAX_VALUE;
    public void push(int x) {
        if(x <= m) {
            m = x;
            mins.push(x);
        }
        stk.push(x);
    }

    public void pop() {
        if(stk.isEmpty()){
            return;
        }
        if(stk.peek()==m) {
            if(!mins.isEmpty()){
                mins.pop();
                if(!mins.isEmpty()) {
                    m = mins.peek();
                }else{
                    m = Integer.MAX_VALUE;
                }
            }
            
        }
        stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }

    public int getMin() {
        return mins.peek();
    }
}

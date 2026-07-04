class MinStack {
    private Stack<Integer> stack;
    public MinStack() {
        stack=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        int minV=stack.peek();
        for(int i:stack){
            minV=Math.min(minV,i);
        }
        return minV;
    }
}

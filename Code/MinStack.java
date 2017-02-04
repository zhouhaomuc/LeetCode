long min = 0;
    Stack<Long> stack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Long>();
    }
    
    public void push(int x) {
        //stack.push(x);
        if(stack.isEmpty()){
            min = x;
            stack.push(0L);
        }else {
            stack.push(x-min);
            if((x-min)<0) min = x;
        }
        
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        else{
            long value = stack.pop();
            if(value<0) min = min-value;
        }
    }
    
    public int top() {
        //if(stack.isEmpty()) return;
        //return stack.peek();
        long value = stack.peek();
        if(value<0) return (int)min;
        else return (int)(value+min);
    }
    
    public int getMin() {
        return (int)min;
    }

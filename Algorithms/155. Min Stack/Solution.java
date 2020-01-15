class MinStack {
    private List<Integer> list; 
    /** initialize your data structure here. */
    public MinStack() {
        list = new ArrayList<>();
    }
    
    public void push(int x) {
        this.list.add(x);
    }
    
    public void pop() {
        if (! this.list.isEmpty()) {
           this.list.remove(this.list.size() - 1); 
        }
        
    }
    
    public int top() {
        if (this.list.isEmpty()) {
            System.exit(1);
        }
        return this.list.get(this.list.size() - 1);
    }
    
    public int getMin() {
        if (this.list.isEmpty()) {
            System.exit(1);
        }
        int min  = this.list.get(0);
        for(int el : this.list) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }
}
class StockSpanner {

    static class pair{
        int val;
        int span;

        pair(int val , int span){
            this.val=val;
            this.span=span;
        }
    }
    Deque<pair> dq;
    public StockSpanner() {
        dq = new ArrayDeque<>();
    }
    
    

    public int next(int price) {
        int c=1;
        while(!dq.isEmpty() && price>=dq.peek().val){
            c+=dq.pop().span;
        }
        dq.push(new pair(price , c));  
        return c; 
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
class MyCircularQueue {
    int [] arr;
    int size;
    int rear;
    int front;
    int k;
    public MyCircularQueue(int k) {
        arr = new int[k];
        this.k=k;
        size=0;
        rear=0;
        front=0;
    }
    
    public boolean enQueue(int value) {
        if(size==k){
            return false;
        }
        arr[rear%k]=value;
        rear++;
        size++;
        
        return true;
    }
    
    public boolean deQueue() {
        if(front==rear){
            return false;
        }
        front++;
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[front%k];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        if(rear%k==0){
            return arr[k-1];
        }
        return arr[rear%k-1];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==k;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
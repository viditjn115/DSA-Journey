class MyLinkedList {
    private class Node{
        Node next ;
        int val;

        Node(Node next , int val){
            this.next=next;
            this.val=val;
        }
    }

    private Node head;
    private Node tail;
    private int size;
    public MyLinkedList() {
        size=0;    
        head=null;
        tail=null;    
    }
    
    public int get(int index) {
        if(index>=size || index<0){
            return -1;
        }
        int c=0;
        Node curr = head;
        while(c<index){
            curr=curr.next;
            c++;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node dummy= new Node (head,val);
        head=dummy;
        size++;
        if(tail==null){
            tail=head;
        }
    }
    
    public void addAtTail(int val) {
        Node dummy= new Node (null,val);
        if(tail==null){
            tail=dummy;
            head=dummy;
        }
        else{
            tail.next=dummy;
            tail=dummy;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size || index<0){
            return;
        }
        else if(index==0){
            addAtHead(val);
            return;
        }
        else if(index == size){
            addAtTail(val);
            return;
        }
        Node curr = head;
        int c=0;
        while(c<index-1){
            curr=curr.next;
            c++;
        }
        Node dummy = new Node(curr.next,val);
        curr.next=dummy;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size || index<0){
            return;
        }
        else if(index ==0){
            head=head.next;
            if(head==null){
                tail=null;
            }
            size--;
            return;
        }
        Node curr=head;
        for(int i =0;i<index-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        if(curr.next==null){
            tail=curr;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
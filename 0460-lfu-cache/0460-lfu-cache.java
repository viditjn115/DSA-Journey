class LFUCache {

    public class Node {
        int key,val,freq;
        Node next, prev;
        Node(int key, int val){
            this.key = key;
            this.val = val;
            freq = 1;
        }
    }

    public class DoublyLL {
        Node head,tail;
        int size;

        DoublyLL(){
            head = new Node(0,0);
            tail = new Node(0,0);
            size = 0;
            head.next = tail;
            tail.prev = head;
        }

        void addFirst(Node node){
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
            node.prev = head;
            size++;
        }

        void remove(Node node){
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

        Node removeLast(){
            if(size == 0) return null;
            Node lru = tail.prev;
            remove(lru);
            return lru;
        }
    }

    Map<Integer, Node> map;                    
    Map<Integer, DoublyLL> group;     

    int capacity;
    int minFreq;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        map = new HashMap<>();
        group = new HashMap<>();
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        updateFreq(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val = value;
            updateFreq(node);
            return;
        }
        Node newNode = new Node(key,value);
        if(!group.containsKey(1)){
            group.put(1, new DoublyLL());
        }
        group.get(1).addFirst(newNode);
        map.put(key,newNode);
        if(map.size() > capacity){
            DoublyLL list = group.get(minFreq);
            Node node = list.removeLast();
            map.remove(node.key);
        }
        minFreq = 1;
    }

    public void updateFreq(Node node){
        int oldFreq = node.freq;
        group.get(oldFreq).remove(node);
        int newFreq = oldFreq + 1;
        if(oldFreq == minFreq && group.get(oldFreq).size == 0){
            minFreq = newFreq;
        }
        node.freq = newFreq;
        if(!group.containsKey(newFreq)){
            group.put(newFreq, new DoublyLL());
        }
        group.get(newFreq).addFirst(node);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
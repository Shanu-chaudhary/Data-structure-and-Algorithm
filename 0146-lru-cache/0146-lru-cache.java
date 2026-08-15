class LRUCache {

    class Node {
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    int capacity;
    HashMap<Integer, Node> mpp = new HashMap<>();

    public void deleteNode(Node node){
        Node after = node.next;
        Node before = node.prev;
        before.next = after;
        after.prev = before;
        
    }
    public void insertAtFirst(Node node){
        Node curAfter = head.next;
        node.next = curAfter;
        node.prev = head;
        head.next = node;
        curAfter.prev = node;
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!mpp.containsKey(key)){
            return -1;
        }
        Node node = mpp.get(key);
        mpp.remove(key);
        deleteNode(node);
        insertAtFirst(node);
        mpp.put(key, head.next);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(mpp.containsKey(key)){
            Node node = mpp.get(key);
            mpp.remove(key);
            deleteNode(node);
        }
        if(capacity == mpp.size()){
            mpp.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        insertAtFirst(new Node(key, value));
        mpp.put(key, head.next);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
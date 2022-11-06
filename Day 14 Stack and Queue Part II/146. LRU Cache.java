// 146. LRU Cache

class LRUCache {
    //class node
    class Node{
        int key, value;
        Node prev, next;
    }

    //Add node to first
    public void addFirst(Node node){
        Node nbr = head.next;
        head.next = node;
        node.next = nbr;
        node.prev = head;
        nbr.prev = node;
    }
    public void remove(Node node){
        Node prevnbr = node.prev;
        Node nextnbr = node.next;
        prevnbr.next = nextnbr;
        nextnbr.prev = prevnbr;

        node.next = node.prev = null;
    }
    public void movetofront(Node node){
        remove(node);
        addFirst(node);
    }


    HashMap<Integer, Node> cache;
    int cap;
    Node head, tail;
    public LRUCache(int capacity) {
        cache = new HashMap<>();
        cap = capacity;
        head = new Node();
        tail = new Node();

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        Node node = cache.get(key);
        if(node == null){
            return -1;
        }else{
            int v = node.value;
            movetofront(node);
            return v;
        }
    }
    
    public void put(int key, int value) {
        Node node = cache.get(key);
        if(node == null){
            Node nn = new Node();
            nn.key = key;
            nn.value = value;

            if(cache.size() == cap){
                Node lrunode = tail.prev;
                cache.remove(lrunode.key);
                remove(lrunode);
            }
            cache.put(key, nn);
            addFirst(nn);
        }else{
            node.value = value;
            movetofront(node);
        }
        
    }


}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
 
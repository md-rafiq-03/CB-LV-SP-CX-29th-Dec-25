package linkedlists;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheImpl {
    class LRUCache {
        public class Node {
            int key;
            int val;
            Node next;
            Node prev;

            public Node(int key, int val){
                this.val = val;
                this.key = key;
                this.next = null;
                this.prev = null;
            }
        }


        public Node head;
        public Node tail;
        private Map<Integer, Node> cache;
        private int cap;
        private int size;

        public LRUCache(int capacity) {
            this.cap = capacity;
            this.cache = new HashMap<>();
            head = new Node(-1,-1);
            tail = new Node(-1,-1);
            head.next = tail;
            tail.prev = head;
            this.size = 0;
        }

        private void delete(Node node){
            size--;
            Node prevNode = node.prev;
            Node nextNode = node.next;

            prevNode.next = nextNode;
            nextNode.prev = prevNode;

            cache.remove(node.key);

        }

        private void insert(int key, int value){
            size++;
            Node newNode = new Node(key, value);
            Node ahead = head.next;

            head.next = newNode;
            newNode.prev = head;

            newNode.next = ahead;
            ahead.prev = newNode;

            cache.put(key, newNode);
        }

        public int get(int key) {
            if(!cache.containsKey(key)){
                return -1;
            }
            Node node = cache.get(key);
            int value = node.val;
            insert(key, value);
            delete(node);
            return value;
        }

        public void put(int key, int value) {
            if(cache.containsKey(key)){
                delete(cache.get(key));
            }
            insert(key, value);

            if(size>cap){
                delete(tail.prev);
            }
        }
    }

}

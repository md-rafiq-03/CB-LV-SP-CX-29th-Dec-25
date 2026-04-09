package linkedlists;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public void addAtFront(int data){
        Node newNode = new Node(data);
        if(size == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next =  head;
            head = newNode;
        }
        size++;
    }

    public void addAtLast(int data){
        Node newNode = new Node(data);
        if(size == 0){
            head = newNode;
            tail = newNode;
        }else{
           tail.next = newNode;
           tail = newNode;
        }
        size++;
    }

    private Node getNodeAtK(int k){
        Node temp = head;
        for(int i=0;i < Math.min(k,size);i++){
           temp = temp.next;
        }
        return temp;
    }

    public void addAtIndex(int idx, int data){
        if(idx==0){
            addAtFront(data);
        }else if(idx>=size){
            addAtLast(data);
        }else{
            Node temp  = getNodeAtK(idx-1);
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    public int getFirst() throws Exception{
        if(head==null){
            throw new Exception("No Linkedlist Exist !!");
        }
        return head.data;
    }

    public int getLast() throws Exception{
        if(head==null){
            throw new Exception("No Linkedlist Exist !!");
        }
        return tail.data;

    }

    public int getAtIndex(int idx) throws Exception{
        Node node =  getNodeAtK(idx);
        if(node==null){
            throw new Exception("Index out of bound!!");
        }
        return node.data;
    }


    public int removeFirst(){
        Node existingNode = head;
        if(size==1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            existingNode.next = null;
        }
        size--;
        return existingNode.data;
    }

    public int removeLast(){
        int removedData;
        if(size==1){
            removedData = head.data;
            head=null;
            tail = null;
        }else {
            Node temp = getNodeAtK(size - 2);
            removedData = temp.next.data;
            temp.next = null;
            tail = temp;
        }
        size--;
        return removedData;
    }

    public int removeAtIndex(int idx){
        if(idx==0){
            return removeFirst();
        }else if(idx==size-1){
            return removeLast();
        }else{
            Node prevNode = getNodeAtK(idx-1);
            Node currNode = prevNode.next;
            prevNode.next = prevNode.next.next;
            currNode.next = null;
            size--;
            return currNode.data;
        }
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
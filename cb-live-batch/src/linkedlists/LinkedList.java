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
        for(int i=0;i<k;i++){
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

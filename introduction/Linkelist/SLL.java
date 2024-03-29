package introduction.Linkelist;

public class SLL {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        
    }
    private Node head;
    private Node tail;
    private int size;

    public SLL() {
        this.size = 0;
    }
    public Node get(int index){
        Node node = head;
        for(int i =0; i < index; i++){
            node = node.next;
        }
        return node;
    }
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void insertLast(int val){
        if(head == null){
           insertFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail= node;
        size++;
    }
    public void Insert(int val , int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i= 1;i<index-1;i++){
                temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next =node;
        size++;
    }
    public void deleteFirst(){
        head = head.next;
        if(head==null){
            tail= null;
        }
        size--;
        return;
    }
    public int deleteLast(){
        if(size <=1){
             deleteFirst();
        }
        Node secondlast = get(size-2);
        int val = tail.value;
        secondlast.next= null;
        tail=secondlast;
        return val;
    }
    public int delete(int index){
        if(index==0){
            deleteFirst();
        }
        if(index== size-1){
            deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next= prev.next.next;
        size--;
        return val;
    }
      
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        
        list.insertLast(23);
        list.Insert(12,3);
        list.display();
        //list.deleteFirst();
      //System.out.println(list.deleteLast()); 
       list.delete(2);
        list.display();
    }
}

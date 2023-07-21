package LinkedList;

public class LinkedListAdd {
    public static class Node {
        int data;
        Node next;

        // Constructor to create a new node with given value and null pointer.
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;
    public static Node tail;
    //for counting size
    public static int size;

    public void addFirst(int data) {
        // Step-1 to create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {// If the linked list is empty or has
            head = tail = newNode;// only one element, then set both head
            return;
        }
        // step 2 new node ka next =head ko point karega
        newNode.next = head;
        // head point karega new node ko
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);// create newnode object
        size++;
        if (head == null) {// if there are no elements in linkedList
            head = tail = newNode; // set it as first & last nodes of LL
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List Is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListAdd ll = new LinkedListAdd();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();
        System.out.println(ll.size);

    }
}

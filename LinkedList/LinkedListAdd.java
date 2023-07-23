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
    public void add(int idx,int data){ // add any position
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
        if (head == null) { //if linkedlist is empty
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
    //Remove First element in LinkedList
    public int removeFirst(){
        if(size==0){ //if linkedlist is empty
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    //Remove Last element in LinkedList
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        // prev:i=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data; //tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    //For Serching element 
    public int itrativeSearch(int key){
        
        Node temp=head;
        int i=0;
        while(temp!= null){
            if(key== temp.data){
            return i;
            }
            temp=temp.next;
            ++i;
            
        }
        return -1;
    }

    //Search Using Recursive Function
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int reSearch(int key){
        return helper(head, key);
    }

    //Reverse a linkedList using recursive approach
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        LinkedListAdd ll = new LinkedListAdd();
        // ll.print();
        ll.addFirst(2);
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addLast(3);
        // ll.print();
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();
        // System.out.println(ll.size);
        ll.removeFirst();
        System.out.println(ll.size);
        ll.print();
        ll.removeLast();
        // System.out.println(ll.size);
        ll.print();
        // System.out.println(ll.itrativeSearch(3));
        // System.out.println(ll.itrativeSearch(10));
        System.out.println("Recursive Search");
        // System.out.println(ll.reSearch(3));
        // System.out.println(ll.reSearch(-5));
        ll.reverse();
        ll.print();

    }
}

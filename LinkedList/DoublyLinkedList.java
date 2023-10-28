package LinkedList;

public class DoublyLinkedList {
    public class Node{
        int data ;
        Node next,prev;
        //constructor for node
        Node(int data){
            this.data= data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int  size;
    public void addFirst(int data){
        Node newnode= new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next= head;
        head.prev = newnode;
        head=newnode;

    }
    //print 
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(+temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");

    }
    //Remove Last
    public int RemoveFirst(){
        if(head== null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            tail=head=null;
            size--;
            return val;
        }
        int val =head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;

    }
    public void Reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println(dll.size);
        dll.RemoveFirst();
    dll.print();
    System.out.println(dll.size);
    dll.Reverse();
    dll.print();

    }
}

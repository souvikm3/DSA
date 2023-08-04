package LinkedList;

public class MergeSort {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;
    public static Node tail;
    // for counting size
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

    public void add(int idx, int data) { // add any position
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public Node getMid(Node head){
        if(head==null && head.next==null){
            return head;
        }
        Node slow=head;
        Node fast=head.next;
        while(fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; // mid node

    }

    private Node merge(Node head1, Node head2){
        Node mergell=new Node(-1);
        Node temp=mergell;
        while(head1 !=null && head2!=null){
            if(head1.data <=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;   
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergell.next;
    }

    //MergeSort Function
    public Node mergeSort(Node head){
        if(head==null || head.next==null)//base case for recursion
        {
            return head;
        }
        //Find Mid
        Node mid= getMid(head);
        //Left and Right Merge Sort
        Node rightNode= mid.next;
        mid.next=null;//break the linked list into two parts
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightNode);
        //Merge
        return merge(newLeft,newRight);
    }
    public void print() {
        if (head == null) { // if linkedlist is empty
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

    public void ZigZag(){
        //Find middle 
        Node slow= head;
        Node fast = head.next;
        while(fast!=null && fast.next!= null){
            slow=slow.next;
            fast=fast.next.next;

        }
        Node mid =slow;
        //2nd half reverse
        Node curr=mid.next;
        mid.next=null;
        Node prev =null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left = head;
        Node right=prev;
        Node nextL;
        Node nextR;
        //Alternate merging
        while(left!= null && right!= null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;
        }
    }
    public static void main(String[] args) {
        MergeSort ll=new MergeSort();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // ll.print();
        // ll.head=ll.mergeSort(ll.head);
        ll.print();
        ll.ZigZag();
        ll.print(); 
    }
}

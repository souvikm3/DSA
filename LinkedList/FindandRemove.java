package LinkedList;

public class FindandRemove {
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

    // Delete form last nth node
    public void DeletefromNthNode(int n) {
        // Calculate Size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        // Corner case
        if (n == sz) {
            head = head.next;
            return;
        }
        // For other cases
        int i = 1;
        Node prev = head;
        int iToFind = sz - n;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }
    //Slow Fast approch to find middle
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow ;
    }
    public boolean CheckPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //Find Mid
        Node midNode = findMid(head);
        //Reverse 2nd half
        Node prev= null;
        Node curr= midNode;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right =prev;
        Node left= head;
        //Check Right and Left Half
        while(right !=null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
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
    public static boolean isCycle(){ //Floyads method
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void RemoveCycle(){
        //Detect Cycle
        Node fast=head;
        Node slow=head;
        boolean cycle= false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){

                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //FInd Meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //Remove Cycle ->last.next=null;
        prev.next=null;
    }

    public static void main(String[] args) {
        // FindandRemove ll = new FindandRemove();
        // ll.addFirst(2);
        // // ll.print();
        // ll.addFirst(1);
        // // ll.print();
        // ll.addLast(3);
        // // ll.print();
        // ll.addLast(4);
        // ll.add(2, 9);
        // ll.print();
        // ll.DeletefromNthNode(2);
        // ll.print();
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
       
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(isCycle());
        RemoveCycle();
        System.out.println(isCycle());
    }
}

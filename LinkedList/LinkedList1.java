package LinkedList;

public class LinkedList1 {
    public static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node<Integer> createLinkedlist() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        return n1;
    }
public static void print(Node<Integer>head){
    System.out.println("Print"+head);
    System.out.println(head.data);
}
    public static void main(String[] args) {
        // Node n1 = new Node(10);
        // System.out.println(n1.data);
        // System.out.println(n1.next);
        Node<Integer>head=createLinkedlist();
        System.out.println("Main"+head);
        print(head);
        
    }
}

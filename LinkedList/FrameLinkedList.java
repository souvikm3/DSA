package LinkedList;
import java.util.LinkedList;;
public class FrameLinkedList {
    public static void main(String[] args) {
        //Create
        LinkedList<Integer>ll=new LinkedList<>();
        //Add
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(1);
        System.out.println(ll);
        //Remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}

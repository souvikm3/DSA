package ArrayList;
import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(4);
        System.out.println(list);
        Collections.sort(list); //assending order
        System.out.println(list);
        //Collections.reverseOrder() to sort in descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}

package ArrayList;
import java.util.ArrayList;
public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        //Operations on ArrayList
        //Add Operation =>O(1)
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
        //Get Operation=O(1) used  to find position
       int element= list1.get(1);
       System.out.println(element);
       //Remove operation used to delete =>O(n)
       list1.remove(1);
       System.out.println(list1);
       //Set element at index
       list1.set(1, 5);
       System.out.println(list1);
       //Contain element or not
       System.out.println(list1.contains(1));
       System.out.println(list1.contains(12));
    }
}

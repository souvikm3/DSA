package ArrayList;
import java.util.ArrayList;
public class PrintReverse {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Original List: "+list);//[1, 2,
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}

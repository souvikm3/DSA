package Arrays;

import java.util.Scanner;

public class Incrementarr {
    public static int[] TakeInput(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int[] arrSum(int []arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[]=TakeInput();
        int sum[]=arrSum(arr);
        // System.out.println(sum+" ");
    }
}

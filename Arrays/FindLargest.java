package Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class FindLargest {
    // public static int []TakeInput(){
    //     Scanner sc=new Scanner(System.in);
    //     int size=sc.nextInt();
    //     int arr[]=new int[size];
    //     for(int i=0;i<size;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     return arr;
    // }
    // public static int Large(int[]arr){
    //     int max= Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         if(max<arr[i]){
    //             max=arr[i];
    //         }
    //     }
    //     return max;
    // }
    // public static void main(String args[]){
    //     int arr[]=TakeInput();
    //     int largest=Large(arr);
    //     System.out.println(largest);
    // }
    public static int [] TakeInput(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;

    }
    public static int ArrMax(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[]=TakeInput();
        int largest=ArrMax(arr);
        System.out.println(largest);
    }
}

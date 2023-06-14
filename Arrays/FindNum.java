package Arrays;

import java.util.Scanner;

public class FindNum {
    public static int [] TakeInput(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int Find(int[]arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find");
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
              
        }
        return -1;
        
    }
    public static void main(String args[]){
        int arr[]=TakeInput();
        int findn=Find(arr);
        System.out.println("The index of the number is: "+findn);
    }
}

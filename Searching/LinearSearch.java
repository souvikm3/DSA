package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static int[] TakeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static boolean Search(int arr[]){
        System.out.println("Enter the element to be searched");
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt (); //The key what to search
        for(int i=0;i<arr.length;i++){ //traverse from starting and if found then add then comapre with key and print it
            if(x==arr[i]){
                System.out.print ("Element found at position "+(i+1));
            }
        }
        return false;
    }
    public static void main(String args[]){
        int a[]=TakeInput();
        Search(a);
    }
}

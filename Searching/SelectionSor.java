package Searching;

import java.util.Scanner;

public class SelectionSor {
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void Selection(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=arr[i];
            int minIdx=i;
            for(int j=i+1;j<n;j++){
                if(min>arr[j]){
                    min=arr[j];
                    minIdx=j;

                }
            }
            arr[minIdx]=arr[i];
            arr[i]=min;
        }
    }
    public static void print(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]=takeInput();
        Selection(arr);
        print(arr);
    }
}

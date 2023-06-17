package Practice;

import java.util.Scanner;

public class SelectionSort {
    public static int[] TakeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void Sort(int arr[]){
        //selection sort
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIdx=i;
            int min=arr[i];
            for(int j=i+1;j<n;j++){
                if(min>arr[j]){
                    minIdx=j;
                    min=arr[j];
                }
            } 
            if(minIdx !=i){
                arr[minIdx]=arr[i];
                arr[i]=min;
            }
        }
    }
    public static void main(String args[]){
        int arr[]=TakeInput();
        Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

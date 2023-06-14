package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static int []TakeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int search(int []arr){
        System.out.println("Enter the key to find:");
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int n=arr.length;
        int start=0;
        int end=n-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                // System.out.println(mid);
                return mid;
            }
            if(mid<key){
                 start=mid+1;
                //  mid=(start+end)/2;
            }
            else if(mid>key){
                end=mid-1;
                // mid=()
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[]=TakeInput();
        int sr=search(arr);
        System.out.println("The found element index is: "+sr);
    }
}

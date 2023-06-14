package Searching;

import java.util.Scanner;

public class Binary {
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int BinarySearch(int []arr){
        int m=arr.length;
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int start=0;
        int end=m-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]=takeInput();
        int sc=BinarySearch(arr);
        System.out.println(sc);
    }
}

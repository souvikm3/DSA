package Practice;

import java.util.Scanner;

public class BinarySearch {
    public static int Search(int arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        int key=sc.nextInt();
        //left and right pointers for binary search
        int start=0; int end=arr.length-1;
        int mid =start;
        while(start<=end){
            mid=(start+end)/2;
            if(key<arr[mid]){
                end=mid-1;
            }else if(key>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
            
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int a=Search(arr);
        System.out.println(a);
    }
}

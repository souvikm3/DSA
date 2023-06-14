package Practice;

import java.util.Arrays;

public class ArraySwap {
    public static int[] swap(int arr[]){
        for(int i=0;i<arr.length-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return  arr;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int arr1[]=swap(arr);
        System.out.println(Arrays.toString(arr1));
    }
}

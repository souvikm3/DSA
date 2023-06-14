package Arrays;

import java.util.Scanner;

public class PrintPairs {
    public static int [] TakeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void Pairs(int[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
        }
    }
    public static void main(String args[]){
        int arr[]=TakeInput();
        Pairs(arr);
    }
}

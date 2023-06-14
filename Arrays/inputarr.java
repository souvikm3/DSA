package Arrays;

import java.util.Scanner;

public class inputarr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the number at "+i+" index: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

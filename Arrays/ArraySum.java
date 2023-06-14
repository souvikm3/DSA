package Arrays;

import java.util.Scanner;

public class ArraySum {
    public static int [] takeInput(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int input[]=new int[size];
        for(int i=0;i<size;i++){
            input[i]=sc.nextInt();
        }
        return input;
    }
    public static int ArrSum(int[]arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]=takeInput();
        System.out.println(ArrSum(arr));
    }
}

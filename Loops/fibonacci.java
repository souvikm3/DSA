package Loops;

import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]){
        // int a=0;
        // int b=1;
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // for(int i=0;i<n;i++){
        //     int c=a+b;
        //     a=b;
        //     b=c;
        //     System.out.print(a+" ");
        // }
        int a=0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        while(i<n){
            int c=a+b;
            a=b;
            b=c;
            i++;
            System.out.print(a+" ");
            
        }
    }
}

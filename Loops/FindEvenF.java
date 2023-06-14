package Loops;

import java.util.Scanner;

public class FindEvenF {
    public static void PrintEven(int s ,int e){
        for(int i=s;i<=e;i++){
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }
        // int i=1;
        // for(i=1;i<=n;i++){
        //     if(i%2==0){
        //         // break;
        //         System.out.println(i);
        //     }
           
        // }
        // return n;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        PrintEven(s, e);
        // PrintEven(n);
        // System.out.println(PrintEven(n));
    }
}

package Fundamentls;

import java.util.Scanner;

public class whileloop {
    public static void main(String args[]){
        // int i=0;
        // while(i<5){
        //     System.out.println("Hello World");
        //     i++;
        // }
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}

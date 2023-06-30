package Recursion;

import java.util.Scanner;

public class Increasing {
    public static void Print(int n){
        if(n==0){
            return;
        }
        // System.out.print(n+" ");
        System.out.print(n+" ");
        Print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
    int n=sc.nextInt();
    System.out.println("The Decreasing order is:");
    Print(n);
    }
}

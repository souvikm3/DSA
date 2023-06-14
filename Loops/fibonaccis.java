package Loops;

import java.util.Scanner;

public class fibonaccis {
    public static boolean FindNum(int n){

        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            int c=a+b;
            a=b;
            b=c;
        }if(a==n){
            return true;
        }
        else{
            // System.out.println("not found");
            return false;
        }
       
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int result=FindNum(n);
        System.out.println(FindNum(n)); 
    }
}

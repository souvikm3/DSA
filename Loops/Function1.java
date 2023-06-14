package Loops;

import java.util.Scanner;

public class Function1 {
    public static int Func(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Func(a, b));
    }
}

package Loops;

import java.util.Scanner;

public class FunctionNcr {

    public static int Fact(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int factN= Fact(n);
        int factR=Fact(r);
        int factNR=Fact(n-r);
        int result=factN/(factR*factNR);
        System.out.println(result);
    }
}

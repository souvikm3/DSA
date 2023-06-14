package Fundamentls;

import java.util.Scanner;

public class checkprime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int div=2;
        boolean Isprime=true;
        while(div<=n-1){
            if(n%div==0){
                Isprime=false;
            }
            div++;
        }
        if(Isprime){
            System.out.println("Prime");
        }else{
            System.out.println("Non prime");
        }
    }
}

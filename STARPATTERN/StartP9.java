package STARPATTERN;

import java.util.Scanner;

import Fundamentls.whileloop;

public class StartP9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            j=1;
            int p=i;
            while(j<=i){
                System.out.print(p);
                p++;
                j++;
            }
            j=1;
            p=(2*i)-2;
            while(j<=i-1){
                System.out.print(p);
                p--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

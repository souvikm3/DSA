package STARPATTERN;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String args[]){
        System.out.println("Enter the number of rows:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(i+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

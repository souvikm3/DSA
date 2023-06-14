package STARPATTERN;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int p=i;
            while(j<=i){
                System.out.print(p+" ");
                j++;
                p--;
            }
            System.out.println();
            i++;
        }
    }
}

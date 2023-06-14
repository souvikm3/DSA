package STARPATTERN;

import java.util.Scanner;

public class StarP4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            // int p=n;
            while(j<=n-i+1){
                System.out.print(n-i+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

package STARPATTERN;

import java.util.Scanner;

public class StarP5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i+1){
                int val=i;
                System.out.print(val);
                // System.out.print(n-i+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

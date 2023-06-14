package STARPATTERN;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=1;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(s+ " ");
                s++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

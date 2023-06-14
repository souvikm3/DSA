package STARPATTERN;

import java.util.Scanner;

public class StarP2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

package STARPATTERN;

import java.util.Scanner;

public class Charp3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<n){
            int j=1;
            char x='A';
            while(j<=i){
                System.out.print((char)(x+i-1));
                // x++;
                j++;
            }
            System.out.println();
            
            i++;
            
        }
    }
}

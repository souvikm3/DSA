package STARPATTERN;

import java.util.Scanner;

public class Charp2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            char Starting=(char) ('A'+(i-1));
            while(j<=n){
                System.out.print(Starting +" ");
                Starting=(char)+(Starting+1);
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}

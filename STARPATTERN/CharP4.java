package STARPATTERN;

import java.util.Scanner;

public class CharP4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int x=(char)('A'+i-1);
            while(j<=i){
                System.out.print((char)x);
                x++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

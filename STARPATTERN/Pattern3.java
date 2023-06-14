package STARPATTERN;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String srgs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;i<n;j++){
        //         System.out.print(j);
        //         j++;
        //     }
        //     i++;
        // }
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

package Loops;

import java.util.Scanner;

public class FindNcr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int factN=1;
        for(int i=1;i<=n;i++){
            factN=factN*i;
            // System.out.println(factN);
        }
        int factR=1;
        for(int i=1;i<=r;i++){
            factR=factR*i;
        }
        int factNR=1;
        for(int i=1;i<=n-r;i++){
            factNR=factNR*i;
        } 
        int result= factN/(factR*factNR);
        System.out.println(result);
    }
}

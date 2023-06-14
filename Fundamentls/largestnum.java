package Fundamentls;

import java.util.Scanner;

public class largestnum {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b){
            System.out.println(a+"IS Greater");
        }
        else{
            System.out.println(b+"Is geater");
        }
        
    }
}

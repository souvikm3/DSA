package Fundamentls;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        // int b=sc.nextInt();
        if(a%2==0){
            System.out.println(a+" is a prime number");
        }
        else{
            System.out.println(a+" is a non prime number");
        }
    }

}

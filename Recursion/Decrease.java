package Recursion;

import java.util.Scanner;

public class Decrease {
    public static void Down(int n){
        //At fisrt we have to write base case 
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        Down(n-1);//calling itself again and decreasing the value of parameter by 1
    }
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    System.out.println("The Decreasing order is:");
    Down(n);
   }
}

package NewArray;

import java.util.Scanner;

public class TakeInput {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Row of the array:");
        int row=sc.nextInt();
        System.out.println("Enter the size of Columns of the array:");
        int column=sc.nextInt();
        int arr[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println("Enter the "+i+" row and "+j+"th column");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

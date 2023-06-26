package NewArray;

import java.util.Scanner;

public class SesrchElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int row=sc.nextInt();
        System.out.println("Enter the number of Columns: ");
        int column=sc.nextInt();
        int arr[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                 System.out.println("Enter the "+i+" row and "+j+"th column");
                arr[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(arr[i][j]==x){
                    System.out.println("Row is "+i+"snd column is "+j);
                }
            }
        }
    }
}

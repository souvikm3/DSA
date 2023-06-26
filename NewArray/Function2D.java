package NewArray;

import java.util.Scanner;

public class Function2D {
    public static int [][] TakeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int arr[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return  arr;
        //Taking input
    }
    public static void print(int arr[][]){
        int row=arr.length;
        int column=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
   
    public static void main(String args[]){
        int arr[][]=TakeInput();
        print(arr);
        
    }
}

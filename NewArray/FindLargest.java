package NewArray;

import java.util.Scanner;
//Find LArgest from the column
public class FindLargest {
    public static int [][] TakeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Row and Column ");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int arr[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return  arr ;
    }
    public static void Print(int arr[][]){
        int row=arr.length;
        int column=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int large(int arr[][]){
        int max=Integer.MIN_VALUE;
        int row=arr.length;
        int column=arr[0].length;
        for(int j=0;j<column;j++){
            int sum=0;
            for(int i=0;i<row;i++){
                sum=sum+arr[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[][]=TakeInput();
        Print(arr);
        int max=large(arr);
        System.out.println("\nThe largest element is "+max);
    }
}

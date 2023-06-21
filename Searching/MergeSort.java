package Searching;

public class MergeSort {
    public static int[] Sort(int arr1[], int arr2[]){
        int i=0,j=0,k=0;
        int ans[]=new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;
            }
            else{
                ans[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            ans[k]=arr1[i];
            i++;
            k++;
        }while(j<arr2.length){
            ans[k]=arr2[j];
            j++;
            k++;
        }
        return ans;
    }
    public static void main(String args[]){
        int arr1[]={1,2,4,6};
        int arr2[]={1,3,5,7,8};
        int arr[]=Sort(arr1, arr2);
        // System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+", s");
        }
    }
}

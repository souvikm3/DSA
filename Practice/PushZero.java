package Practice;

public class PushZero {
    public static void Push(int arr[]){
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k++;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={8,5,0,7,2,0,6};
        Push(arr);
    }
}

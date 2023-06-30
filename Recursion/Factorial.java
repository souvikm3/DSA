package Recursion;

public class Factorial {
    public static int fact(int n){
        if(n==0){  // to stop in this position other wise it will run infinite times and it gives stackoverflow error
            return 1;
        }
        int smallAns=fact(n-1);
        return n*smallAns;
    }
    public static void main(String args[]){
        int n=4;
        int s=fact(n);
        System.out.println(s);
    }
}

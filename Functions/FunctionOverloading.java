package Functions;

public class FunctionOverloading {
    public static void num(int a,int b){
        System.out.println(a+b);
    }
    public static int num(int a){
        return a;
    }
    public static double num(double a,double b){
        double c=a+b;
        return c;
    }
    public static void main(String args[]){
        num(5, 6);
        // System.out.print(num(2, 3));
        System.out.println(num(2));
        System.out.println(num(1.1, 1.2));
    }
}

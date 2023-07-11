package OOPS;

public class Polymorphism { 
    public static void main(String[] args) {
    // Calculator c=new Calculator();
    // System.out.println(c.sum(1,2));   
    // System.out.println(c.sum((float)8.2,(float)5.2)); 
    // System.out.println(c.sum(5,6,7));
    Deer d=new Deer();
    d.eat();
    }
    
}
class Animal{
    void eat(){
        System.out.print("Animal is eating");
    }
}
class Deer extends Animal{
    // method overriding
    void eat(){
        System.out.println("Eating Grass");
    }
}
// class Calculator{
//     // Method over loading
//     int sum(int a,int b){
//         return a+b;
//     }
//     float sum(float a, float b){
//         return a+b;
//     }
//     int sum(int a,int b,int c){
//         return a+b+c;
//     }
// }

package OOPS;

class Vehicle {
    String color;
    int maxSpeed;
    public void print(){
        System.out.println("Color: "+color+" MaxSpeed is "+maxSpeed);
    }
}
class Car extends Vehicle{
    int Numberofdoors;

}
class Bicycle extends Vehicle{

}
public class Inheritance{
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.color="Black";
        v.maxSpeed=50;
        v.print();

    }
}

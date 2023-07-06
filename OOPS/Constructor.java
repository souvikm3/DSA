package OOPS;

public class Constructor {
    public static void main(String args[]){
        //Creating object of the student class without passing any arguments to constructor, it will call default or
        //Creating object of the student class using constructor without parameters
        Student s1=new Student(); //non parameterazied constructor is called
        Student s2=new Student("Souvik");
        Student s3=new Student(2);
    }
}
class Student{
    String name;
    int roll;
    Student(){ // non parametarized constructor
        System.out.println("Constructor called............");
    }
    Student(String name){ //parameterized constructor..........
        this.name=name;
    }
    Student(int roll){ //parameterized constructor............
        this.roll=roll;
    }
}
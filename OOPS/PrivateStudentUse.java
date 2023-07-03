package OOPS;

public class PrivateStudentUse {
    public static void main(String args[]){
        // PrivateStudent S3=new PrivateStudent();
       
        // S3.name1="Souvik";
        // S3.setRoll(-123); // because we are ont satisfying the private condition
        // System.out.println("Name: "+S3.name1);
        // System.out.println(S3.getRoll()); // // Accessing private method
         PrivateStudent s1=new PrivateStudent("Souvik", 1);
         s1.print();
    }
}

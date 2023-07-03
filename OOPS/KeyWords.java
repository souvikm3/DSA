package OOPS;

public class KeyWords {
   public class student{
      String name1;
    private final int RollNum1; // we have to initialized it only here on in any constructors it self because we use final keyword
    public student(String n,int rn){ // making new constructors
        name1=n;
        RollNum1=rn;
    }
    // public void setRoll(int rn){
    //     if(rn<0){
    //         return;
    //     }
    //     RollNum1 = rn; // To access the private method 
    //     //  we can only access the private class only in this class itself
    // }
    public int getRoll(){
        // System.out.println("The roll number is:"+ this.RollNum1);
        return RollNum1; 
    }
    public void print(){
        System.out.println(name1+":"+" "+RollNum1);
    }
   }
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

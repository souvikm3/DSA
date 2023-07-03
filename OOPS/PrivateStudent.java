package OOPS;
public class PrivateStudent {
    String name1;
    private int RollNum1;
    public PrivateStudent(String n,int rn){ // making new constructors
        name1=n;
        RollNum1=rn;
    }
    public void setRoll(int rn){
        if(rn<0){
            return;
        }
        RollNum1 = rn; // To access the private method 
        //  we can only access the private class only in this class itself
    }
    public int getRoll(){
        // System.out.println("The roll number is:"+ this.RollNum1);
        return RollNum1; 
    }
    public void print(){
        System.out.println(name1+":"+" "+RollNum1);
    }
}

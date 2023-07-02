package OPPS;

public class StudentClassUse {
    public static void main(String args[]){
        StuentClass s1=new StuentClass();
        StuentClass s2=new StuentClass();
        s1.name="Souvik";
        s2.name="Ram";
        s1.RollNum=2;
        s2.RollNum=1;
        System.out.println(s1.name+" "+s1.RollNum);
        System.out.println(s2.name+" "+s2.RollNum);
    }
}

package OOPS;

public class CopyConstructor {
    Bank b1=new Bank();
    Bank b2=new Bank(b1);
}
class Bank{
    int accountNumber;
    String password;
    int accHolder[];
    //copy constructor
    Bank(Bank b1){
        this.accountNumber=b1.accountNumber;
        this.password=b1.password;
    }
    Bank(){
        accHolder=new int[3];

    }
    Bank (String accountNumber){
        // this.accountNumber=accountNumber;
    }
}

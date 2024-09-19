package PAM;

import java.util.ArrayList;

public class PersonalAccount {
    int accountNumber;
    String AccountHolder;
    double balance;
    ArrayList<Amount> transactions=new ArrayList<Amount>();
    public PersonalAccount(int accountNumber,String accountHolder){
        this.AccountHolder=accountHolder;
        this.accountNumber=accountNumber;
        balance=0;
    }

    public void deposit(double amount){

    }
}

package bankaccount;

import java.util.*;
import java.util.logging.Logger;
class BankAcc{
    public static final Logger Log = Logger.getLogger("InfoLogging");

    String accountHolderName;
    int accountNumber;
    double accountBalance=0;
    static Scanner so = new Scanner(System.in);


    BankAcc(){
        Log.info("Bank Account");
        Log.info("Enter Your Name:");
        accountHolderName = so.nextLine();
        Log.info("Enter Account number:");
        accountNumber = so.nextInt();
        Log.info("Account Created");
    
    }
    void display(){
        String dis = "Account Holder Name: "+accountHolderName+"\nAccount Number: "+accountNumber+"\nBalance: Rs."+accountBalance;
        Log.info(dis);
        
    }
    void deposit(){
        Log.info("Enter Amount to deposit: Rs. ");
        double depositAmt = so.nextDouble();
        accountBalance+=depositAmt;
        Log.info(" Deposited Successfully");
    }
    void withdraw(){
        Log.info("Enter Withdrawn amt: Rs. ");
        int withdrawAmt = so.nextInt();
        if(accountBalance>withdrawAmt){
            accountBalance-=withdrawAmt;
            String wd = "---Amount Withdrawn Succsessfully---\n Account Balance: Rs. "+accountBalance;
            Log.info(wd);
        }
        else{
            Log.warning("***Insufficient Amount***");
        }
    }
}

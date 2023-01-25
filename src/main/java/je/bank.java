package je;

import java.util.*;
class BANK{
    String accountHolderName;
    int accountNumber;
    double accountBalance=0;
    static Scanner so = new Scanner(System.in);


    bank(){
        System.out.println("Bank Account");
        System.out.println("Enter Your Name:");
        accountHolderName = so.nextLine();
        System.out.println("Enter Account number:");
        accountNumber = so.nextInt();
        System.out.println("Account Created");
    
    }
    void display(){
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: Rs. "+accountBalance);
    }
    void deposit(){
        System.out.println("Enter Amount to deposit: Rs. ");
        double depositAmt = so.nextDouble();
        accountBalance+=depositAmt;
        System.out.println("Rs. "+depositAmt+" Deposited Successfully");
    }
    void withdraw(){
        System.out.println("Enter Withdrawn amt: Rs. ");
        int withdrawAmt = so.nextInt();
        if(accountBalance>withdrawAmt){
            accountBalance-=withdrawAmt;
            System.out.println("---Amount Withdrawn Succsessfully---\n Account Balance: Rs. "+accountBalance);
        }
        else{
            System.out.println("***Insufficient Amount***");
        }
    }
 public static void main(String[] args) {
    bank bk = new bank();
    int ch;
    while(true){
    System.out.println("Enter Your choice \n 1.deposit\n 2.Withdraw\n 3.View Balance\n 4.exit");
    ch = so.nextInt();
    switch(ch){
        case 1: bk.deposit();break;
        case 2: bk.withdraw();break;
        case 3: bk.display();break;
        case 4: System.exit(0);break;
            
    }
    }
}
}

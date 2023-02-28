package bankaccount;
import java.util.*;
import java.util.logging.Logger;
public class Bank{
    public static final Logger Log = Logger.getLogger("InfoLogging");

    public static void main(String[] args) {
    BankAcc bk = new BankAcc();
    int ch;
    Scanner so = new Scanner(System.in);
    while(true){
    try{

    Log.info("Enter Your choice \n 1.deposit\n 2.Withdraw\n 3.View Balance\n 4.exit");
    ch = so.nextInt();
    switch(ch){
        case 1: bk.deposit();break;
        case 2: bk.withdraw();break;
        case 3: bk.display();break;
        case 4: System.exit(0);break;
        default: System.exit(0); break;     
        }
       }
       catch(InputMismatchException e){
        String exp = "Exception:"+ e;
        Log.info(exp);
        so.nextLine();
    }
    }  
}
}

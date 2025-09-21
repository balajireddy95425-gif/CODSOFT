import java.util.Scanner;
class BankAccount{
    private String accountnumber;
    private String AccountHolderName;
    private double balance;

    BankAccount(String accountnumber,String AccountHolderName,double balance){
        this.accountnumber = accountnumber;
        this.AccountHolderName = AccountHolderName;
        this.balance = balance;
    }
    public void deposite(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("the total balance is:"+balance);
        }
        else{
            System.out.println("invalid amount");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("the available balance is:"+balance);
        }
        else{
            System.out.println("in you account has insufficent balance:");
        }
    }
    public double getBalance(){
        return balance;
    }
    public String getaccountnumber(){
        return accountnumber;
    }
    public String getAccountHolderName(){
        return AccountHolderName;
}
}
 class Main{
    private BankAccount account;
    
    Main(BankAccount account){
        this.account = account;
    }
    public void deposite(double amount){
        account.deposite(amount);
    }
    public void withdraw(double amount){
        account.withdraw(amount);
    }
    public void checkBalance(){
        System.out.println("the availabe balance is");
        account.getBalance();
    }
    public void showmenu(){
        System.out.println("welcome:"+account.getaccountnumber()+"account holder name:"+account.getAccountHolderName());
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("----ATM menu-----");
            System.out.println("1:deposite");
            System.out.println("2:withdraw");
            System.out.println("3:getbalance");
            System.out.println("4:exit");
            System.out.println("enter the choice");
            choice = sc.nextInt();
            switch(choice){
               case 1:
                    System.out.println("deposite the amount");
                    double depamount = sc.nextDouble();
                    deposite(depamount);
                break;
                 case 2:
                    System.out.println("enter the amount");
                    int withdraws = sc.nextInt();
                    withdraw(withdraws);
                break;
                 case 3:
                    System.out.println("the availabele balance");
                    double getavail = sc.nextDouble();
                    deposite(getavail);
                break;
                case 4:
                    System.out.println("Thanking you");
                break;
                default:
                System.out.println("invalid");
            }
        }
            while(choice!=4);
              sc.close();  
        }
    }
public class ATM{
    public static void main(String[]args){
      BankAccount ba = new BankAccount("12345", "Balaji", 1000); 
      Main at = new Main(ba);
      at.showmenu(); 

    }
}
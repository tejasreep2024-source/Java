import java.util.Scanner;



class BankAccount{

    private String  Account_Holder_Name ;

    private int Account_NO;

    private double balance;

    public void setName(String name){
        this.Account_Holder_Name = name;
    }

    public String getName(){
        return Account_Holder_Name;
    }

     public void setAccNo(int AccNo){
        this.Account_NO = AccNo;
    }

    public int getAccNo(){
        return Account_NO;
    }

  
  
    public void setBalance(double Balance){
        this.balance = Balance;
    }

    public double  getBalance(){
        return balance;
    }


    void deposit(double Amount){
        if(Amount > 0){
            balance += Amount;

            System.out.println("Amount " +Amount);
            System.out.println("Current Balance after adding amount " +balance);
        }
    }

    void withdraw(double amount){
        if(amount > 0){
            balance -= amount;
          System.out.println("Amount withdraw " + amount);
          System.out.println("Current Balance after withdraw amount" + balance);
        }
    }

    void display(){
        System.out.println("/n============Customer Details ================");
        System.out.println("Account_Holder_Name : " +Account_Holder_Name);
        System.out.println("Account Number : " +Account_NO);
        System.out.println("Current Balance : " +balance);
   
   
    }


}

public class BankApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
        
        System.out.println("Please Enter Account Holder Name");
        String name = sc.next();
        account.setName(name);


        System.out.println("Please Enter Account Holder Number");
        int  AccNo= sc.nextInt();
        account.setAccNo(AccNo);

         System.out.println("Please Enter the initial Balance");
        double  balance= sc.nextDouble();
        account.setBalance(balance);


        System.out.println("/n========Bank Details================");
        System.out.println("1. Deposit Amount");
        System.out.println("2.Withdraw Amount");
        System.out.println("3.Check Balance");
        System.out.println("4. Display Customer Details");
        System.out.println("5. Exit");

        int choice = sc.nextInt();

        switch(choice) {
            case 1:   System.out.println("1. Deposit Amount");
                      System.out.println("Please Enter the amount");
                      double Amount = sc.nextDouble();
                     account.deposit(Amount); 
                     break;

            case 2:   System.out.println("1. Withdraw Amount");
                      System.out.println("Please Enter the amount");
                      double amount = sc.nextDouble();
                     account.deposit(amount);
                     break;
                     
             case 3:   System.out.println("3. Check  Balance");
                      System.out.println("Current Balance ; " + account.getBalance() );
                      break;

              case 4:   System.out.println("4. Display Customer Details");
                     account.display();
                     break;


             case 5 :  System.out.println("Thank you for Banking with us");
             break;

             default : 
             System.out.println("Invalide Data");


        }



    }
}
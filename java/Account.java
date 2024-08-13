import java.util.Date;

public class Account {
   
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        this.id = 0;
        this.balance = 500.0;
        this.annualInterestRate = 0.07;
        this.dateCreated = new Date();
    }
    
    public Account(int id, double initialBalance){             
        this.id = id;
        this.balance = initialBalance;
        this.annualInterestRate = 0.07;
        this.dateCreated = new Date();
    } 

    // Accessor method for id
    public int getId(){
        return id;
    }
                                                                                                                                                            
    // Mutator method for id
    public void setId(int id){
        this.id = id;
    }

    
    public double getBalance(){
        return balance;
    }

   
    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

  
    public Date getDateCreated() {
        return dateCreated;
    }

    
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 ;
    }

    
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

   
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
   
 
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

   
    public static void main(String[] args) {
        
        Account defaultAccount = new Account();
        System.out.println("Default Account:");
        System.out.println("ID: " + defaultAccount.getId());
        System.out.println("Balance: ₹" + defaultAccount.getBalance());
        System.out.println("Annual Interest Rate: " + (defaultAccount.getAnnualInterestRate() * 100) + "%");
        System.out.println("Date Created: " + defaultAccount.getDateCreated());
        System.out.println("Monthly Interest Rate: " + (defaultAccount.getMonthlyInterestRate() * 100) + "%");
        System.out.println("Monthly Interest: ₹" + defaultAccount.getMonthlyInterest());

        
        Account specificAccount = new Account(12, 1000.0);
        System.out.println("\nSpecific Account:");
        System.out.println("ID: " + specificAccount.getId());
        System.out.println("Balance: ₹" + specificAccount.getBalance());
        System.out.println("Annual Interest Rate: " + (specificAccount.getAnnualInterestRate() * 100) + "%");
        System.out.println("Date Created: " + specificAccount.getDateCreated());
        System.out.println("Monthly Interest Rate: " + (specificAccount.getMonthlyInterestRate() * 100) + "%");
        System.out.println("Monthly Interest: ₹" + specificAccount.getMonthlyInterest());

        
        specificAccount.withdraw(200.0);
        System.out.println("\nAfter withdrawing ₹200:");
        System.out.println("Balance: ₹" + specificAccount.getBalance());

        specificAccount.deposit(300.0);
        System.out.println("After depositing ₹300:");
        System.out.println("Balance: ₹" + specificAccount.getBalance());
    }
}
// use the jdk 7 syntax
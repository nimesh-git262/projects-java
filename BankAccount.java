import java.util.ArrayList;
import java.util.List;

public class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private int pin;
    private double balance;
    private List<Transaction> transactions;

    public BankAccount(String accountNumber, String accountHolderName, int pin, double initialbalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.pin = pin;
        this.balance = initialbalance;
        this.transactions = new ArrayList<>();
    }
    public double getBalance(){
        return balance;
    }
    public boolean validatePin(int inputPin){
        return this.pin == inputPin; 
    }
    public void displayAccountInfo(){
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            transactions.add(new Transaction("Deposit", amount, balance));
            System.out.println("Deposit Successfully" + amount + "added");
        }else{
            System.out.println("Invalid deposit");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount, balance));
            System.out.println("Withdraw Successfully" + amount + "deducted");
        }else if(amount > balance){
            System.out.println("No transactions found");
        }else{
            System.out.println("Invalid withdraw");
        }
    }
    public void checkBalance(){
        System.out.printf("Current Balance is : %.2fn", balance);
    }
    public void showTransactions(){
        if(transactions.isEmpty()){
            System.out.println("No transactions found");
        }else{
            for (Transaction t : transactions){
                System.out.println(t);
            }
        }
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
}
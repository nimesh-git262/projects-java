import java.util.Scanner;

public class ATM{
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount bankAccount){
        this.account = bankAccount;
        this.scanner = new Scanner(System.in);
    }
    private boolean authenticateUser(){
        System.out.println("Emter your pin");
        String enteredPin = scanner.nextLine();
        return enteredPin.equals("1212");
    }

    public void start(){
        account.displayAccountInfo();
        System.out.println("Welcome to the ATM");
        
        if(authenticateUser()){
            System.out.println("authentication failed...");
            return;
        }

        while(true){
            System.out.println("===ATM Menu===");
            System.out.println("1. Check Balance");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Transaction History");
            System.out.println("6. EXIT");
            System.out.println("choose an option");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("option 1 reached");
                    System.out.println("Balance: " + account.getBalance());
                break;
                case 2:
                     account.checkBalance();
                break;    
                case 3:
                    System.out.println("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                break;
                case 4:
                    System.out.println("Enter withdraw amount");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                break;        
                case 5:
                    account.showTransactions();
                break;
                case 6:
                    System.out.println("Thanks for using our ATM"); 
                break;
                default:
                    System.out.println("Invalid choice! Try again");
            }
        }
    }
}
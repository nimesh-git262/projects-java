public class Main{
    public static void main(String []args){
        BankAccount myAccount = new BankAccount("1212", "nanu", 1414, 500);
        ATM atm = new ATM(myAccount);
        atm.start();
    }
}
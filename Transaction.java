import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction{

    private String type;
    private final double amount;
    private final LocalDateTime timestamp;
    private final double balanceAfter;

    public Transaction(String type, double amount, double balanceAfter){
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.balanceAfter = balanceAfter;
    }
    public String getType(){
        return type;
    }
    public double getAmount(){
        return amount;
    }
    public LocalDateTime getTimestamp(){
        return timestamp;
    }
    public double getBalanceAfter(){
        return balanceAfter;
    }

    public String toString(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-DD-HH:mm:ss");
            return String.format("&s | %s | Amount: %.2f | Balance after: %.2f ", timestamp.format(dtf), type, amount, balanceAfter);
    }
}

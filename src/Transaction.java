
import java.io.Serializable;
import java.time.LocalDateTime;

public class Transaction implements Serializable {
    private String type; // DEPOSIT or WITHDRAWAL
    private double amount;
    private LocalDateTime timestamp;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return type + " of " + amount + " on " + timestamp;
    }
}

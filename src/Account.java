import java.util.ArrayList;
import java.util.List;

public class Account {
	private String accountNumber;
	private String accountHolder;
	private double balance;
	
	private List<Transaction> transactions = new ArrayList<>();
	
	

	public Account(String accountNumber, String accountHolder, double initialDeposit) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = initialDeposit;
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}
	
	public void deposite (double amount) {
		
		balance = balance + amount;
		transactions.add(new Transaction ("DEPOSIT", amount));
		
	}

	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}
}

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccountByNumber(String accountNumber) {
        return accounts.stream()
                .filter(account -> account.getAccountNumber() == accountNumber)
                .findFirst()
                .orElse(null);
    }

    public void displayAccounts() {
        accounts.forEach(System.out::println);
    }

    public void displayAccountTransactions(String accountNumber) {
        Account account = findAccountByNumber(accountNumber);
        if (account != null) {
            account.getTransactions().forEach(System.out::println);
        } else {
            System.out.println("Account not found!");
        }
    }

	public void addAccount(SavingsAccount account) {
		// TODO Auto-generated method stub
		
	}

//	public Account findAccountByNumber1(String accNumber) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}

import java.util.Scanner;

public class BankManagementSystem {
    public static void main(String[] args) throws InsufficientBalanceException {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Account\n2. Deposit\n3. Withdraw\n4. View Transactions\n5. Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter Account Type (1 for Savings, 2 for Current): ");
                int type = scanner.nextInt();
                System.out.println("Enter Account Number, Account Holder, Initial Deposit: ");
                String accNumber = scanner.nextLine();
                String accHolder = scanner.next();
                double deposit = scanner.nextDouble();

                if (type == 1) {
                    bank.addAccount(new SavingsAccount(accNumber, accHolder, deposit));
                } else {
                    bank.addAccount(new CurrentAccount(accNumber, accHolder, deposit));
                }
                System.out.println("Account added successfully!");

            } else if (choice == 2) {
                System.out.println("Enter Account Number and Amount to Deposit:");
                String accNumber = scanner.nextLine();
                double amount = scanner.nextDouble();
                Account account = bank.findAccountByNumber(accNumber);
                if (account != null) {
                    account.deposite(amount);
                    System.out.println("Deposit successful!");
                } else {
                    System.out.println("Account not found!");
                }

            } else if (choice == 3) {
                System.out.println("Enter Account Number and Amount to Withdraw:");
                String accNumber = scanner.nextLine();
                double amount = scanner.nextDouble();
                Account account = bank.findAccountByNumber(accNumber);
                if (account != null) {
                    account.withdraw(amount);
					System.out.println("Withdrawal successful!");
                } else {
                    System.out.println("Account not found!");
                }

            } else if (choice == 4) {
                System.out.println("Enter Account Number:");
         String accNumber = scanner.nextLine();
                bank.displayAccountTransactions(accNumber);

            } else if (choice == 5) {
                System.out.println("Exiting system...");
                break;
            }
        }
        scanner.close();
    }
}

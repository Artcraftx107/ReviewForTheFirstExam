import banking.*;

public class BankTest {
    public static void main(String[] args) {
        // Create a new bank
        Bank bank = new Bank("John Doe");

        // Create and add some accounts to the bank
        BankAccount account1 = new BankAccount("001", 1000);
        BankAccount account2 = new BankAccount("002", 2000);
        bank.addAccount(account1);
        bank.addAccount(account2);

        // Display initial state of the bank
        System.out.println("Initial state of the bank:");
        System.out.println(bank+"\n");

        // Perform transactions
        try {
            // Deposit $500 to all accounts
            bank.setAmount(500);
            bank.depositToAll();
            System.out.println(bank+"\n");

            // Withdraw $200 from account1 and deposit to account2
            bank.setAmount(200);
            bank.withdrawFromAccountTo(account1, account2);
            System.out.println(bank);

            // Withdraw all from account2
            bank.withdrawAll(account2);

            // Display final state of the bank
            System.out.println("\nFinal state of the bank:");
            System.out.println(bank);
        } catch (RuntimeException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}


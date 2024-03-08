public class Main {
  public static void main(String[] args) {
    Bank bank = new Bank("Example Bank", "ABC123");

    // Create accounts
    Account account1 = bank.createAccount("John Doe", "1234567890");
    Account account2 = bank.createAccount("Jane Smith", "0987654321");
    Account account3 = bank.createAccount("Alice Johnson", "9876543210");

    // Deposit balances to accounts
    bank.deposit(account1.getAccountId(), 1000);
    bank.deposit(account2.getAccountId(), 1500);
    bank.deposit(account3.getAccountId(), 2000);

    // Withdraw balances from accounts
    System.out.println();
    bank.withdrawal(account1.getAccountId(), 500);
    bank.withdrawal(account2.getAccountId(), 1000);

    // Transfer funds between accounts
    System.out.println();
    bank.transfer(account2.getAccountId(), account1.getAccountId(), 500);

    System.out.println();

    // Print account details
    System.out.println(account1);
    System.out.println(account2);
    System.out.println(account3);

    // Print bank details
    System.out.println(bank);

    // Print all transactions in bank
    bank.printTransactions();

    // Print account statements
    bank.printStatement(account1.getAccountId());
    bank.printStatement(account2.getAccountId());
    bank.printStatement(account3.getAccountId());
  }
}
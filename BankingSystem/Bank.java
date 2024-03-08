import java.util.ArrayList;
import java.util.List;

public class Bank {
  private String name;
  private String IFSCCode;
  private double totalBalance;
  private int lastAccountNumber = 0;
  private List<Account> accounts;
  private List<Transaction> transactions;

  public Bank(String name, String IFSCCode) {
    this.name = name;
    this.IFSCCode = IFSCCode;
    this.accounts = new ArrayList<>();
    this.transactions = new ArrayList<>();
  }

  public Account createAccount(String ownerName, String mobileNumber) {
    int newAccountNumber = ++lastAccountNumber;
    Account newAccount = new Account(newAccountNumber, ownerName, mobileNumber);
    accounts.add(newAccount);
    return newAccount;
  }

  public void deposit(int accountNumber, double amount) {
    Account account = findAccount(accountNumber);
    if (account == null) {
      System.out.println("Account not found. Deposit failed.");
      return;
    }
    account.creditBalance(amount);
    creditTotalBalance(amount);
    transactions.add(new DepositTransaction(amount, accountNumber));
    System.out.println(String.format("Deposit successful: +$%,.2f Account #%d", amount, accountNumber));
  }

  public void withdrawal(int accountNumber, double amount) {
    Account account = findAccount(accountNumber);
    if (account == null) {
      System.out.println("Account not found. Withdrawal failed.");
      return;
    }
    if (amount > account.getBalance()) {
      System.out.println("Insufficient balance. Withdrawal failed.");
      return;
    }
    account.debitBalance(amount);
    debitTotalBalance(amount);
    transactions.add(new WithdrawalTransaction(amount, accountNumber));
    System.out.println(String.format("Withdrawal successful: -$%,.2f Account #%d", amount, accountNumber));
  }

  public void transfer(int sourceAccountNumber, int destinationAccountNumber, double amount) {
    // Find source account
    Account sourceAccount = findAccount(sourceAccountNumber);
    if (sourceAccount == null) {
      System.out.println("Source account not found. Transfer failed.");
      return;
    }

    // Find destination account
    Account destinationAccount = findAccount(destinationAccountNumber);
    if (destinationAccount == null) {
      System.out.println("Destination account not found. Transfer failed.");
      return;
    }

    // Check if source account has sufficient balance
    if (amount > sourceAccount.getBalance()) {
      System.out.println("Insufficient balance in source account. Transfer failed.");
      return;
    }

    // Perform transfer
    sourceAccount.debitBalance(amount);
    destinationAccount.creditBalance(amount);

    // Add transaction to transaction history
    transactions.add(new TransferTransaction(amount, sourceAccountNumber, destinationAccountNumber));
    System.out.println(String.format("Transfer of $%.2f from Account #%d to Account #%d successful.", amount,
        sourceAccountNumber, destinationAccountNumber));
  }

  private void debitTotalBalance(double amount) {
    setTotalBalance(totalBalance - amount);
  }

  private void creditTotalBalance(double amount) {
    setTotalBalance(totalBalance + amount);
  }

  private void setTotalBalance(double amount) {
    totalBalance = amount;
  }

  private Account findAccount(int accountNumber) {
    for (Account account : accounts) {
      if (account.getAccountId() == accountNumber) {
        return account;
      }
    }
    return null;
  }

  public void printTransactions() {
    System.out.println("Complete list of transactions in bank:");

    for (Transaction transaction : transactions) {
      switch (transaction.getClass().getSimpleName()) {
        case "DepositTransaction":
          DepositTransaction depositTransaction = (DepositTransaction) transaction;
          System.out.println(String.format("Deposit: +$%,.2f Account #%d", depositTransaction.getAmount(),
              depositTransaction.getAccountNumber()));
          break;

        case "WithdrawalTransaction":
          WithdrawalTransaction withdrawalTransaction = (WithdrawalTransaction) transaction;
          System.out.println(String.format("Withdrawal: -$%,.2f Account #%d", withdrawalTransaction.getAmount(),
              withdrawalTransaction.getAccountNumber()));
          break;

        case "TransferTransaction":
          TransferTransaction transferTransaction = (TransferTransaction) transaction;
          System.out.println(
              String.format("Transfer of $%,.2f from Account #%d to Account #%d", transferTransaction.getAmount(),
                  transferTransaction.getSourceAccountNumber(), transferTransaction.getDestinationAccountNumber()));
          break;
      }
    }

    System.out.println();
  }

  public void printStatement(int accountNumber) {
    System.out.println("Statement for Account #" + accountNumber + ":");

    for (Transaction transaction : transactions) {
      switch (transaction.getClass().getSimpleName()) {
        case "DepositTransaction":
          DepositTransaction depositTransaction = (DepositTransaction) transaction;
          if (depositTransaction.getAccountNumber() == accountNumber) {
            System.out.println(String.format("Deposit: +$%,.2f", depositTransaction.getAmount()));
          }
          break;

        case "WithdrawalTransaction":
          WithdrawalTransaction withdrawalTransaction = (WithdrawalTransaction) transaction;
          if (withdrawalTransaction.getAccountNumber() == accountNumber) {
            System.out.println(String.format("Withdrawal: -$%,.2f", withdrawalTransaction.getAmount()));
          }
          break;

        case "TransferTransaction":
          TransferTransaction transferTransaction = (TransferTransaction) transaction;
          if (transferTransaction.getSourceAccountNumber() == accountNumber) {
            System.out.println(String.format("Transferring money to Account #%d: -$%,.2f",
                transferTransaction.getDestinationAccountNumber(), transferTransaction.getAmount()));
          } else if (transferTransaction.getDestinationAccountNumber() == accountNumber) {
            System.out.println(String.format("Received transfer from Account #%d: +$%,.2f",
                transferTransaction.getSourceAccountNumber(), transferTransaction.getAmount()));
          }
          break;
      }
    }

    Account account = findAccount(accountNumber);
    System.out.println("Available Balance: $" + account.getBalance());
    System.out.println();
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Bank details:\n");
    builder.append(String.format("%-14s: %s%n", "Bank Name", name));
    builder.append(String.format("%-14s: %s%n", "IFSC Code", IFSCCode));
    builder.append(String.format("%-14s: %,.2f%n", "Total Balance", totalBalance));
    return builder.toString();
  }
}

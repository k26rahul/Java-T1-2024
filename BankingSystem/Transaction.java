public class Transaction {
  private double amount;

  public Transaction(double amount) {
    this.amount = amount;
  }

  public double getAmount() {
    return amount;
  }
}

class DepositTransaction extends Transaction {
  private int accountNumber;

  public DepositTransaction(double amount, int accountNumber) {
    super(amount);
    this.accountNumber = accountNumber;
  }

  public int getAccountNumber() {
    return accountNumber;
  }
}

class WithdrawalTransaction extends Transaction {
  private int accountNumber;

  public WithdrawalTransaction(double amount, int accountNumber) {
    super(amount);
    this.accountNumber = accountNumber;
  }

  public int getAccountNumber() {
    return accountNumber;
  }
}

class TransferTransaction extends Transaction {
  private int sourceAccountNumber;
  private int destinationAccountNumber;

  public TransferTransaction(double amount, int sourceAccountNumber, int destinationAccountNumber) {
    super(amount);
    this.sourceAccountNumber = sourceAccountNumber;
    this.destinationAccountNumber = destinationAccountNumber;
  }

  public int getSourceAccountNumber() {
    return sourceAccountNumber;
  }

  public int getDestinationAccountNumber() {
    return destinationAccountNumber;
  }
}

public class Account {
  private final int accountNumber;
  private final String ownerName;
  private final String mobileNumber;
  private double balance = 0;

  public Account(int accountNumber, String ownerName, String mobileNumber) {
    this.accountNumber = accountNumber;
    this.ownerName = ownerName;
    this.mobileNumber = mobileNumber;
  }

  public int getAccountId() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void debitBalance(double amount) {
    setBalance(getBalance() - amount);
  }

  public void creditBalance(double amount) {
    setBalance(getBalance() + amount);
  }

  private void setBalance(double balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.format("Account %d details:%n", accountNumber));
    builder.append(String.format("%-14s: %d%n", "Account ID", accountNumber));
    builder.append(String.format("%-14s: %s%n", "Owner Name", ownerName));
    builder.append(String.format("%-14s: %s%n", "Mobile Number", mobileNumber));
    builder.append(String.format("%-14s: %,.2f%n", "Balance", balance));

    return builder.toString();
  }
}

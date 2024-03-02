import java.util.ArrayList;

public class Bank {
  public ArrayList<Account> accounts = new ArrayList<>();
  public ArrayList<Transaction> transactions = new ArrayList<>();
  public double availableBalance = 0;
  public String bankName;
  public int lastInsertedAccountID = 0;
  public int lastInsertedTransactionID = 0;

  public Bank(String bankName) {
    this.bankName = bankName;
  }

  public Account addAccount(String accountHolderName) {
    Account account = new Account(++lastInsertedAccountID, accountHolderName);
    accounts.add(account);
    return account;
  }

  @Override
  public String toString() {
    return String.format("[Bank: %s]", bankName);
  }
}
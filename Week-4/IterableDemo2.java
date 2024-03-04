import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Account {
  private int accountNumber;
  private double balance;

  public Account(int accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  @Override
  public String toString() {
    return "Account Number: " + accountNumber + ", Balance: " + balance;
  }
}

class Bank implements Iterable<Account> {
  private List<Account> accounts;

  public Bank() {
    this.accounts = new ArrayList<>();
  }

  public void addAccount(Account account) {
    accounts.add(account);
  }

  @Override
  public Iterator<Account> iterator() {
    return new BankIterator();
  }

  private class BankIterator implements Iterator<Account> {
    private int currentIndex = 0;

    @Override
    public boolean hasNext() {
      return currentIndex < accounts.size();
    }

    @Override
    public Account next() {
      if (!hasNext()) {
        throw new IllegalStateException("No more accounts to iterate over.");
      }
      Account nextAccount = accounts.get(currentIndex);
      currentIndex++;
      return nextAccount;
    }
  }
}

public class IterableDemo2 {
  public static void main(String[] args) {
    Bank myBank = new Bank();

    myBank.addAccount(new Account(1, 1000));
    myBank.addAccount(new Account(2, 2000));
    myBank.addAccount(new Account(3, 3000));
    myBank.addAccount(new Account(4, 4000));
    myBank.addAccount(new Account(5, 5000));

    Iterator<Account> iterator = myBank.iterator();
    while (iterator.hasNext()) {
      Account account = iterator.next();
      System.out.println(account);
    }
  }
}

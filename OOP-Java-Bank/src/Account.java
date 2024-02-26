import java.util.ArrayList;

class Account {
  private int accountID;
  private String accountHolderName;
  private double currentBalance = 0;
  private ArrayList<Integer> transactions = new ArrayList<>();

  public Account(int accountID, String accountHolderName) {
    this.accountID = accountID;
    this.accountHolderName = accountHolderName;
  }

  public void printStatement() {
    System.out.println("STATEMENT START");
    System.out.printf("Account Holder Name: %s\n", accountHolderName);
    System.out.printf("Account ID: %d\n", accountID);
    System.out.printf("Current Available Balance: %.2f\n", currentBalance);
    System.out.println("Transactions:");

    if (transactions.isEmpty())
      System.out.println("No transactions to display");
    else {
      int transactionNumber = 1;
      for (int transaction : transactions)
        System.out.printf("#%d Transaction ID: %d\n", transactionNumber++, transaction);
    }

    System.out.println("STATEMENT END");
  }

  @Override
  public String toString() {
    return String.format("[Account: %d, %s]", accountID, accountHolderName);
  }
}

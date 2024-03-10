class Bank {
  public static Bank bankObject;

  private Bank() {
    System.out.println("bank constr");
  }

  public static Bank getBank() {
    if (bankObject == null) {
      System.out.println("i am creating a bank");
      Bank.bankObject = new Bank();
    }
    return Bank.bankObject;
  }
}

public class Main {
  public static void main(String[] args) {
    Bank bank1 = Bank.getBank();
    Bank bank2 = Bank.getBank();
    Bank bank3 = Bank.getBank();

    System.out.println(bank1);
    System.out.println(bank2);
    System.out.println(bank3);
  }
}

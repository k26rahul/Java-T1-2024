public class Main {
  public static void main(String[] args) {
    // Bank hdfcBank = new Bank("HDFC Bank");
    Bank sbiBank = new Bank("SBI Bank");

    sbiBank.addAccount("CMD").printStatement();
  }
}
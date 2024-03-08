interface P {
  void print();

  default void print(String text) {
    System.out.println("P interface: default print(String text)");
  }

  default void colorPrint() {
    System.out.println("P interface: default colorPrint()");
  }
}

class Printer implements P {
  public void print() {
    System.out.println("Printer class: print()");
  }
}

class BetterPrinter implements P {
  public void print() {
    System.out.println("BetterPrinter class: print()");
  }

  public void colorPrint() {
    System.out.println("BetterPrinter class: colorPrint()");
  }
}

class ReallyBetterPrinter extends BetterPrinter {
  public void print(String text) {
    System.out.println("ReallyBetterPrinter class: print(String text)");
    System.out.println(text);
  }

  public void playMusic() {
    System.out.println("[ReallyBetterPrinter class: playMusic()]");
  }
}

public class PrinterDemo {
  public static void giveMeSomePrinter(P printer) {
    printer.print("Sanika is super awesome!");
  }

  public static void main(String[] args) {
    Printer myPrinter = new Printer();
    BetterPrinter myBetterPrinter = new BetterPrinter();
    ReallyBetterPrinter myReallyBetterPrinter = new ReallyBetterPrinter();

    /*
     * Demonstrating polymorphism by passing different types of printers to the
     * method.
     */
    giveMeSomePrinter(myPrinter);
    giveMeSomePrinter(myBetterPrinter);
    giveMeSomePrinter(myReallyBetterPrinter);
  }
}

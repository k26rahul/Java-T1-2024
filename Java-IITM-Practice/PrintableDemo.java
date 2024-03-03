interface Printable {
  void print();

  default void print(String text) {
    System.out.println("Printable [default print(text)]");
  }

  default void colorPrint() {
    System.out.println("Printable [default colorPrint]");
  }

  private static void restart() {
    System.out.println("Printable [restart]");
  }

  public static void main(String[] args) {
    Printable.restart();
  }
}

class Printer implements Printable {
  public void print() {
    System.out.println("Printer [print]");
  }
}

class BetterPrinter implements Printable {
  public void print() {
    System.out.println("BetterPrinter [print]");
  }

  public void colorPrint() {
    System.out.println("BetterPrinter [colorPrint]");
  }
}

class ReallyBetterPrinter extends BetterPrinter {
  public void print() {
    System.out.println("ReallyBetterPrinter [print]");
  }

  public void print(String text) {
    System.out.println("ReallyBetterPrinter [print(text)] " + text);
  }

  public void playMusic() {
    System.out.println("ReallyBetterPrinter [playMusic]");
  }
}

public class PrintableDemo {

  public static void giveMeSomePrinter(Printable printer) {
    printer.print("some text");
  }

  public static void main(String[] args) {
    // Printable.main(new String[] {});

    Printer myPrinter = new Printer();
    // myPrinter.print();
    // myPrinter.colorPrint();

    BetterPrinter myBetterPrinter = new BetterPrinter();
    // myBetterPrinter.print();
    // myBetterPrinter.colorPrint();

    ReallyBetterPrinter somePrinter = new ReallyBetterPrinter();
    // somePrinter.print();
    // somePrinter.playMusic();
    // somePrinter.print("some text");

    giveMeSomePrinter(myPrinter);
    giveMeSomePrinter(myBetterPrinter);
    giveMeSomePrinter(somePrinter);
  }
}
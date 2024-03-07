class IntegerBox {
  private int item; // declare (not initialize) default initialize=0

  public IntegerBox(int item) {
    this.item = item;
  }

  public int getItem() {
    return item;
  }
}

class DoubleBox {
  private double item; // declare (not initialize) default initialize=0

  public DoubleBox(double item) {
    this.item = item;
  }

  public double getItem() {
    return item;
  }
}

class StringBox {
  private String item; // declare (not initialize) default initialize=0

  public StringBox(String item) {
    this.item = item;
  }

  public String getItem() {
    return item;
  }
}

public class GenericsHack2 {
  public static void main(String[] args) {
    IntegerBox myIntegerBox = new IntegerBox(13);
    System.out.println(myIntegerBox.getItem());

    DoubleBox myDoubleBox = new DoubleBox(72.18);
    System.out.println(myDoubleBox.getItem());

    StringBox myStringBox = new StringBox("hello");
    System.out.println(myStringBox.getItem());
  }
}
class Box {
  private int item; // declare (not initialize) default initialize=0
  private double dItem;

  public Box(int item) {
    this.item = item;
  }

  public Box(double item) {
    this.dItem = item;
  }

  public int getItem(int garbage) {
    return item;
  }

  public double getItem(double garbage) {
    return dItem;
  }
}

public class GenericsHack {

  public static void main(String[] args) {
    Box myDoubleBox = new Box(13.55);
    System.out.println(myDoubleBox.getItem(0.0));

    Box myIntegerBox = new Box(13);
    System.out.println(myIntegerBox.getItem(0));

    // int x = 17; // declare+initialize
    // int x; // declare
    // x = 17; // initialize
    // System.out.println(x);
  }
}
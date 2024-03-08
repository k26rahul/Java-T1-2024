import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntegerBox {
  private int item;

  public IntegerBox(int item) {
    this.item = item;
  }

  public int getItem() {
    return item;
  }

  public void print() {
    System.out.println(item);
  }
}

class StringBox {
  private String item;

  public StringBox(String item) {
    this.item = item;
  }

  public String getItem() {
    return item;
  }

  public void print() {
    System.out.println(item);
  }
}

class Box<T extends Number> {
  T item;

  public Box(T item) {
    this.item = item;
  }

  public T getItem() {
    return item;
  }

  public void print() {
    System.out.println(item);
  }

  public static <T> T echo(T item) {
    return item;
  }

  public static <T> T echoList(List<? extends T> list) {
    return list.get(0);
  }

  public void giveMeAList(List<? extends Number> list) {
    System.out.println("[giveMeAList] " + list.get(0));
  }
}

public class Generics2 {

  public static void main(String[] args) {
    IntegerBox myIntegerBox = new IntegerBox(5);
    int intItem = myIntegerBox.getItem();
    myIntegerBox.print();
    System.out.println(intItem + 2);

    StringBox myStringBox = new StringBox("hello");
    String stringItem = myStringBox.getItem();
    myStringBox.print();
    System.out.println(stringItem + " world");

    Box<Double> myBox = new Box<>(91.23);
    double item = myBox.getItem();
    myBox.print();
    System.out.println(item + 2);

    System.out.println(Box.echo("happy fox"));

    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3));
    System.out.println(Box.echoList(arrayList));

    ArrayList<Double> arrayList2 = new ArrayList<>(Arrays.asList(1.44, 2., 3.));
    System.out.println(Box.echoList(arrayList2));

    ArrayList<String> arrayList3 = new ArrayList<>(Arrays.asList("ok", "lol"));
    System.out.println(Box.echoList(arrayList3));

    myBox.giveMeAList(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
  }
}
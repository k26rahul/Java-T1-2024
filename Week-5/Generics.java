// Generics
// class Box<T> [exact type T]

// Generics subtyping
// class Box<T extends Number>
// bound type T, (upper) bounded to Number (supertype)

// bounded parameter <T extends Number>
class Box<T extends Number> {
  private T item;

  public Box(T item) {
    this.item = item;
  }

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }
}

public class Generics {
  public static void main(String[] args) {
    Box<Integer> myIntegerBox = new Box<>(19);
    System.out.println(myIntegerBox.getItem());

    // Box<String> myStringBox = new Box<>("hello");
    // System.out.println(myStringBox.getItem());

    // Box<Boolean> myBooleanBox = new Box<>(false);
    // System.out.println(myBooleanBox.getItem());

    // String x = myStringBox.getItem();
    // boolean y = myBooleanBox.getItem();

    // // whats type of myBooleanBox? Ans. Box<Boolean>
    // // whats type of myStringBox? Ans. Box<String>

    // myBooleanBox.setItem(true); // setItem(Boolean)
    // myStringBox.setItem("lol"); // setItem(String)

    // Boolean boolean
    // primitives => wrapper classes available
    // boolean (primitive) => Boolean (wrapper class)
    // boolean x = false;

    // boolean k = false;
    // Boolean x = Boolean.valueOf(k); // boxing (k primitive) -> (x Box)
    // boolean y = x; // unboxing (x Box) -> (y primitive)
    // System.out.println(y);

    // int a = 16;
    // Integer b = Integer.valueOf(a); // boxing (a primitive) -> (b Box)
    // int c = b; // unboxing (b Box) -> (c primitive)
    // System.out.println(c);
  }
}
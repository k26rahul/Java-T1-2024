// Code before 2014 (Java 8) Generics weren't available ❌
// Code after 2014 (Java 8) Generics were introduced ✔️🎁

// Source (type params <T>) -> Compiler -> Byte code (type params <T> are removed) -> JRE
// Generics erasure -> removed/erased type params

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Box<T> {
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

public class TypeErasure {
  public static void main(String[] args) {
    String[] stringArray = new String[] { "hello", "Sanika" };
    Integer[] intArray = new Integer[] { 1, 2, 3 };

    // System.out.println(stringArray.getClass());
    // System.out.println(intArray.getClass());

    // whats type of myStringBox? Ans. Box<String>
    Box<String> myStringBox = new Box<>("hello");
    // System.out.println(myStringBox.getItem());

    // whats type of myBooleanBox? Ans. Box<Boolean>
    Box<Boolean> myBooleanBox = new Box<>(false);
    // System.out.println(myBooleanBox.getItem());

    // System.out.println(myStringBox.getClass()); // expected: Box<String> got: Box
    // System.out.println(myBooleanBox.getClass()); // expected: Box<Boolean> got:
    // Box

    List<?> myList;

    myList = new ArrayList<Integer>();
    System.out.println(myList.getClass()); // expected: ArrayList<Integer>

    myList = new ArrayList<String>();
    System.out.println(myList.getClass()); // expected: ArrayList<String>

    myList = new LinkedList<Integer>();
    System.out.println(myList.getClass());

    myList = new LinkedList<String>();
    System.out.println(myList.getClass());
  }
}
import java.util.Arrays;

// By adding @SuppressWarnings("unchecked"), you're indicating to the compiler that you're aware of
// the unchecked cast and it's safe in this context.
@SuppressWarnings("unchecked")
class Stack<T> {
  private T[] values;
  private int count;

  public Stack(int capacity) {
    // In Java, you can't directly create arrays with a generic type like T. Arrays in Java are
    // covariant, meaning that an array of a supertype reference can hold references to objects of
    // its subtype. However, generics in Java are invariant, meaning that a Stack<Integer> is not a
    // subtype of Stack<Object> even though Integer is a subtype of Object.
    values = (T[]) new Object[capacity];
  }

  public boolean isEmpty() {
    return count == 0;
  }

  public void push(T value) {
    values[count++] = value;
  }

  public T pop() {
    if (isEmpty()) {
      throw new IllegalStateException("Stack is empty");
    }
    T valueToReturn = values[count - 1];

    T[] newValues = (T[]) new Object[values.length];
    System.arraycopy(values, 0, newValues, 0, count - 1);
    values = newValues;

    count--;
    return valueToReturn;
  }

  public int size() {
    return count;
  }

  @Override
  public String toString() {
    return Arrays.toString(Arrays.copyOfRange(values, 0, count));
  }
}


public class StackDemo {
  public static void main(String[] args) {
    // Stack<Integer> stack = new Stack<>(10);
    // stack.push(10);
    // stack.push(20);
    // stack.push(30);
    // System.out.println(stack);
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // // stack.push("40");
    // stack.push(50);
    // System.out.println(stack);
    // System.out.println(stack.size());

    Stack<String> stack = new Stack<>(10);
    stack.push("Sanika");
    stack.push("Rahul");
    stack.push("Harikesh");
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack);
    System.out.println(stack.size());
  }
}

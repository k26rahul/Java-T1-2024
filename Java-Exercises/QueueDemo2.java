import java.util.Arrays;

@SuppressWarnings("unchecked")
class Queue<T> {
  private T[] values;
  private int count;
  private int capacity;

  public Queue(int capacity) {
    values = (T[]) new Object[capacity];
    this.capacity = capacity;
  }

  public boolean isEmpty() {
    return count == 0;
  }

  public void enqueue(T value) {
    if (count >= capacity) {
      throw new IllegalStateException("Stack is full");
    }
    values[count++] = value;
  }

  public T dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("Stack is empty");
    }
    T valueToReturn = values[0];

    T[] newValues = (T[]) new Object[capacity];
    System.arraycopy(values, 1, newValues, 0, count - 1);
    values = newValues;

    count--;
    return valueToReturn;
  }

  @Override
  public String toString() {
    return Arrays.toString(Arrays.copyOf(values, count));
  }
}


public class QueueDemo2 {
  public static void main(String[] args) {
    Queue<Integer> queue = new Queue<>(5);
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());

    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.enqueue(30);
    queue.enqueue(30);
    System.out.println(queue.dequeue());
    queue.enqueue(30);
    // queue.enqueue(30);
    System.out.println(queue);
  }
}

import java.util.Arrays;

class Queue {
  private int[] values;
  private int count;
  private int capacity;

  public Queue(int capacity) {
    values = new int[capacity];
    this.capacity = capacity;
  }

  public boolean isEmpty() {
    return count == 0;
  }

  public void enqueue(int value) {
    if (count >= capacity) {
      throw new IllegalStateException("Stack is full");
    }
    values[count++] = value;
  }

  public int dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("Stack is empty");
    }
    int valueToReturn = values[0];

    int[] newValues = new int[capacity];
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


public class QueueDemo {
  public static void main(String[] args) {
    Queue queue = new Queue(5);
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
    queue.enqueue(30);
    System.out.println(queue);
  }
}

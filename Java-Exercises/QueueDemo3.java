import java.util.Arrays;
import java.util.Iterator;

@SuppressWarnings("unchecked")
class Queue<T> implements Iterable<T> {
  private T[] values;
  private int count;
  private int capacity;
  private int front = -1;
  private int rear = -1;

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
    rear = ++rear % capacity;
    values[rear] = value;
    count++;
  }

  public T dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("Stack is empty");
    }
    front = ++front % capacity;
    T valueToReturn = values[front];
    count--;
    return valueToReturn;
  }

  @Override
  public String toString() {
    T[] valuesToPrint = (T[]) new Object[count];
    int pointer = front;
    for (int i = 0; i < count; i++) {
      pointer = ++pointer % capacity;
      valuesToPrint[i] = values[pointer];
    }
    return Arrays.toString(valuesToPrint);
  }

  @Override
  public Iterator<T> iterator() {
    return new QueueIterator<T>(values, count, capacity, front);
  }
}


class QueueIterator<T> implements Iterator<T> {
  private T[] values;
  private int count;
  private int front;
  private int steps;
  private int capacity;

  public QueueIterator(T[] values, int count, int capacity, int front) {
    this.values = values;
    this.count = count;
    this.front = front;
    this.capacity = capacity;
  }

  @Override
  public boolean hasNext() {
    return steps < count;
  }

  @Override
  public T next() {
    front = ++front % capacity;
    steps++;
    return values[front];
  }
}


public class QueueDemo3 {
  public static void main(String[] args) {
    Queue<Integer> queue = new Queue<>(5);
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.enqueue(40);
    queue.enqueue(50);
    System.out.println(queue);
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    Iterator<Integer> itr = queue.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    // Queue<Integer> queue = new Queue<>(5);
    // queue.enqueue(10);
    // queue.enqueue(20);
    // queue.enqueue(30);
    // System.out.println(queue.dequeue());
    // System.out.println(queue.dequeue());
    // System.out.println(queue.dequeue());
    // queue.enqueue(10);
    // queue.enqueue(20);
    // queue.enqueue(30);
    // queue.enqueue(40);
    // queue.enqueue(50);
    // System.out.println(queue);
    // System.out.println(queue.dequeue());
    // System.out.println(queue.dequeue());
    // System.out.println(queue.dequeue());
    // System.out.println(queue.dequeue());
    // System.out.println(queue.dequeue());
    // System.out.println(queue);
    // queue.enqueue(30);
    // queue.enqueue(40);
    // queue.enqueue(50);
    // System.out.println(queue);

    // Queue<Integer> queue = new Queue<>(5);
    // queue.enqueue(10);
    // queue.enqueue(20);
    // queue.enqueue(30);
    // System.out.println(queue.dequeue());
    // System.out.println(queue.dequeue());
    // System.out.println(queue.dequeue());

    // queue.enqueue(10);
    // queue.enqueue(20);
    // queue.enqueue(30);
    // queue.enqueue(30);
    // queue.enqueue(30);
    // System.out.println(queue.dequeue());
    // queue.enqueue(30);
    // // queue.enqueue(30);
    // System.out.println(queue);
  }
}

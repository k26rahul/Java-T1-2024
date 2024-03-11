import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

@SuppressWarnings("unchecked")
class Queue<T> implements Iterable<T> {
  private ArrayList<T> values;
  private int count;
  private int capacity;
  private int front = -1;
  private int rear = -1;

  public Queue(int capacity) {
    values = new ArrayList<>(capacity);
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
    if (rear < values.size())
      values.set(rear, value);
    else
      values.add(rear, value);
    // values[rear] = value;
    count++;
  }

  public T dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("Stack is empty");
    }
    front = ++front % capacity;
    T valueToReturn = values.get(front);
    // T valueToReturn = values[front];
    count--;
    return valueToReturn;
  }

  @Override
  public String toString() {
    T[] valuesToPrint = (T[]) new Object[count];
    int pointer = front;
    for (int i = 0; i < count; i++) {
      pointer = ++pointer % capacity;
      valuesToPrint[i] = values.get(pointer);
      // valuesToPrint[i] = values[pointer];
    }
    return Arrays.toString(valuesToPrint);
  }

  @Override
  public Iterator<T> iterator() {
    return new QueueIterator<T>(values, count, capacity, front);
  }

  public ArrayList<T> getValues() {
    return values;
  }
}


@SuppressWarnings("unchecked")
class QueueIterator<T> implements Iterator<T> {
  private ArrayList<T> values;
  private int count;
  private int front;
  private int steps;
  private int capacity;

  public QueueIterator(ArrayList<T> values, int count, int capacity, int front) {
    this.values = (ArrayList<T>) values.clone();
    this.count = count;
    this.capacity = capacity;
    this.front = front;
  }

  @Override
  public boolean hasNext() {
    return steps < count;
  }

  @Override
  public T next() {
    front = ++front % capacity;
    steps++;
    return values.get(front);
    // return values[front];
  }
}


public class QueueDemo4 {
  public static void main(String[] args) {
    Queue<Integer> queue = new Queue<>(5);
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.enqueue(40);
    queue.enqueue(50);
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.enqueue(60);
    queue.enqueue(70);
    queue.enqueue(80);

    // System.out.println(queue.getValues());
    System.out.println(queue);
    // queue.enqueue(40);
    // queue.enqueue(50);
    // System.out.println(queue);
    // queue.dequeue();
    // queue.dequeue();
    // queue.dequeue();
    // queue.enqueue(10);
    // queue.enqueue(20);
    // queue.enqueue(30);
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

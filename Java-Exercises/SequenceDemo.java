import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class Sequence implements Iterable<Integer> {
  int[] storage;
  int size;

  public Sequence(int capacity) {
    storage = new int[capacity];
  }

  public void add(int x) {
    storage[size] = x;
    size++;
  }

  public String toString() {
    return Arrays.toString(storage);
  }

  public Iterator<Integer> iterator() {
    return new SequenceIterator(storage, size);
  }
}

class SequenceIterator implements Iterator<Integer> {
  int[] storage;
  int size;
  int pointer;

  public SequenceIterator(int[] storage, int size) {
    this.storage = storage;
    this.size = size;
  }

  public boolean hasNext() {
    return pointer < size;
  }

  public Integer next() {
    return storage[pointer++];
  }
}

public class SequenceDemo {
  public static void main(String[] args) {
    Sequence sequence = new Sequence(10);

    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      sequence.add(scanner.nextInt());
    }

    System.out.println(sequence);

    for (int x : sequence) {
      System.out.println(x);
    }

    // Iterator<Integer> itr = sequence.iterator();
    // while (itr.hasNext()) {
    // System.out.println(itr.next());
    // }
    scanner.close();
  }
}

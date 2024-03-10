// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Iterator;
// import java.util.LinkedList;
// import java.util.List;

// import java.util.Arrays;
// import java.util.HashSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Map.Entry;

class IntegerBox implements Iterable<Integer> {
  private LinkedList<Integer> list = new LinkedList<>();

  IntegerBox(int[] list) {
    for (int x : list) {
      this.list.add(x);
    }
  }

  int getFirst() {
    return list.get(0);
  }

  public Iterator<Integer> iterator() {
    return new IntegerBoxItr(list);
  }
}

class IntegerBoxItr implements Iterator<Integer> {
  LinkedList<Integer> list;
  int pointer = 0;

  public IntegerBoxItr(LinkedList<Integer> list) {
    this.list = list;
  }

  public boolean hasNext() {
    return pointer <= list.size() - 1;
  }

  public Integer next() {
    return list.get(pointer++);
  }
}

public class IterableDemo {

  public static void main(String[] args) {
    // IntegerBox myIntegerBox = new IntegerBox(new int[] { 10, 20, 30 });
    // System.out.println(myIntegerBox.getFirst());

    // Iterable: contract for "for-each" functionality
    // Implementing classes enjoys the benefit of "for-each"
    // for-each: available for arrays (e.g. int[]) and subtypes of Iterable
    // for (int x : myIntegerBox) {
    // System.out.println(x);
    // }

    // HashSet<String> myHashSet = new HashSet<>(Arrays.asList("hello", "Sanika"));
    // myHashSet.add("hello");
    // System.out.println(myHashSet.size());

    HashMap<String, Integer> myHashMap = new HashMap<>();
    myHashMap.put("Sanika", 95);
    myHashMap.put("Rahul", 70);
    myHashMap.put("HarikeshWSD", 75);
    myHashMap.put("HarikeshWSD", 85);
    System.out.println(myHashMap.get("HarikeshWSD"));

    // System.out.println(myHashMap);
    Set<String> keys = myHashMap.keySet();
    System.out.println(keys);

    Collection<Integer> values = myHashMap.values();
    System.out.println(values);

    Set<Entry<String, Integer>> entries = myHashMap.entrySet();
    System.out.println(entries);
    for (Entry<String, Integer> entry : entries) {
      System.out.println(entry);
    }
    // for (String key : keys) {
    // System.out.println(key);
    // }

    // Iterator<Integer> itr = myIntegerBox.iterator();
    // while (itr.hasNext()) {
    // System.out.println(itr.next());
    // }
    // System.out.println(itr.hasNext());
    // System.out.println(itr.next());

    // System.out.println(itr.hasNext());
    // System.out.println(itr.next());

    // System.out.println(itr.hasNext());
    // System.out.println(itr.next());

    // System.out.println(itr.hasNext());

    // Iterable: for-each
    // Collection: add(item), remove(item), contains(item)
    // List: index

    // LinkedList<Integer> myList = new LinkedList<>();
    // myList.add(10);
    // myList.add(20);
    // myList.add(30);
    // System.out.println(myList.get(0));

    // ArrayList<String> myList = new ArrayList<>(Arrays.asList("hello", "Sanika"));
    // System.out.println(myList.get(0));
    // System.out.println(myList.get(1));

    // for (int x : myList) {
    // System.out.println(x);
    // }

    // Iterator itr = myList.iterator();
    // while (itr.hasNext()) {
    // System.out.println(itr.next());
    // }
  }
}
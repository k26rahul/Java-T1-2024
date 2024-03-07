import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
  public static void main(String[] args) {
    // Creating a HashSet
    Set<String> hashSet = new HashSet<>();

    // Adding elements
    hashSet.add("Apple");
    hashSet.add("Banana");
    hashSet.add("Orange");

    // Displaying elements
    System.out.println("HashSet: " + hashSet);

    // Removing an element
    hashSet.remove("Banana");
    System.out.println("HashSet after removing Banana: " + hashSet);

    // Checking if an element exists
    System.out.println("Contains Orange: " + hashSet.contains("Orange"));

    // Iterating over elements using iterator
    System.out.println("Iterating over elements using Iterator:");
    Iterator<String> iterator = hashSet.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    // Iterating over elements using enhanced for loop
    System.out.println("Iterating over elements using Enhanced for loop:");
    for (String element : hashSet) {
      System.out.println(element);
    }

    // Size of HashSet
    System.out.println("Size of HashSet: " + hashSet.size());

    // Clearing HashSet
    hashSet.clear();
    System.out.println("HashSet after clearing: " + hashSet);

    // Checking if HashSet is empty
    System.out.println("Is HashSet empty: " + hashSet.isEmpty());
  }
}

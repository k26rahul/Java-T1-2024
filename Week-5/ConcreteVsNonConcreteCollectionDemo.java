import java.util.List;
import java.util.ArrayList;

import java.util.Set;
import java.util.HashSet;

import java.util.Map;
import java.util.HashMap;

public class ConcreteVsNonConcreteCollectionDemo {
  public static void main(String[] args) {
    // Concrete collections (specific implementations)
    ArrayList<String> concreteList = new ArrayList<>();
    concreteList.add("Apple");
    concreteList.add("Banana");

    HashSet<Integer> concreteSet = new HashSet<>();
    concreteSet.add(10);
    concreteSet.add(20);

    HashMap<String, Integer> concreteMap = new HashMap<>();
    concreteMap.put("One", 1);
    concreteMap.put("Two", 2);

    // Non-concrete collections (interfaces)
    List<String> nonConcreteList = new ArrayList<>();
    nonConcreteList.add("Orange");
    nonConcreteList.add("Mango");

    Set<Integer> nonConcreteSet = new HashSet<>();
    nonConcreteSet.add(30);
    nonConcreteSet.add(40);

    Map<String, Integer> nonConcreteMap = new HashMap<>();
    nonConcreteMap.put("Three", 3);
    nonConcreteMap.put("Four", 4);

    /*
     * ArrayList, HashSet, and HashMap are concrete collections (specific
     * implementations) of the List, Set, and Map interfaces respectively. They
     * directly instantiate the concrete classes.
     * 
     * List, Set, and Map are non-concrete collections (interfaces). They are
     * declared as interfaces, and instances of concrete classes (ArrayList,
     * HashSet, HashMap) are assigned to them.
     */

    // Print contents
    System.out.println("Concrete List: " + concreteList);
    System.out.println("Concrete Set: " + concreteSet);
    System.out.println("Concrete Map: " + concreteMap);
    System.out.println("Non-concrete List: " + nonConcreteList);
    System.out.println("Non-concrete Set: " + nonConcreteSet);
    System.out.println("Non-concrete Map: " + nonConcreteMap);
  }
}

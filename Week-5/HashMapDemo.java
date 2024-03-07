import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main(String[] args) {
    // Creating a HashMap
    Map<String, Integer> hashMap = new HashMap<>();

    // Adding key-value pairs
    hashMap.put("Alice", 25);
    hashMap.put("Bob", 30);
    hashMap.put("Charlie", 35);

    // Accessing elements
    System.out.println("Value for key Bob: " + hashMap.get("Bob"));

    // Checking if a key exists
    System.out.println("Contains key Alice: " + hashMap.containsKey("Alice"));

    // Checking if a value exists
    System.out.println("Contains value 30: " + hashMap.containsValue(30));

    // Removing a key-value pair
    hashMap.remove("Charlie");
    System.out.println("HashMap after removing Charlie: " + hashMap);

    // Iterating over keys
    System.out.println("Keys in HashMap:");
    for (String key : hashMap.keySet()) {
      System.out.println(key);
    }

    // Iterating over values
    System.out.println("Values in HashMap:");
    for (Integer value : hashMap.values()) {
      System.out.println(value);
    }

    // Iterating over key-value pairs
    System.out.println("Key-Value pairs in HashMap:");
    for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    // Size of HashMap
    System.out.println("Size of HashMap: " + hashMap.size());

    // Clearing HashMap
    hashMap.clear();
    System.out.println("HashMap after clearing: " + hashMap);

    // Checking if HashMap is empty
    System.out.println("Is HashMap empty: " + hashMap.isEmpty());
  }
}

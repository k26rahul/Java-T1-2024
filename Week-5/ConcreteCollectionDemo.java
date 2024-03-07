import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class ConcreteCollectionDemo {
    public static void main(String[] args) {
        // ArrayList - Concrete implementation of List interface
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList);

        // HashSet - Concrete implementation of Set interface
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        System.out.println("HashSet: " + hashSet);

        // HashMap - Concrete implementation of Map interface
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println("HashMap: " + hashMap);
    }
}

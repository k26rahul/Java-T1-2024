import java.util.ArrayList;
import java.util.List;

/* 
 * type erasure in action:
 * the generic type information (String and Integer) is erased during compilation,
 * and the runtime type of both lists is simply ArrayList, without any generic type information.
 */

public class TypeErasureDemo {
  public static void main(String[] args) {
    // Create a list of strings
    List<String> stringList = new ArrayList<>();
    stringList.add("Hello");
    stringList.add("World");

    // Create a list of integers
    List<Integer> integerList = new ArrayList<>();
    integerList.add(10);
    integerList.add(20);

    // Check the types of the lists
    System.out.println("Type of stringList: " + stringList.getClass().getName());
    System.out.println("Type of integerList: " + integerList.getClass().getName());

    // Check if both lists are of the same type
    System.out.println("Are the lists of the same type? " + (stringList.getClass() == integerList.getClass()));

    // Using reflection to inspect generic type information
    try {
      java.lang.reflect.Method addMethod = stringList.getClass().getMethod("add", Object.class);
      System.out.println(addMethod); // Output: public boolean java.util.ArrayList.add(java.lang.Object)
      /*
       * The method signature returned by reflection (public boolean
       * java.util.ArrayList.add(java.lang.Object)) shows that the parameter type is
       * Object, not String, despite the fact that the original ArrayList instance is
       * declared to hold String elements. This is another demonstration of type
       * erasure affecting the reflection API.
       */
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }
  }
}

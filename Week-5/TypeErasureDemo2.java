import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

class GenericList<T> {
  private List<T> items = new ArrayList<>();

  public void add(T item) {
    items.add(item);
  }

  public List<T> getItems() {
    return items;
  }
}

public class TypeErasureDemo2 {
  public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
    GenericList<Integer> intList = new GenericList<>();
    intList.add(10);
    intList.add(20);

    GenericList<String> strList = new GenericList<>();
    strList.add("Hello");
    strList.add("World");

    printFieldType(intList);
    printFieldType(strList);

    // Normal String array
    String[] stringArray = new String[5];
    System.out.println("Generic type of String array: " +
        getComponentType(stringArray));

    // Normal Integer array
    Integer[] intArray = new Integer[5];
    System.out.println("Generic type of Integer array: " +
        getComponentType(intArray));
  }

  private static <T> void printFieldType(GenericList<T> list) throws NoSuchFieldException {
    Field itemsField = list.getClass().getDeclaredField("items");
    System.out.println("Class name: " + list.getClass().getName());
    System.out.println("Type of items field: " + itemsField.getGenericType());
  }

  private static <T> String getComponentType(T array) {
    return Array.newInstance(array.getClass().getComponentType(), 0).getClass().getName();
  }
}

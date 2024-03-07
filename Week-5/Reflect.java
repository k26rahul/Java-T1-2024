// variable.getClass() => get the `classObj` of variable

import java.lang.reflect.Modifier;

public class Reflect {
  public static void main(String[] args) throws ClassNotFoundException {
    String message = "hello";

    Class<?> messageClass = message.getClass(); // messageClass is classObj

    System.out.println(messageClass); // class java.lang.String
    System.out.println(messageClass.getName()); // java.lang.String
    System.out.println(messageClass.getSimpleName()); // String

    Package messageClassPackage = messageClass.getPackage();
    System.out.println(messageClassPackage.getName());

    int messageClassModifiers = messageClass.getModifiers();
    System.out.println(Modifier.toString(messageClassModifiers));

    System.out.println(messageClass.getSuperclass().getName());
  }
}
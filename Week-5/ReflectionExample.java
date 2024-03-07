import java.lang.reflect.*;

public class ReflectionExample {

  public static void main(String[] args) throws ClassNotFoundException {
    printClassInfo("java.lang.String");
  }

  public static void printClassInfo(String className) throws ClassNotFoundException {
    Class<?> myClass = Class.forName(className);
    print("Class Name", myClass.getName());
    Package classPackage = myClass.getPackage();
    print("Package Name", classPackage.getName());
    print("Modifiers", Modifier.toString(myClass.getModifiers()));
    print("Superclass", myClass.getSuperclass().getName());
    printImplementedInterfaces(myClass.getInterfaces());
    printConstructors(myClass.getConstructors());
    printMethods(myClass.getMethods());
    printFields(myClass.getFields());
  }

  private static void print(String title, String value) {
    System.out.println(title + ": " + value);
  }

  private static void printImplementedInterfaces(Class<?>[] interfaces) {
    System.out.println("Implemented Interfaces:");
    for (Class<?> iface : interfaces) {
      System.out.println("\t" + iface.getName());
    }
  }

  private static void printConstructors(Constructor<?>[] constructors) {
    System.out.println("Constructors:");
    for (Constructor<?> constructor : constructors) {
      System.out.println("\t" + constructor.toString());
    }
  }

  private static void printMethods(Method[] methods) {
    System.out.println("Methods:");
    for (Method method : methods) {
      System.out.println("\t" + method.toString());
    }
  }

  private static void printFields(Field[] fields) {
    System.out.println("Fields:");
    for (Field field : fields) {
      System.out.println("\t" + field.toString());
    }
  }
}

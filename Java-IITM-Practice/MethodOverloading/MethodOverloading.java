class MathOperations {
  public MathOperations() {
    System.out.println("You just created an instance of MathOperations.");
  }

  public int add(int a, int b) {
    return a + b;
  }

  public int add(String a, String b) {
    // Since the method signature requires an integer return type,
    // a placeholder integer value (500) is returned for testing purposes.
    return 500;
  }

  public int add(int a, int b, int c) {
    return a + b + c;
  }
}

public class MethodOverloading {
  public static void main(String[] args) {
    // Syntax to create an instance of a class: type name = new constructor();
    // Creating an instance of MathOperations class
    MathOperations math = new MathOperations();

    // Calling instance method and displaying the result
    System.out.println("int add(int a, int b): " + math.add(10, 15));

    // Calling [another] instance method with same name but different parameters
    System.out.println("int add(String a, String b): " + math.add("hello", "world"));

    // Calling [yet another] instance method with the same name but different
    // parameters
    System.out.println("int add(int a, int b, int c): " + math.add(10, 15, 20));

    // math.add(0, 0); // non-static
    // MathOperations.add(0, 0); // static
  }
}

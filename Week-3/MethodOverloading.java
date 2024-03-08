class MathOperations {
  public int add(int a, int b) {
    return a + b;
  }

  public String add(String a, String b) {
    return a + b;
  }

  public String add(String a, int b) {
    return a + b;
  }

  public String add(int a, String b) {
    return a + b;
  }

  public int add(int a, int b, int c) {
    return a + b + c;
  }
}

public class MethodOverloading {
  public static void main(String[] args) {
    MathOperations math = new MathOperations();

    System.out.println(math.add(10, 15));
    System.out.println(math.add("hello", "world"));
    System.out.println(math.add("hello", 123));
    System.out.println(math.add(123, "hello"));
    System.out.println(math.add(10, 15, 20));
  }
}
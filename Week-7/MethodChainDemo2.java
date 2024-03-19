public class MethodChainDemo2 {

  public static void printCauses(Throwable throwable) {
    System.out.println("Caused by:");
    Throwable cause = throwable;
    while (cause != null) {
      System.out.println(cause.getMessage());
      cause = cause.getCause();
    }
  }

  public static void main(String[] args) {
    try {
      methodOne();
    } catch (Throwable t) {
      System.out.println("Program crashed due to: " + t.getMessage());
      // t.printStackTrace();
      printCauses(t);
    }
  }

  public static void methodOne() {
    try {
      methodTwo();
      System.out.println("methodOne successful");
    } catch (Throwable e) {
      throw new RuntimeException("Error occurred in methodOne", e);
    }
  }

  public static void methodTwo() {
    try {
      methodThree();
      System.out.println("methodTwo successful");
    } catch (Throwable e) {
      throw new RuntimeException("Error occurred in methodTwo", e);
    }
  }

  public static void methodThree() {
    try {
      throw new RuntimeException("WORLD IS ENDING");
    } catch (Throwable e) {
      throw new RuntimeException("Error occurred in methodThree", e);
    }
  }
}

public class MethodChainDemo {

  public static void main(String[] args) {
    // methodOne();
    try {
      methodOne();
    } catch (Throwable t) {
      System.out.println("Program crashed due to: " + t.getMessage());
      t.printStackTrace();
    }
  }

  public static void methodOne() {
    methodTwo();
    System.out.println("methodOne successful");
  }

  public static void methodTwo() {
    methodThree();
    System.out.println("methodTwo successful");
  }

  public static void methodThree() {
    methodFour();
    System.out.println("methodThree successful");
  }

  public static void methodFour() {
    methodFive();
    System.out.println("methodFour successful");
  }

  public static void methodFive() {
    throw new RuntimeException("WORLD IS ENDING");
    // System.out.println("methodFive successful");
  }
}

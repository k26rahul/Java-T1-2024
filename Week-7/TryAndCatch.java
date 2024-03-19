public class TryAndCatch {

  // public static void myMethod() {
  public static void myMethod() throws Exception {
    // Exception myException = new Exception("Some exception happened");
    // throw myException;

    throw new Exception("Some exception happened");

    // try {
    // throw myException;
    // } catch (Exception exception) {
    // exception.printStackTrace();
    // }
  }

  public static void main(String[] args) {
    try {
      myMethod();
    } catch (Exception exception) {
      System.out.println("Taking the recovery measures");
      // throw new Error("Recovery failed, no option left but to crash");
      System.out.println("All safe, good to go");
    }

    System.out.println("Problem is dealt and program can continue");
  }
}

import java.util.NoSuchElementException;
import java.util.Scanner;

public class FinallyDemo {
  public static void main(String[] args) {
    performOperation();
  }

  private static void performOperation() {
    Scanner scanner = new Scanner(System.in);
    try {
      int number = scanner.nextInt();
      int result = 100 / number; // Potential division by zero error
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException occurred, handled in catch block");
    } catch (NoSuchElementException e) {
      System.out.println("NoSuchElementException occurred, handled in catch block");
    } finally {
      // This block will always execute, regardless of whether an exception occurred or not.
      // It's used for cleanup tasks, such as closing resources.
      System.out.println("Finally block executed");
      scanner.close(); // Close the scanner to prevent resource leak
    }
  }
}

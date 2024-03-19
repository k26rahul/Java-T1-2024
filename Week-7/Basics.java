import java.util.Arrays;

public class Basics {

  public static void main(String[] args) {
    Error myError = new Error("Some error happened");
    Exception myException = new Exception("Some exception happened");

    System.out.println(myError instanceof Throwable);
    System.out.println(myException instanceof Throwable);

    System.out.println(myError.getMessage());
    System.out.println(myException.getMessage());

    System.out.println(myError.getStackTrace() instanceof StackTraceElement[]);
    System.out.println(myException.getStackTrace() instanceof StackTraceElement[]);

    System.out.println(myError.getStackTrace()[0] instanceof StackTraceElement);

    System.out.println(Arrays.toString(myError.getStackTrace()));
    System.out.println(Arrays.toString(myException.getStackTrace()));

    myError.printStackTrace();
    myException.printStackTrace();
  }
}

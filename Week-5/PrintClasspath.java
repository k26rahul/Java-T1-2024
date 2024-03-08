/**
 * Main
 */

public class PrintClasspath {
  public static void main(String[] args) {
    System.out.println("Practice Main");

    // Print classpath
    String classpath = System.getProperty("java.class.path");
    System.out.println("Classpath: " + classpath);

    System.out.println();

    // Print current working directory
    String cwd = System.getProperty("user.dir");
    System.out.println("Current Working Directory: " + cwd);

    System.out.println();

    // Print JRE executable location
    String javaHome = System.getProperty("java.home");
    System.out.println("JRE Executable Location: " + javaHome);
  }
}
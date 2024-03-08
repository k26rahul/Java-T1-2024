interface Bird {
  void fly(String message);
}

class Birdy implements Bird {
  String ctx = "[class Birdy implements Bird]";

  @Override
  public void fly(String message) {
    System.out.println("Birdy flying!");
    System.out.println(this.ctx);
    System.out.println(this);
  }

  void sleep() {
    System.out.println("Birdy sleeping!");
  }
}

/**
 * Main
 */
public class Lambdas {
  static String ctx = "[public class Main]";

  public static void main(String[] args) {
    Birdy myBirdy = new Birdy();
    flyABird(myBirdy);
    System.out.println(myBirdy);

    myBirdy.sleep();

    // flyABird(new Bird() {
    // String ctx = "new Bird() {} [Anonymous inner class]";

    // @Override
    // public void fly() {
    // System.out.println("Some anonymous bird flying!");
    // System.out.println(this.ctx);
    // }
    // });

    // flyABird((String message) -> {
    // System.out.println("Some lambda bird flying!");
    // System.out.println(ctx);
    // });

    // flyABird(System.out::println);
  }

  public static void flyABird(Bird bird) {
    bird.fly("fly high bro");
  }
}
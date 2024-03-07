// Functional interface
// Single abstract method, more static/default methods are allowed, but more than 1 abstract method NOT allowed
// It works like a function
interface Callback {
  void onComplete(int Num);
}

class Car {
  public void start(Callback callback) {
    System.out.println("I'll try to start the Car.");

    Thread myThread = new Thread(() -> {
      System.out.println("Car is starting");
      try {
        System.out.println("Now waiting...");
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Car started.");
      callback.onComplete(16);
    });

    myThread.start();
    System.out.println("I tried starting the car, now we'll wait.");
  }
}

public class Main {

  public static void main(String[] args) {
    Car myCar = new Car();

    // // Anonymous inner class
    // myCar.start(new Callback() {
    // public void onComplete() {
    // System.out.println("Let's go! Yayy!");
    // }
    // });

    // // Callback
    // Callback myCallback = () -> System.out.println("Let's go! Yayy!");
    // myCar.start(num -> {
    // System.out.println("Let's go! Yayy!");
    // System.out.println("Let's go! Yayy!");
    // System.out.println("Let's go! Yayy!");
    // System.out.println(num);
    // });

    // :: member reference operator
    myCar.start(System.out::println);
  }
}
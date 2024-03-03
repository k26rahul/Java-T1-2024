interface Vehicle {
  String color = "red";
}

abstract class TwoWheeler implements Vehicle {
  static int seats = 3;
  int wheels = 2;
}

/**
 * Main
 */
public class Abstract {

  public static void main(String[] args) {
    TwoWheeler myTwoWheeler = new TwoWheeler() {
    };

    Vehicle myVehicle = new Vehicle() {
    };

    System.out.println(myTwoWheeler instanceof TwoWheeler);
    System.out.println(myTwoWheeler instanceof Vehicle);
    System.out.println(myTwoWheeler.getClass().getName());
    // myTwoWheeler.color = "green";
    // System.out.println(myTwoWheeler.wheels);
    System.out.println(myTwoWheeler.seats);

    System.out.println("ok" + (10 + 10));

    // int j = 20;
    // for (int i = 10; i<j; j++, i--) {
    // }

    // int i = 90;

    // for (;;) {
    // System.out.println("ok");
    // }
  }
}
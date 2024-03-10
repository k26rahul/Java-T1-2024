interface Vehicle {
  String color = "red";
}

abstract class TwoWheeler implements Vehicle {
  static int seats = 3;
  int wheels = 2;
}

public class Abstract {

  public static void main(String[] args) {
    TwoWheeler myTwoWheeler = new TwoWheeler() {
    };

    Vehicle myVehicle = new Vehicle() {
    };

    System.out.println(myTwoWheeler instanceof TwoWheeler);
    System.out.println(myTwoWheeler instanceof Vehicle);
    System.out.println(myTwoWheeler.getClass().getName());

    System.out.println(myTwoWheeler.wheels);
    System.out.println(myTwoWheeler.seats);
  }
}
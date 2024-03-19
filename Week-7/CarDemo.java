class CarFailures extends Exception {
  public CarFailures(String message) {
    super(message);
  }
}


class CarStartFailureException extends CarFailures {
  public CarStartFailureException(String message) {
    super(message);
  }
}


class CarBrakeFailureException extends CarFailures {
  public CarBrakeFailureException(String message) {
    super(message);
  }
}


class Car {
  public boolean enoughFuelAvailable = true;
  public boolean engineHealthy = true;
  public boolean transmissionHealthy = true;
  public boolean brakesHealthy = false;
  public boolean canFixAccelerationIssue = true;

  public void start() throws CarStartFailureException {
    try {
      checkFuelLevel();
      startEngine();
      engageTransmission();
      System.out.println("Car started successfully");
    } catch (Exception e) {
      throw new CarStartFailureException("Failed to start the car: " + e.getMessage());
    }
  }

  public void accelerate() {
    try {
      throw new Exception("Throttle body malfunction detected");
    } catch (Exception e) {
      System.out.println("Acceleration issue: " + e.getMessage());
      if (canFixAccelerationIssue) {
        System.out.println("Fixing acceleration issue...");
      } else {
        throw new Error("Unable to resolve acceleration issue");
      }
    }
    System.out.println("Car accelerating...");
  }

  public void applyBrakes() throws CarBrakeFailureException {
    if (!brakesHealthy) {
      throw new CarBrakeFailureException("Brake failure");
    }
    System.out.println("Car brakes applied");
  }

  private void checkFuelLevel() throws Exception {
    if (!enoughFuelAvailable) {
      throw new Exception("Not enough fuel");
    }
    System.out.println("Fuel check");
  }

  private void startEngine() throws Exception {
    if (!engineHealthy) {
      throw new Exception("Engine start failure");
    }
    System.out.println("Engine started");
  }

  private void engageTransmission() throws Exception {
    if (!transmissionHealthy) {
      throw new Exception("Transmission engagement failure");
    }
    System.out.println("Transmission engaged");
  }
}


public class CarDemo {

  public static void main(String[] args) {
    Car car = new Car();
    try {
      car.start();
      car.accelerate();
      car.applyBrakes();
    }

    // Catches all kinds of CarFailures and tries to repair.
    catch (CarFailures e) {
      System.out.println("There is some problem with the car: " + e.getMessage());
      repairCar();
    }

    // Catches Error. It's not a CarFailures, so it cannot be repaired.
    // Such a catch block should not even exist.
    // Errors should not be caught; you should let them crash the program.
    catch (Error e) {
      System.out.println(e.getMessage());
      System.out.println("Some serious problem with the car that cannot be repaired");
    }

    // Handles two specific types of car failures.
    // catch (CarStartFailureException | CarBrakeFailureException e) {
    // if (e instanceof CarStartFailureException) {
    // System.out.println("Car start failure: " + e.getMessage());
    // } else if (e instanceof CarBrakeFailureException) {
    // System.out.println("Car brake failure: " + e.getMessage());
    // }
    // repairCar();
    // }

    // catch (CarStartFailureException e) {
    // System.out.println("Car start failure: " + e.getMessage());
    // repairCar();
    // }

    // catch (CarBrakeFailureException e) {
    // System.out.println("Car brake failure: " + e.getMessage());
    // repairCar();
    // }
    System.out.println("Program finishes");
  }

  public static void repairCar() {
    System.out.println("Car repair in progress...");
  }
}

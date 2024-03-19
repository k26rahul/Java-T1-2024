class CarFailures extends Exception {
  public CarFailures(String message, Throwable cause) {
    super(message, cause);
  }
}


class CarStartFailureException extends CarFailures {
  public CarStartFailureException(String message, Throwable cause) {
    super(message, cause);
  }
}


class CarBrakeFailureException extends CarFailures {
  public CarBrakeFailureException(String message, Throwable cause) {
    super(message, cause);
  }
}


class Car {
  public boolean enoughFuelAvailable = false;
  public boolean engineHealthy = true;
  public boolean transmissionHealthy = true;
  public boolean brakesHealthy = true;
  public boolean canFixAccelerationIssue = true;

  public void start() throws CarStartFailureException {
    try {
      checkFuelLevel();
      startEngine();
      engageTransmission();
      System.out.println("Car started successfully");
    } catch (Exception e) {
      throw new CarStartFailureException("Failed to start the car", e);
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
        throw new Error("Unable to resolve acceleration issue", e);
      }
    }
    System.out.println("Car accelerating...");
  }

  public void applyBrakes() throws CarBrakeFailureException {
    if (!brakesHealthy) {
      throw new CarBrakeFailureException("Brake failure", null);
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


public class CarDemo2 {

  public static void main(String[] args) {
    Car car = new Car();
    try {
      car.start();
      car.accelerate();
      car.applyBrakes();
    } catch (CarFailures e) {
      System.out.println("There is some problem with the car");
      repairCar(e);
    } catch (Error e) {
      System.out.println(e.getMessage());
      System.out.println("Some serious problem with the car that cannot be repaired");
    }
    System.out.println("Program finishes");
  }

  public static void repairCar(Throwable cause) {
    System.out.println("Car repair in progress...");
    if (cause != null) {
      System.out.println("Underlying cause: " + cause.getMessage());

      if (cause.getCause() != null) {
        System.out.println("Underlying cause: " + cause.getCause().getMessage());
      }
    }
  }
}

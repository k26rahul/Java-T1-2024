class Animal {
  public void eat() {
    System.out.println("Animal is eating!");
  }
}

class Mammal extends Animal {
  public void eat() {
    System.out.println("Mammal is eating!");
  }
}

class Human extends Animal {
  public void eat() {
    System.out.println("Human is eating!");
  }

  public void playChess() {
    System.out.println("Human is playing chess!");
  }
}

// https://en.wikipedia.org/wiki/Downcasting
// In class-based programming, downcasting, or type refinement, is the act of
// casting a base or parent class reference, to a more restricted derived class
// reference. This is only allowable if the object is already an instance of the
// derived class, and so this conversion is inherently fallible.

public class Downcasting {

  public static void main(String[] args) {
    Animal animal = new Human();
    Animal human = (Human) animal;
    // human.playChess();
  }
}
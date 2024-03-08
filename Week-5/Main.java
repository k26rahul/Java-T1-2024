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

public class Main {

  public static void main(String[] args) {
    Animal animal = new Human();
    Animal human = (Human) animal;
    // human.playChess();
  }
}
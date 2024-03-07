interface Animal {
  public default void eat() {
    System.out.println("Animal is eating!");
  }
}

interface Mammal extends Animal {
  @Override
  default void eat() {
    System.out.println("Mammal is eating!");
  }

  public default void giveBirth() {
    System.out.println("Mammal is giving birth!");
  }
}

interface WaterAnimal extends Animal {
  public default void swim() {
    System.out.println("WaterAnimal is swimming!");
  }
}

class Dog implements Mammal {
  // @Override
  // public void eat() {
  // System.out.println("Dog is eating!");
  // }

  public void bark() {
    System.out.println("Dog is barking!");
  }
}

class Whale implements Mammal, WaterAnimal {
  // @Override
  // public void eat() {
  // System.out.println("Whale is eating!");
  // }

  public void whistle() {
    System.out.println("Whale doing whistle!");
  }
}

public class Polymorhpism {
  public static void main(String[] args) {
    // Dog myDog = new Dog();
    // Whale myWhale = new Whale();

    // myDog.eat();
    // myWhale.eat();

    // myDog.giveBirth();
    // myWhale.giveBirth();

    // myDog.bark();
    // myWhale.whistle();

    Animal pet = new Dog();
    animalDoctor(pet);

    pet = new Whale();
    animalDoctor(pet);
  }

  public static void animalDoctor(Animal pet) {
    pet.eat();
    System.out.println("[animalDoctor]");
  }
}
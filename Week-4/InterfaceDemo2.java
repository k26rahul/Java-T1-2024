// Interface: Animal
// Contract/API blueprint containing abstract methods for animal behaviors
interface Animal {
  void eat(); // Abstract method for eating behavior

  // Default method for smiling behavior
  default void smile() {
    System.out.println("Animal is smiling.");
  }
}

// Interface: Mammal
// Contract/API blueprint containing abstract methods for mammal-specific
// behaviors
interface Mammal extends Animal {
  void giveBirth(); // Abstract method for giving birth behavior (specific to mammals)
}

// Interface: WaterAnimal
// Contract/API blueprint containing abstract methods for water animal behaviors
interface WaterAnimal extends Animal {
  void swim(); // Abstract method for swimming behavior (specific to water animals)
}

// Normal Class: Dog
// Implements interfaces Mammal and Animal
class Dog implements Mammal {
  String breed;
  String color = "brown";

  @Override
  public void eat() {
    System.out.println("Dog is eating.");
  }

  @Override
  public void giveBirth() {
    System.out.println("Dog is giving birth.");
  }

  void bark() {
    System.out.println("Dog is barking.");
  }
}

// Normal Class: Whale
// Implements interfaces Mammal and WaterAnimal
class Whale implements Mammal, WaterAnimal {
  @Override
  public void eat() {
    System.out.println("Whale is eating.");
  }

  @Override
  public void giveBirth() {
    System.out.println("Whale is giving birth.");
  }

  @Override
  public void swim() {
    System.out.println("Whale is swimming.");
  }
}

public class InterfaceDemo2 {

  public static void animalDoctor(Animal animal) {
    System.out.println("I'll treat this animal.");
  }

  public static void waterAnimalDoctor(WaterAnimal waterAnimal) {
    System.out.println("I'll treat this waterAnimal.");
  }

  public static void main(String[] args) {
    // Dog myPet = new Dog();
    // myPet.eat();

    Whale myPet = new Whale();
    myPet.eat();

    System.out.println(myPet instanceof Whale); // myPet "is-a" Whale? t/f
    System.out.println(myPet instanceof Mammal); // myPet "is-a" Mammal? t/f
    System.out.println(myPet instanceof WaterAnimal); // myPet "is-a" WaterAnimal? t/f
    System.out.println(myPet instanceof Animal); // myPet "is-a" WaterAnimal? t/f
    // System.out.println(myPet instanceof Dog); // myPet "is-a" Dog? t/f

    // animalDoctor(new Dog());
    // animalDoctor(new Whale());
    // waterAnimalDoctor(new Whale());

    // int x;
    // // System.out.println(x);
    // System.out.println(myPet.breed);

    // dog.eat(); // Output: Dog is eating.
    // dog.giveBirth(); // Output: Dog is giving birth.
    // dog.smile(); // Output: Animal is smiling.
    // whale.eat(); // Output: Whale is eating.
    // whale.giveBirth(); // Output: Whale is giving birth.
    // whale.swim(); // Output: Whale is swimming.
    // whale.smile(); // Output: Animal is smiling.
  }
}
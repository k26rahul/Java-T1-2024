class Animal {
  void eat() {
    System.out.println("Animal eating!");
  }
}

class Mammal extends Animal {
  void eat() {
    System.out.println("Mammal eating!");
  }
}

class Cat extends Mammal {
  void eat() {
    System.out.println("Cat eating!");
  }
}

class Reptile extends Animal {
  void eat() {
    System.out.println("Reptile eating!");
  }
}

class Dinosaur extends Reptile {
  void eat() {
    System.out.println("Dinosaur eating!");
  }
}

/**
 * Main
 */
// run-time polymorphism.
public class DynamicMethodDispatch {
  public static void main(String[] args) {
    Animal[] pets = new Animal[] {
        new Cat(), new Dinosaur(), new Reptile(), new Mammal(), new Animal()
    };
    feedThePets(pets);
  }

  public static void feedThePets(Animal[] pets) {
    for (Animal pet : pets) {
      pet.eat();
      System.out.println(pet.getClass());
      System.out.println();
    }
  }
}
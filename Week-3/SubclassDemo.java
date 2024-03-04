// Parent class
class Animal {
  void eat() {
    System.out.println("Animal is eating");
  }
}

// Subclass of Animal
class Dog extends Animal {
  void bark() {
    System.out.println("Dog is barking");
  }
}

// Subclass of Animal
class Cat extends Animal {
  void meow() {
    System.out.println("Cat is meowing");
  }
}

public class SubclassDemo {
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();

    // Call methods from the superclass Animal
    dog.eat(); // Output: Animal is eating
    cat.eat(); // Output: Animal is eating

    // Call methods specific to Dog
    dog.bark(); // Output: Dog is barking

    // Call methods specific to Cat
    cat.meow(); // Output: Cat is meowing
  }
}

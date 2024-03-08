class Animal {
  void eat() {
    System.out.println("Animal is eating");
  }
}

/*  */

class Dog extends Animal {
  void bark() {
    System.out.println("Dog is barking");
  }
}

class Cat extends Animal {
  void meow() {
    System.out.println("Cat is meowing");
  }
}

class Bird extends Animal {
  void fly() {
    System.out.println("Bird is flying");
  }
}

class Human extends Animal {
  void think() {
    System.out.println("Human is thinking");
  }
}

/*  */

class BadHuman extends Human {
  void misbehave() {
    System.out.println("Bad human is misbehaving");
  }
}

class GoodHuman extends Human {
  void behaveWell() {
    System.out.println("Good human is behaving well");
  }
}

/*  */

class SuperBadHuman extends BadHuman {
  void causeHavoc() {
    System.out.println("Super bad human is causing havoc");
  }
}

class SuperGoodHuman extends GoodHuman {
  void doCharity() {
    System.out.println("Super good human is doing charity");
  }
}

public class ClassHierarchyDemo {
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    Bird bird = new Bird();
    BadHuman badHuman = new BadHuman();
    GoodHuman goodHuman = new GoodHuman();
    SuperBadHuman superBadHuman = new SuperBadHuman();
    SuperGoodHuman superGoodHuman = new SuperGoodHuman();

    // Level 1: Animal
    dog.eat(); // Output: Animal is eating
    cat.eat(); // Output: Animal is eating
    bird.eat(); // Output: Animal is eating
    badHuman.eat(); // Output: Animal is eating
    goodHuman.eat(); // Output: Animal is eating
    superBadHuman.eat(); // Output: Animal is eating
    superGoodHuman.eat(); // Output: Animal is eating

    System.out.println();
    // Level 2: Dog, Cat, Bird, Human
    dog.bark(); // Output: Dog is barking
    cat.meow(); // Output: Cat is meowing
    bird.fly(); // Output: Bird is flying
    badHuman.think(); // Output: Human is thinking
    goodHuman.think(); // Output: Human is thinking
    superBadHuman.think(); // Output: Human is thinking
    superGoodHuman.think(); // Output: Human is thinking

    System.out.println();
    // Level 3: BadHuman, GoodHuman
    badHuman.misbehave(); // Output: Bad human is misbehaving
    goodHuman.behaveWell(); // Output: Good human is behaving well

    System.out.println();
    // Level 4: SuperBadHuman, SuperGoodHuman
    superBadHuman.causeHavoc(); // Output: Super bad human is causing havoc
    superGoodHuman.doCharity(); // Output: Super good human is doing charity
  }
}

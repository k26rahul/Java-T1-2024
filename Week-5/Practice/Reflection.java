import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

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
public class Reflection {
  public static void main(String[] args) {
    Dinosaur dinosaur = new Dinosaur();

    Class<?> myClass = dinosaur.getClass();
    System.out.println(myClass.getName());

    Package myPackage = myClass.getPackage();
    System.out.println(myPackage);

    System.out.println(myClass.getModifiers());
    System.out.println(Modifier.toString(myClass.getModifiers()));
    System.out.println(myClass.getSuperclass());

    System.out.println(myClass.getInterfaces());
    System.out.println(myClass.getConstructors());
    System.out.println(myClass.getMethods());
    System.out.println(myClass.getFields());

    for (Class<?> iface : myClass.getInterfaces()) {
      System.out.println(iface.getName());
    }

    for (Constructor<?> constructor : myClass.getConstructors()) {
      System.out.println(constructor.toString());
    }

    for (Method method : myClass.getMethods()) {
      System.out.println(method.toString());
    }
  }
}
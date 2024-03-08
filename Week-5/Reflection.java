
// import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
// import java.lang.reflect.Method;
// import java.lang.reflect.Modifier;

class Animal {
  public void eat() {
    System.out.println("Animal eating!");
  }

  public void sleep() {
    System.out.println("Animal is sleeping!");
  }
}

class Mammal extends Animal {
  public void eat() {
    System.out.println("Mammal eating!");
  }
}

class Cat extends Mammal {
  public void eat() {
    System.out.println("Cat eating!");
  }
}

class Reptile extends Animal {
  public String coolName = "Repp";

  public void eat() {
    System.out.println("Reptile eating!");
  }

  public void layEggs() {
    System.out.println("Reptile is layEggs!");
  }
}

class Dinosaur extends Reptile {
  public String name = "Dino";

  public void eat() {
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

    System.out.println(dinosaur.name);
    System.out.println(dinosaur.coolName);

    Class<?> myClass = dinosaur.getClass();
    for (Field field : myClass.getDeclaredFields()) {
      System.out.println(field.toString());
    }
    // System.out.println(myClass.getName());

    // Package myPackage = myClass.getPackage();
    // System.out.println(myPackage.getName());

    // System.out.println(myClass.getModifiers());
    // System.out.println(Modifier.toString(myClass.getModifiers()));
    // System.out.println(myClass.getSuperclass());

    // System.out.println(myClass.getInterfaces());
    // System.out.println(myClass.getConstructors());
    // System.out.println(myClass.getMethods());
    // System.out.println(myClass.getFields());

    // for (Class<?> iface : myClass.getInterfaces()) {

    // System.out.println(iface.getName());
    // }

    // for (Constructor<?> constructor : myClass.getConstructors()) {
    // System.out.println(constructor.toString());
    // }

    // for (Method method : myClass.getMethods()) {
    // System.out.println(method.toString());
    // }
  }
}
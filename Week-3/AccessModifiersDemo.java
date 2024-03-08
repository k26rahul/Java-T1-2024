class Parent {
  public Parent() {
    System.out.println("[Parent constructor]");
    privateMethod();
  }

  void noAccessModifierMethod() {
    System.out.println("Default method in Parent class");
  }

  public void publicMethod() {
    System.out.println("Public method in Parent class");
  }

  protected void protectedMethod() {
    System.out.println("Protected method in Parent class");
  }

  private void privateMethod() {
    System.out.println("Private method in Parent class");
  }
}

class Child extends Parent {
  public Child() {
    System.out.println("[Child constructor]");
  }

  void accessMethods() {
    noAccessModifierMethod(); // OK (no access modifier)
    publicMethod(); // OK (public)
    protectedMethod(); // OK (protected)
    // privateMethod(); // Uncommenting this line will cause an error
  }
}

public class AccessModifiersDemo {
  public static void main(String[] args) {
    Parent parent = new Parent();
    System.out.println("We just created a parent!");

    System.out.println();

    System.out.println("Now we will create a child!");
    Child child = new Child();

    System.out.println();
    parent.noAccessModifierMethod(); // OK (no access modifier)
    parent.publicMethod(); // OK (public)
    parent.protectedMethod(); // OK (protected)
    // parent.privateMethod(); // Uncommenting this line will cause an error

    System.out.println();
    child.accessMethods();

    System.out.println();
    child.noAccessModifierMethod(); // OK (no access modifier)
    child.publicMethod(); // OK (public)
    child.protectedMethod(); // OK (protected)
    // child.privateMethod(); // Uncommenting this line will cause an error
  }
}

/*
 * [Parent constructor]
 * Private method in Parent class
 * We just created a parent!
 * 
 * Now we will create a child!
 * [Parent constructor]
 * Private method in Parent class
 * [Child constructor]
 * 
 * Default method in Parent class
 * Public method in Parent class
 * Protected method in Parent class
 * 
 * Default method in Parent class
 * Public method in Parent class
 * Protected method in Parent class
 * 
 * Default method in Parent class
 * Public method in Parent class
 * Protected method in Parent class
 */
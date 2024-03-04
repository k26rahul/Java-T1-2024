// Parent class with default access modifier
class Parent {
  void defaultMethod() {
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

// Subclass of Parent
class Child extends Parent {
  void accessMethods() {
    // Access methods of the Parent class
    defaultMethod(); // OK (default access modifier)
    publicMethod(); // OK (public access modifier)
    protectedMethod(); // OK (protected access modifier)
    // privateMethod(); // Uncommenting this line will cause an error (private
    // access modifier)

    // Access methods of the Child class
    childMethod(); // OK (default access modifier in Child class)
  }

  void childMethod() {
    System.out.println("Default method in Child class");
  }
}

public class AccessModifiersDemo {
  public static void main(String[] args) {
    Parent parent = new Parent();
    Child child = new Child();

    // Access methods of the Parent class through an instance of Parent
    parent.defaultMethod(); // OK (default access modifier)
    parent.publicMethod(); // OK (public access modifier)
    parent.protectedMethod(); // OK (protected access modifier)
    // parent.privateMethod(); // Uncommenting this line will cause an error
    // (private access modifier)

    // Access methods of the Child class through an instance of Child
    child.accessMethods();

    // Access methods of the Parent class through an instance of Child
    // child.defaultMethod(); // Uncommenting this line will cause an error (default
    // access modifier in Parent class)
    child.publicMethod(); // OK (public access modifier)
    child.protectedMethod(); // OK (protected access modifier)
    // child.privateMethod(); // Uncommenting this line will cause an error (private
    // access modifier in Parent class)
  }
}

class MyClass {
  /*
   * Private attribute [Encapsulation]
   * 
   * The essence of encapsulation is to hide "sensitive" data from users. To
   * achieve this, you must:
   * 1. Declare class variables/attributes as private.
   * 2. Provide public get and set methods to access and update the value of a
   * private variable.
   */
  private int x;

  // Public attributes
  int y = 5;

  // If you don't want the ability to override existing attribute values, declare
  // attributes as final:
  final int SOME_CONSTANT = 3;

  // Instance method [Constructor: Special method]
  public MyClass(int value) {
    this.x = value;
  }

  // Instance method [Getter: Encapsulation]
  public int getX() {
    return this.x; // 'this' refers to the current instance of MyClass
  }

  // Instance method [Setter: Encapsulation]
  public void setX(int value) {
    if (value > 100) {
      System.out.println("Value is too high to set.");
      return;
    }
    this.x = value;
  }

  /*
   * A static method means that it can be accessed without creating an object of
   * the class.
   */
  public static void callMeDirectly() {
    System.out.println("You just called me without creating an instance.");
  }
}

public class OOP {

  public static void main(String[] args) {
    MyClass instanceOfMyClass1 = new MyClass(16);

    // Uncommenting the lines below will cause compilation errors due to the final
    // attribute.
    // instanceOfMyClass1.SOME_CONSTANT = 999;
    // System.out.println(instanceOfMyClass1.SOME_CONSTANT);

    System.out.println(instanceOfMyClass1.getX());
    System.out.println(instanceOfMyClass1.y);

    instanceOfMyClass1.setX(100);
    System.out.println(instanceOfMyClass1.getX());

    // Calling [Static] method [Syntax: class.method()]
    MyClass.callMeDirectly();

    // Uncommenting the lines below will cause compilation errors due to private
    // access.
    // instanceOfMyClass1.x = 5;
    // System.out.println(instanceOfMyClass1.x);
  }
}

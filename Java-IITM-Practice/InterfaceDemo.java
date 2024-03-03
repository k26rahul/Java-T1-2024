// Interface defining the behavior of a Shape
interface Shape {
  double calculateArea();
}

// Class representing a Circle that implements the Shape interface
class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}

// Class representing a Rectangle that implements the Shape interface
class Rectangle implements Shape {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double calculateArea() {
    return length * width;
  }
}

// Main class demonstrating the usage of interfaces
public class InterfaceDemo {
  public static void main(String[] args) {
    // Create instances of Circle and Rectangle
    Circle circle = new Circle(5);
    Rectangle rectangle = new Rectangle(4, 6);

    // Calculate and print the areas of the shapes
    System.out.println("Area of Circle: " + circle.calculateArea());
    System.out.println("Area of Rectangle: " + rectangle.calculateArea());
  }
}

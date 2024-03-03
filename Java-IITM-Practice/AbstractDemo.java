// Abstract Class: Shape
// Contains abstract methods that must be implemented by subclasses
abstract class Shape {
  abstract double calculateArea(); // Abstract method
}

// Normal Class: Circle
// Extends abstract class Shape
abstract class Circle extends Shape {
  public double radius;

  Circle(double my_radius) {
    // this.radius = radius;
    radius = my_radius;
  }
}

class BetterCircle extends Circle {
  BetterCircle(double radius) {
    super(radius); // Call to superclass constructor with radius parameter
  }

  double calculateArea() {
    return Math.PI * this.radius * this.radius; // Implementation of abstract method
  }
}

// Normal Class: Rectangle
// Extends abstract class Shape
class Rectangle extends Shape {
  private double length;
  private double width;

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  double calculateArea() {
    return length * width; // Implementation of abstract method
  }
}

// Usage:
public class AbstractDemo {
  public static void main(String[] args) {
    Circle circle = new BetterCircle(5);
    System.out.println("Area of Circle: " + circle.calculateArea());

    Rectangle rectangle = new Rectangle(3, 4);
    System.out.println("Area of Rectangle: " + rectangle.calculateArea());
  }
}

// class Animal {
// String mood = "happy";

// final int x = 10;

// Animal() {
// System.out.println("u just created an Animal");
// }
// }

// class Employee {
// int eid;
// String ename;

// Employee(Employee e) {
// this.eid = e.eid;
// this.ename = e.ename;
// }

// public void show() {
// System.out.println(this.eid + this.ename);
// }
// }

// public class Main {

// public static void main(String[] args) {
// int i1 = 10, i2 = 29;
// System.out.println(i1 / i2);

// // Employee e = new Employee();
// // Animal myAnimal = new Animal();
// // System.out.println(myAnimal.mood);

// // byte a = (byte) 999.9;
// // System.out.println(a);

// // System.out.println(1991);
// // System.out.println(1991l);

// // System.out.println(1991.95);
// // System.out.println(1991.95f);
// // System.out.println(1991.95d);

// // int i = 0;
// // for (;;) {
// // System.out.println(i);
// // i++;
// // }
// }
// }
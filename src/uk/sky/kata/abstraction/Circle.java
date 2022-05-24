package uk.sky.kata.abstraction;

public class Circle extends Shape {
  int radius;
  int diameter;

  public Circle(int radius, int diameter) {
    this.radius = radius;
    this.diameter = diameter;
  }

  @Override
  public double area() {
    return Math.PI * radius*radius;
  }
}

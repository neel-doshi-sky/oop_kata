package uk.sky.kata.fundamentals.abstraction.abstractClass;


import java.util.jar.JarEntry;

/**
 * This method extends the abstract class and therefore has to fulfil the contract by implementing the abstract methods,
 * The limitation here, is that we cannot extend multiple classes
 */
public class Square extends Shape {

  double height;
  double length;

  public Square(double height, double length) {
    this.height = height;
    this.length = length;
  }

  /**
   * This method has to fulfil the contract of an abstract class and is forced to override the abstract method
   * @return the area of a square
   */
  @Override
  public double area() {
    return height * length;
  }
}

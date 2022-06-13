package uk.sky.kata.fundamentals.polymorphism;

/**
 * This is an example of method overloading, we have multiple methods called the same thing, but they behave differently depending on the situation
 */
public class Calculator {


  /**
   * This method will add two integers
   *
   * @param a integer a
   * @param b integer b
   * @return add both a and b and return the result as an int
   */
  public int add(int a, int b) {
    return a + b;
  }

  /**
   * This method will add three integers
   *
   * @param a integer a
   * @param b integer b
   * @param c integer c
   * @return add a, b and c and return the result as an int
   */
  public int add(int a, int b, int c) {
    return a + b + c;
  }

  /**
   * This method will add two doubles
   *
   * @param a double a
   * @param b double b
   * @return add both a and b and return the result as a double
   */
  public double add(double a, double b) {
    return a + b;
  }
}

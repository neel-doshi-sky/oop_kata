package uk.sky.kata.fundamentals.abstraction;

abstract class Shape {

  String color;

  // these are abstract methods
  public abstract double area();

  public void randomMethod(){
    System.out.println("This is a random method that doesn't need to be implemented");
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}

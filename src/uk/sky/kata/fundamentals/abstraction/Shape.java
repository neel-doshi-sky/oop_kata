package uk.sky.kata.fundamentals.abstraction;

//by using the keyword abstract, we can create an abstract class
public abstract class Shape {

  String color;

  // this is an abstract method
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

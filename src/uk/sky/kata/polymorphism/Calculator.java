package uk.sky.kata.polymorphism;

public class Calculator {

  //This is an example of method overloading, we have multiple methods called the same thing but they do different stuff depending on the situation
  public int add(int a, int b){
    return a + b;
  }
  public int add(int a, int b, int c){
    return a + b + c;
  }
  public double add(double a, double b){
    return a + b;
  }
}

package uk.sky.kata.fundamentals.polymorphism;

import uk.sky.kata.fundamentals.inheritance.AutomaticCar;
import uk.sky.kata.fundamentals.inheritance.Car;
import uk.sky.kata.fundamentals.inheritance.ManualCar;

public class Polymorphism {

  public static void main(String[] args) {


    /**
     * Polymorphism - means having many forms
     * First example is inheritance, we have many startEngine() methods which are overridden, this is a run time example of polymorphism
     * Second example is overloading methods at compile time
     */

    //This calculator class has many methods with the same name - this is Method Overloading
    Calculator calculator = new Calculator();
    System.out.println(calculator.add(1, 2));
    //notice that the method name is the same, this makes it easy to read the code and understand that it is another form of add that behaves differently
    System.out.println(calculator.add(1.5d, 2.5d));
    System.out.println(calculator.add(1, 4, 6));


  }
}

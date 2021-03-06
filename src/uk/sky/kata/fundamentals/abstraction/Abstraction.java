package uk.sky.kata.fundamentals.abstraction;

import uk.sky.kata.fundamentals.abstraction.abstractClass.Circle;
import uk.sky.kata.fundamentals.abstraction.abstractClass.RightAngledTriangle;
import uk.sky.kata.fundamentals.abstraction.abstractClass.Shape;
import uk.sky.kata.fundamentals.abstraction.abstractClass.Square;
import uk.sky.kata.fundamentals.abstraction.interfaces.BankAccountService;
import uk.sky.kata.fundamentals.abstraction.interfaces.BarclaysService;
import uk.sky.kata.fundamentals.abstraction.interfaces.SantanderService;

public class Abstraction {

  public static void main(String[] args) {



    //We can create a new object from the class that extends the abstract class
    Square square = new Square(10d, 10d);
    //we can access public methods inside the abstract class through inheritance
    square.setColor("red");
    // we cannot instantiate an abstract class
//        Shape shapeAbstractClass = new Shape();
    System.out.println(square.area());
    //Still have access to the other methods not abstracted
    square.randomMethod();
    //Another example
    Circle circle = new Circle(10, 20);
    System.out.println(circle.area());
    circle.randomMethod();

    RightAngledTriangle triangle = new RightAngledTriangle();
    triangle.setBase(10);
    triangle.setHeight(5);
    System.out.println(triangle.area());


    //we can also use interfaces to achieve abstraction, we may have multiple bank services that have common functionality
    BarclaysService barclaysService = new BarclaysService();
    barclaysService.deposit();
    SantanderService santanderService = new SantanderService();
    santanderService.deposit();
    // This service implements 2 different interfaces and therefore must be able to do a combination of both interfaces which is a great way to do multiple inheritance
    BankAccountService
        bankAccountService = new BankAccountService();
    bankAccountService.openAccount();
    bankAccountService.deposit();

  }
}

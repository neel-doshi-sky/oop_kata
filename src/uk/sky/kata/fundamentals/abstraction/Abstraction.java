package uk.sky.kata.fundamentals.abstraction;

import uk.sky.kata.fundamentals.abstraction.abstractClass.Circle;
import uk.sky.kata.fundamentals.abstraction.abstractClass.Square;
import uk.sky.kata.fundamentals.abstraction.interfaces.BankAccountService;
import uk.sky.kata.fundamentals.abstraction.interfaces.BankService;
import uk.sky.kata.fundamentals.abstraction.interfaces.NewBankService;

public class Abstraction {

  public static void main(String[] args) {
    //We can create a new object from the class that extends the abstract class
    Square square = new Square(10d, 10d);
    //we can access public methods inside the abstract class through inheritance
    square.setColor("red");
    // we cannot instantiate an abstract class
//        ShapeAbstractClass shapeAbstractClass = new ShapeAbstractClass();
    System.out.println(square.area());
    //Still have access to the other methods not abstracted
    square.randomMethod();
    //Another example
    Circle circle = new Circle(10, 20);
    System.out.println(circle.area());
    //we can also use interfaces to achieve abstraction, we may have multiple bank services that have common functionality
    BankService bank1 = new BankService();
    bank1.deposit();
    NewBankService newBankService = new NewBankService();
    newBankService.deposit();
    // This service implements 2 different interfaces and therefore must be able to do a combination of both interfaces which is a great way to do multiple inheritance
    BankAccountService
        bankAccountService = new BankAccountService();
    bankAccountService.openAccount();
    bankAccountService.deposit();

  }
}

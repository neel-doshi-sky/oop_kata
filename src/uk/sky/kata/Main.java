package uk.sky.kata;

import uk.sky.kata.fundamentals.abstraction.Circle;
import uk.sky.kata.fundamentals.abstraction.Square;
import uk.sky.kata.fundamentals.abstraction.interfaces.BankAccountService;
import uk.sky.kata.fundamentals.abstraction.interfaces.BankService;
import uk.sky.kata.fundamentals.abstraction.interfaces.NewBankService;
import uk.sky.kata.fundamentals.encapsulation.EmployeeEncapsulated;
import uk.sky.kata.fundamentals.encapsulation.EmployeeWithoutEncapsulation;
import uk.sky.kata.fundamentals.inheritance.AutomaticCar;
import uk.sky.kata.fundamentals.inheritance.Car;
import uk.sky.kata.fundamentals.inheritance.ManualCar;
import uk.sky.kata.fundamentals.polymorphism.Calculator;

public class Main {

    public static void main(String[] args) {

        //Encapsulation
        //No Encapsulation example, notice how without encapsulation, we have access to everything in this class and make changes to what we want, we are not restricted
        EmployeeWithoutEncapsulation employeeWithoutEncapsulation =
            new EmployeeWithoutEncapsulation("Neel", "Doshi", 100000D, "123A", 2);
        System.out.println(employeeWithoutEncapsulation.salary);
        employeeWithoutEncapsulation.salary = 500000d;
        System.out.println(employeeWithoutEncapsulation.salary);

        /**
         * Encapsulated example
         * Notice how we cannot access salary to modify because we have not provided a setter, this means we are safe from anyone changing the salary after creating the object
         * if we want to allow access to change the salary, we can add a setter
         */

        EmployeeEncapsulated employeeEncapsulated =
            new EmployeeEncapsulated("Neel", "Doshi", 100000D, "123A", 2);
        //System.out.println(employeeEncapsulated.salary);
        System.out.println(employeeEncapsulated.getSalary());
//        employeeEncapsulated.setSalary(50000d);
        //employeeEncapsulated.salary = 4000d;


        //Inheritance
        //Here is the base class which contains the common methods and properties which can be shared
        Car car = new Car();
        car.setBrand("brand");
        car.startEngine();
        //This object is made from the manual car class which inherits Car
        ManualCar manualCar = new ManualCar();
        //it has access to the same methods/properties as Car
        manualCar.setBrand("BMW");
        //This has been overridden to perform a different action for the same method, notice the difference from the base class method
        manualCar.startEngine();
        //This method is completely unique to Manual Car, this cannot be accessed by the Car object or Automatic car object
        //car.toggleClutch();
        System.out.println(manualCar.isClutchDown());
        manualCar.toggleClutch();
        System.out.println(manualCar.isClutchDown());

        //This also extends Car so can do everything a car does, however overrides some methods and adds new ones specific to automatic cars
        AutomaticCar automaticCar = new AutomaticCar();
        automaticCar.setBrand("Mercedes");
        automaticCar.startEngine();
        automaticCar.setBrakePressed(true);
        automaticCar.changeMode("D");

        //Abstraction
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
        BankAccountService bankAccountService = new BankAccountService();
        bankAccountService.openAccount();
        bankAccountService.deposit();

        /**
         * Polymorphism - means having many forms
         * First example is inheritance, we have many startEngine() methods which are overridden, this is a run time example of polymorphism
         * Second example is overloading methods at compile time
         */

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        //notice that the method name is the same, this makes it easy for consumers to read the code and understand that it is another form of add
        System.out.println(calculator.add(1.5d, 2.5d));
        System.out.println(calculator.add(1, 4, 6));

    }
}

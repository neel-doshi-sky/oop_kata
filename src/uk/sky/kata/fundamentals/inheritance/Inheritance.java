package uk.sky.kata.fundamentals.inheritance;

public class Inheritance {

  public static void main(String[] args) {

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
    manualCar.moveUpAGear();

    //This also extends Car so can do everything a car does, however overrides some methods and adds new ones specific to automatic cars
    AutomaticCar automaticCar = new AutomaticCar();
    automaticCar.setBrand("Mercedes");
    automaticCar.startEngine();
    automaticCar.setBrakePressed(true);
    automaticCar.changeMode("D");
    automaticCar.accelerateForward();



  }
}

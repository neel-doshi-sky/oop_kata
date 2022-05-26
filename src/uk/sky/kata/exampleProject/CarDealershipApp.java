package uk.sky.kata.exampleProject;

import java.util.ArrayList;
import java.util.List;
import uk.sky.kata.exampleProject.model.Car;
import uk.sky.kata.exampleProject.service.CarService;
import uk.sky.kata.exampleProject.service.impl.CarServiceImpl;

public class CarDealershipApp {


  public static void main(String[] args) {

    /**
     * Notice here, you can create an object of an interface if you equal it to a class that overrides it
     * The car service interface is a great example of abstraction, as it tells us what our car service does
     * without telling us how, making it readable and reusable
     */
    CarService carService = new CarServiceImpl();

    //This will be our car database
    List<Car> carList = new ArrayList<>();


    System.out.println("OOP Example App");

    //Lets start by adding a car to the list above by creating a new car object
    Car car = new Car("Mercedes", "C class");

    //Now by calling our carService object, we can add this car to our list to mimic a database call
    System.out.println(carService.create(car, carList).toString());

    //Now lets add a few more to the list using our other create method, this is an example of polymorphism as the method is overloaded meaning it has the same name but different signature/return type
    Car car2 = new Car("BMW", "1 series");
    Car car3 = new Car("Audi", "A3");
    Car car4 = new Car("Toyota", "Yaris");
    System.out.println(carService.create(List.of(car2, car3, car4), carList).toString());

    //Now we can call the list method to see all the cars in our db and delete one
    System.out.println(carService.get(carList).getCarList().toString());

    //Notice how the cars all have an id?, Well if you take a look at our Car class, you will see the id property gets generated automatically when the object is created, but if noticed
    //There is no Setter for id! This is because we have set it to private and only provided a getter, we do not want anyone to change the id of a car, so we used encapsulation to add security and make it inaccessible
    System.out.println(carService.delete(car2, carList).toString());

    //Now lets use the other delete method to delete another car by id, this is another example of polymorphism as the method is overloaded meaning it has the same name but different signature/return type
    System.out.println(carService.delete(car3.getId(), carList).toString());

    //Notice how all the responses we got back had a property called errors and messages? Well if you look at the code, you can see that this is because it extends the ResponseBase class which contains these fields
    //We did this because all responses need errors and messages, but not all response needed to return car, so by extending this base class, we are able to create unique responses without repeating the same things
    //This is an example of inheritance
  }
}

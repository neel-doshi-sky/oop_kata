package uk.sky.kata.carDealershipOOP;

import java.util.ArrayList;
import java.util.List;
import uk.sky.kata.carDealershipOOP.model.Car;


public class CarDealershipApp {

  public static void main(String[] args) {


    //This will be our car database - empty list of cars
    List<Car> carList = new ArrayList<>();

    System.out.println("OOP Example App");

    //Comment below code out to see if your code does what it needs to!

    //notice here we can create a new object using the Impl but can create a type of CarService
//    CarService carService = new CarServiceImpl();


//        Car car = new Car("Mercedes", "C class");
//
//
//        System.out.println(carService.create(car, carList).toString());
//
//
//        Car car2 = new Car("BMW", "1 series");
//        Car car3 = new Car("Audi", "A3");
//        Car car4 = new Car("Toyota", "Yaris");
//        System.out.println(carService.create(List.of(car2, car3, car4), carList).toString());
//
//
//        System.out.println(carService.get(carList).getCarList().toString());
//
//
//        System.out.println(carService.delete(car2, carList).toString());
//
//
//        System.out.println(carService.delete(car3.getId(), carList).toString());

  }

}


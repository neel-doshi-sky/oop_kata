package uk.sky.kata.fundamentals.abstraction.interfaces;

import uk.sky.kata.fundamentals.abstraction.interfaces.impl.CarServiceImpl;
import uk.sky.kata.fundamentals.abstraction.interfaces.impl.NewCarServiceImpl;
import uk.sky.kata.fundamentals.inheritance.Car;

public class AbstractionCar {

    public static void main(String[] args) {


        CarServiceImpl carService = new CarServiceImpl();
        carService.create(new Car());
        carService.delete("efef");





    }
}

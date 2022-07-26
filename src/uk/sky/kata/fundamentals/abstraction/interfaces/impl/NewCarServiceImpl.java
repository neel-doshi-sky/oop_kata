package uk.sky.kata.fundamentals.abstraction.interfaces.impl;

import uk.sky.kata.fundamentals.abstraction.interfaces.CarService;
import uk.sky.kata.fundamentals.inheritance.Car;

public class NewCarServiceImpl implements CarService {
    @Override
    public Car create(Car car) {
        Car car1 = new Car();
        car.setBrand("sakfhsdkfds");
        return car1;
    }

    @Override
    public String delete(String id) {
        return null;
    }

    @Override
    public Car update(Car car) {
        return null;
    }

    @Override
    public Car get(String id) {
        return null;
    }
}

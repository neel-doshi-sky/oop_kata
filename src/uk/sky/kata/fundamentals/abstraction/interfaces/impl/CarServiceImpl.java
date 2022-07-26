package uk.sky.kata.fundamentals.abstraction.interfaces.impl;

import uk.sky.kata.fundamentals.abstraction.interfaces.CarService;
import uk.sky.kata.fundamentals.inheritance.Car;

public class CarServiceImpl implements CarService {
    @Override
    public Car create(Car car) {
        System.out.println("Created car");
        return car;
    }

    @Override
    public String delete(String id) {
        return "Deleted Car";
    }

    @Override
    public Car update(Car car) {
        return car;
    }

    @Override
    public Car get(String id) {
        return new Car();
    }
}

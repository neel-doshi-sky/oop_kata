package uk.sky.kata.fundamentals.abstraction.interfaces;

import uk.sky.kata.fundamentals.inheritance.Car;

public interface CarService {

    Car create(Car car);

    String delete(String id);

    Car update(Car car);

    Car get(String id);
}

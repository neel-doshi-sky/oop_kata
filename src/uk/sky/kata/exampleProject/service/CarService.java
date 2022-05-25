package uk.sky.kata.exampleProject.service;

import java.util.List;
import uk.sky.kata.exampleProject.model.Car;
import uk.sky.kata.exampleProject.response.CreateUpdateMultipleResponse;
import uk.sky.kata.exampleProject.response.CreateUpdateResponse;
import uk.sky.kata.exampleProject.response.ListResponse;
import uk.sky.kata.exampleProject.response.ResponseBase;

/**
 * This is an example of abstraction
 * This creates a contract with the class that implements this, so that all the methods below need to be
 * implemented otherwise it will error
 */
public interface CarService {

  CreateUpdateResponse create(Car car, List<Car> carList);

  /**
   * Notice how this method has the same name as the one above it? This is polymorphism! We have the same method essentially that behaves differently to different situations
   */
  CreateUpdateMultipleResponse create(List<Car> carsToAdd, List<Car> carList);

  ResponseBase delete(Car car, List<Car> carList);

  /**
   * This is another example of polymorphism as the method above has the same name as this but the differences is with the signature and return type
   * So now the user has multiple selections for the same task
   */
  ResponseBase delete(String id, List<Car> carList);

  ListResponse get(List<Car> carList);
}
package uk.sky.kata.exampleProject.service;

import java.util.List;
import uk.sky.kata.exampleProject.model.Car;
import uk.sky.kata.exampleProject.response.CreateMultipleResponse;
import uk.sky.kata.exampleProject.response.CreateResponse;
import uk.sky.kata.exampleProject.response.ListResponse;
import uk.sky.kata.exampleProject.response.ResponseBase;

/**
 * This is an example of abstraction
 * This creates a contract with the class that implements this, that all the methods below need to be
 * implemented otherwise it will error and not compile, also this is readable code to show what a method will do and return
 * without giving away the implementation - also allows different versions of the same method in the event things change
 */
public interface CarService {

  CreateResponse create(Car car, List<Car> carList);

  /**
   * Notice how this method has the same name as the one above it? This is polymorphism! We have the same method essentially that behaves differently to different situations
   */
  CreateMultipleResponse create(List<Car> carsToAdd, List<Car> carList);

  ResponseBase delete(Car car, List<Car> carList);

  /**
   * This is another example of polymorphism as the method above has the same name as this but the differences is with the signature and return type
   * So now the user has multiple selections for the same task
   */
  ResponseBase delete(String id, List<Car> carList);

  ListResponse get(List<Car> carList);
}

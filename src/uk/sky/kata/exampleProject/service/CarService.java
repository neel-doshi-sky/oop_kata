package uk.sky.kata.exampleProject.service;

import uk.sky.kata.exampleProject.model.Car;
import uk.sky.kata.exampleProject.response.CreateUpdateResponse;
import uk.sky.kata.exampleProject.response.ListResponse;
import uk.sky.kata.exampleProject.response.ResponseBase;

public interface CarService {

  CreateUpdateResponse createCar(Car car);

  ResponseBase deleteCar(Car car);

  ResponseBase deleteCar(String id);

  ListResponse getCars();
}

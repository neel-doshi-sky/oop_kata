package uk.sky.kata.exampleProject.service.impl;

import java.util.List;
import uk.sky.kata.exampleProject.model.Car;
import uk.sky.kata.exampleProject.response.CreateUpdateResponse;
import uk.sky.kata.exampleProject.response.ListResponse;
import uk.sky.kata.exampleProject.response.ResponseBase;
import uk.sky.kata.exampleProject.service.CarService;

public class CarServiceImpl implements CarService {
  @Override
  public CreateUpdateResponse createCar(Car car) {
    CreateUpdateResponse response = new CreateUpdateResponse();
    response.setCreatedCar(car);
    response.setMessages("Created car");
    return response;
  }

  @Override
  public ResponseBase deleteCar(Car car) {
    ResponseBase responseBase = new ResponseBase();
    responseBase.setMessages("deleted car");
    return responseBase;
  }

  @Override
  public ResponseBase deleteCar(String id) {
    ResponseBase responseBase = new ResponseBase();
    responseBase.setMessages("Deleted car with id: " + id);
    return responseBase;
  }

  @Override
  public ListResponse getCars() {
    ListResponse listResponse = new ListResponse();
    Car car = new Car("Mercedes", "C class");
    Car car2 = new Car("BMW", "1 series");
    Car car3 = new Car("Vauxhall", "Corsa");
    Car car4 = new Car("Tesla", "Model S");
    listResponse.setCarList(List.of(car,car2,car3,car4));
    listResponse.setMessages("Successfully fetched cars");
    return listResponse;
  }
}

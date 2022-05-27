package uk.sky.kata.carDealershipOOP.service.impl;

import java.util.List;
import uk.sky.kata.carDealershipOOP.model.Car;
import uk.sky.kata.carDealershipOOP.response.CreateMultipleResponse;
import uk.sky.kata.carDealershipOOP.response.CreateResponse;
import uk.sky.kata.carDealershipOOP.response.ListResponse;
import uk.sky.kata.carDealershipOOP.response.ResponseBase;
import uk.sky.kata.carDealershipOOP.service.CarService;

/**
 * This method implements the CarService interface, it is now contractually obliged to implement the methods defined
 * If a method is missing, there will be a compile error
 */
public class CarServiceImpl implements CarService {

  @Override
  public CreateResponse create(Car car, List<Car> carList) {
    carList.add(car);
    CreateResponse response = new CreateResponse();
    response.setCreatedCar(car);
    //Notice that because CreateResponse extends BaseResponse, we have access to messages and errors, and we can assign them here as needed
    response.setMessages("Created car");
    return response;
  }

  @Override
  public CreateMultipleResponse create(List<Car> carsToAdd, List<Car> carList) {
    carList.addAll(carsToAdd);
    CreateMultipleResponse response = new CreateMultipleResponse();
    response.setCarsUpdatedList(carsToAdd);
    response.setMessages("Created cars");
    return response;
  }

  @Override
  public ResponseBase delete(Car car, List<Car> carList) {
    carList.remove(car);
    ResponseBase responseBase = new ResponseBase();
    responseBase.setMessages("deleted car");
    return responseBase;
  }

  @Override
  public ResponseBase delete(String id, List<Car> carList) {
    carList.removeIf(car -> car.getId().equalsIgnoreCase(id));
    ResponseBase responseBase = new ResponseBase();
    responseBase.setMessages("Deleted car with id: " + id);
    return responseBase;
  }

  @Override
  public ListResponse get(List<Car> carList) {
    ListResponse listResponse = new ListResponse();
    listResponse.setCarList(carList);
    listResponse.setMessages("Successfully fetched cars");
    return listResponse;
  }
}

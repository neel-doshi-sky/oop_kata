package uk.sky.kata.exampleProject.response;

import java.util.ArrayList;
import java.util.List;
import uk.sky.kata.exampleProject.model.Car;

public class ListResponse extends ResponseBase{
  private List<Car> carList = new ArrayList<>();

  public List<Car> getCarList() {
    return carList;
  }

  public void setCarList(List<Car> carList) {
    this.carList = carList;
  }
}

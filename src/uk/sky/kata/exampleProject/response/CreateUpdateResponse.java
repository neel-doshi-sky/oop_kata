package uk.sky.kata.exampleProject.response;

import uk.sky.kata.exampleProject.model.Car;

public class CreateUpdateResponse extends ResponseBase{
  private Car createdCar;

  public Car getCreatedCar() {
    return createdCar;
  }

  public void setCreatedCar(Car createdCar) {
    this.createdCar = createdCar;
  }
}

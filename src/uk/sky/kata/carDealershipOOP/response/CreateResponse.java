package uk.sky.kata.carDealershipOOP.response;

import uk.sky.kata.carDealershipOOP.model.Car;

/**
 * As this class extends ResponseBase, it inherits all the methods and properties and has access to it as well
 */
public class CreateResponse extends ResponseBase{
  private Car createdCar;

  public Car getCreatedCar() {
    return createdCar;
  }

  public void setCreatedCar(Car createdCar) {
    this.createdCar = createdCar;
  }

  /**
   * By calling 'super', we refer to the parent class and execute the code in the original class
   * So here, we call the toString method from ResponseBase and then add what we need at the end
   * @return
   */
  @Override
  public String toString() {
    return
        super.toString() +
        " createdCar= " + createdCar;

  }
}

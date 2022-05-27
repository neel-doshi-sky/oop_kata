package uk.sky.kata.exampleProject.response;

import java.util.ArrayList;
import java.util.List;
import uk.sky.kata.exampleProject.model.Car;

/**
 * As this class extends ResponseBase, it inherits all the methods and properties and has access to it as well
 */
public class ListResponse extends ResponseBase{

  private List<Car> carList = new ArrayList<>();

  public List<Car> getCarList() {
    return carList;
  }

  public void setCarList(List<Car> carList) {
    this.carList = carList;
  }

  /**
   * By calling 'super', we refer to the parent class and execute the code in the original class
   * So here, we call the toString method from ResponseBase and then add what we need at the end
   * @return
   */
  @Override
  public String toString() {
    return
        super.toString() + " carList= " + carList;
  }
}

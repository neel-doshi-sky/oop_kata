package uk.sky.kata.exampleProject.response;

import java.util.ArrayList;
import java.util.List;
import uk.sky.kata.exampleProject.model.Car;

/**
 * As this class extends ResponseBase, it inherits all the methods and properties and has access to it as well
 */
public class CreateUpdateMultipleResponse extends ResponseBase {

  List<Car> carsUpdatedList = new ArrayList<>();

  public List<Car> getCarsUpdatedList() {
    return carsUpdatedList;
  }

  public void setCarsUpdatedList(List<Car> carsUpdatedList) {
    this.carsUpdatedList = carsUpdatedList;
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
            " carsCreatedList= " + carsUpdatedList;
  }
}

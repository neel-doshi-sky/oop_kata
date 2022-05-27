package uk.sky.kata.carDealershipOOP.model;

/**
 * This class represents the blueprint for creating a car object
 */
public class Car {

  private String brand;
  private String model;

  /**
   * This is the constructor we have provided, so when we create a new car, we must provide the below as parameters
   * @param brand the brand of the car
   * @param model tne model of the car
   */
  public Car(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

}

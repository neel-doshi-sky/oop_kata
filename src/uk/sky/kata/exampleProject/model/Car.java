package uk.sky.kata.exampleProject.model;

import java.util.UUID;

public class Car {

  private String id;
  private String brand;
  private String model;

  /**
   * Notice we have only got one constructor which tells Java how to build this object,
   * in this constructor, we generate an id, this code gets executed everytime an object is created
   */
  public Car(String brand, String model) {
    id = UUID.randomUUID().toString();
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

  /**
   * Notice here that we have only provided a getter for id, we have not added a setter because we want to protect this field and now allow anyone to change it
   * This is an example of encapsulation as we are restricting access to this variable by making it private and only accessible via a getter
   */
  public String getId() {
    return id;
  }

  @Override
  public String toString() {
    return " {" +
        "id='" + id + '\'' +
        ", brand='" + brand + '\'' +
        ", model='" + model + '\'' +
        '}';
  }
}

package uk.sky.kata.exampleProject.model;

import java.util.UUID;

public class Car {
  private String id;
  private String brand;
  private String model;

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

  public String getId() {
    return id;
  }
}

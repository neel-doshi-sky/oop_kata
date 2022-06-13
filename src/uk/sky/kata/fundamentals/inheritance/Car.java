package uk.sky.kata.fundamentals.inheritance;

public class Car {

  private String brand;
  private String make;
  private String model;

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void startEngine(){
    System.out.println("Starting engine");
  }

  public void accelerateForward(){
    System.out.println("Moving forward");
  }

  public void brake(){
    System.out.println("Braking");
  }

  public void reverse(){
    System.out.println("Reversing");
  }

  public void steerLeft(){
    System.out.println("Steering left");
  }

  public void steerRight(){
    System.out.println("Steering right");
  }
}

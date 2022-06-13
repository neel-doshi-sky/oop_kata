package uk.sky.kata.fundamentals.inheritance;

/**
 * This method extends Car therefore has access to all properties and methods within the Car class, but also can add its own
 */
public class AutomaticCar extends Car {
  private String mode;
  private boolean brakePressed;

  @Override
  public void startEngine() {
    System.out.println("Pressing start button");
    super.startEngine();
  }

  @Override
  public void accelerateForward() {
    if (mode.equals("D")) {
      super.accelerateForward();
    } else if (mode.equals("N")) {
      System.out.println("You are in neutral!");
    } else if (mode.equals("R")) {
      System.out.println("You are in reverse!");
    }
  }

  public void changeMode(String modeToChangeTo) {
    if (brakePressed) {
      mode = modeToChangeTo;
      System.out.println("Shifted to: " + mode);
    } else {
      System.out.println("brake needs to be pressed");
    }
  }

  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public boolean isBrakePressed() {
    return brakePressed;
  }

  public void setBrakePressed(boolean brakePressed) {
    this.brakePressed = brakePressed;
  }
}
